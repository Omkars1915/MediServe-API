package com.MediServe.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MediServe.Service.DoctorService;
import com.MediServe.entity.Doctor;
import com.MediServe.entity.Patient;
import com.MediServe.model.LoginRequest;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/doctor")
public class DoctorController {
	
	@Autowired
	private DoctorService doctorservice;
	
	@PostMapping("/login-doctor")
	public Doctor loginDoctor(@RequestBody Doctor request) {
	
		return doctorservice.loginDoctor(request);
	}
	
	@PostMapping("/add-patient")
	public ResponseEntity<Integer> addPatient(@RequestBody Patient patient) {
		Patient addpatient=doctorservice.addPatient(patient);
		if (addpatient != null) {
			return new ResponseEntity<Integer>(1, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<Integer>(3, HttpStatus.OK);
		} 
	}
}
