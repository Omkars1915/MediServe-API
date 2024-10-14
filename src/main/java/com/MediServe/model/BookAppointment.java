package com.MediServe.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BookAppointment {
	
	private Long id;
	
	private String date;
 	
 	private String time;
 	
 	private String description;
 	
 	private String medicines;
 	
 	private Long patient_id;
 	
 	private Long doctor_id;
	

}
