package com.MediServe.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MediServe.Service.PatientService;
import com.MediServe.entity.Patient;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/patient")
public class PatientController {
	
	@Autowired
	private PatientService patientservice;
	
	@PostMapping("/add-patient")
	public ResponseEntity<Integer> addPatient(@RequestBody Patient patient) {
		Patient addpatient=patientservice.addPatient(patient);
		if (addpatient != null) {
			return new ResponseEntity<Integer>(1, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<Integer>(3, HttpStatus.OK);
		} 
	}
	
	@GetMapping("/getallpatients")
	public List<Patient> getallpatients(){
		return patientservice.getallpatients();
	}

	@GetMapping("get-patient-by-id/{id}")
	public Patient getPatientbyid(@PathVariable long id) {
		return patientservice.getpatientbyid(id);
	}
	
	@DeleteMapping("delete-patient-by-id/{id}")
	public Patient deletepatientbyid(@PathVariable long id) {
		return patientservice.deletepatientbyid(id);
	}
	
}
