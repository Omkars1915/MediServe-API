package com.MediServe.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Appointment {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 	
	 	private String date;
	 	
	 	private String time;
	 	
	 	private String description;
	 	
	 	private String medicines;
	 	
	 	@ManyToOne
	 	@JoinColumn(name="patient_id")
	 	private Patient patient;
	 	
	 	@ManyToOne
	 	@JoinColumn(name="doctor_id")
	 	private Doctor doctor;
	 	
	 	

}
