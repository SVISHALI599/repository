package com.example.main;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

	PatientMapper patientmapper;

	public PatientController(PatientMapper mapper) {
		this.patientmapper = mapper;
	}

	@GetMapping("/allpatients")

	public List<Patient> getAllPatient() {
		return patientmapper.getAllPatient();
	}

	@GetMapping("/patientid")

	public Patient getPatientById(@RequestParam("id") int id) {
		return patientmapper.getPatientById(id);
	}
	@GetMapping("/insertpatient")
	public Patient setPatient(@RequestParam("pk_patient_id") int pk_patient_id, @RequestParam("fk_user_id") int fk_user_id,@RequestParam("patient_disease") String patient_disease)
	{
		return patientmapper.setPatient();
	}
}
