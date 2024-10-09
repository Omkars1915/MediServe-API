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

import com.MediServe.Service.DoctorService;
import com.MediServe.entity.Doctor;


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
	
	@PostMapping("/add-doctor")
	public ResponseEntity<Integer> addDoctor(@RequestBody Doctor doctor) {
		Doctor registerdoctor=doctorservice.addDoctor(doctor) ;
		if (registerdoctor != null) {
			return new ResponseEntity<Integer>(1, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<Integer>(3, HttpStatus.OK);
		}
	}
	
	@DeleteMapping("delete-doctor/{id}")
	public Doctor deletedoctorbyid(@PathVariable long id) {
		return doctorservice.deletedoctorbyid(id);
	}
	

	@GetMapping("get-all-doctors")
	public List<Doctor> getalldoctors(){
		return doctorservice.getalldoctors();
	}
	
}
