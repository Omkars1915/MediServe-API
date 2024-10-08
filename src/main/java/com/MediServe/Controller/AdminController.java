package com.MediServe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MediServe.Service.AdminService;
import com.MediServe.entity.Admin;
import com.MediServe.entity.Doctor;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminService adminservice;
	
	@PostMapping("/login-admin")
	public Admin loginAdmin(@RequestBody Admin admin) {
		return adminservice.loginAdmin(admin);
	}
	
	@PostMapping("/add-doctor")
	public ResponseEntity<Integer> addDoctor(@RequestBody Doctor doctor) {
		Doctor registerdoctor=adminservice.addDoctor(doctor) ;
		if (registerdoctor != null) {
			return new ResponseEntity<Integer>(1, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<Integer>(3, HttpStatus.OK);
		}
	}
	
	
}
