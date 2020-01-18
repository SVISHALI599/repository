
package controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.Doctor;
import service.DoctorService;

@RestController
public class DoctorController {

	DoctorService doctorservice;

	public DoctorController(DoctorService doctorservice) {
		this.doctorservice = doctorservice;
	}

	@GetMapping("/alldoctors")

	public List<Doctor> getAllDoctor() {
		return doctorservice.getAllDoctor();
	}

	@GetMapping("/doctorid/{id}")

	public Doctor getDoctorById(@PathParam("id") int id) {
		return doctorservice.getDoctorById(id);
	}

	@PostMapping("/createDoctor")
	public ResponseEntity<Integer> createPatient(@RequestBody Doctor doctor) {
		int noRowsAffected = doctorservice.setDoctor(doctor);
		return ResponseEntity.status(HttpStatus.OK).body(noRowsAffected);

	}

	@PutMapping("/deletedoctor/{pk_user_id}")
	public int deleteDoctor(@PathParam("pk_user_id") int pk_user_id) {
		return doctorservice.deleteDoctor(pk_user_id);
	}

	@PutMapping("/updatePatient")
	public ResponseEntity<Integer> updatePatient(@RequestBody Doctor doctor) {
		int status = doctorservice.updateDoctor(doctor);
		return ResponseEntity.status(HttpStatus.OK).body(status);

	}
}
