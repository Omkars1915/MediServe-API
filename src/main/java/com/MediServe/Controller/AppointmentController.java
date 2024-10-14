package com.MediServe.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MediServe.Service.AppointmentService;
import com.MediServe.entity.Appointment;
import com.MediServe.model.BookAppointment;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/appointment")
public class AppointmentController {
	
	@Autowired
	private AppointmentService appointmentservice;
	
	@PostMapping("/bookappointment")
	public ResponseEntity<Integer> bookAppointment(@RequestBody BookAppointment bookappoint){
		BookAppointment book=appointmentservice.bookappoint(bookappoint) ;
		if ( book != null) {
			return new ResponseEntity<Integer>(1, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<Integer>(3, HttpStatus.OK);
		}
	}
	
	@GetMapping("getappointments")
	public List<Appointment> getappintments(){
		return appointmentservice.getappointments();
	}

}
