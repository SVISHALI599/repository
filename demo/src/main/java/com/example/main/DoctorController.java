package com.example.main;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

	DoctorMapper doctormapper;

	public DoctorController(DoctorMapper mapper) {
		this.doctormapper = mapper;
	}

	@GetMapping("/alldoctors")

	public List<Doctor> getAllDoctor() {
		return doctormapper.getAllDoctor();
	}

	@GetMapping("/doctorid")

	public Doctor getDoctorById(@RequestParam("id") int id) {
		return doctormapper.getDoctorById(id);
	}
	@GetMapping("/insertdoctor")
	public Doctor setDoctor(@RequestParam("pk_doctor_id") int pk_doctor_id, @RequestParam("fk_user_id") int fk_user_id,@RequestParam("doctor_specialization") String doctor_specialization,@RequestParam("doctor_experience") int doctor_experience)
	{
		return doctormapper.setDoctor();
	}
}
