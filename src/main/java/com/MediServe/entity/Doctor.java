package com.MediServe.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Doctor {

    @Id
    private Long id;
    
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "specialization", nullable = false)
    private String specialization;

    @Column(name = "contact_number")
    private String contactNumber;
    
    @Column(name = "email", unique = true)
    private String email;
    
    @Column
    private String password;
    
    

}