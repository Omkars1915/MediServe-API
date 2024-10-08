package com.MediServe.entity;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Patient {

    @Id
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "dob", nullable = false)
    private Date dob;

    @Column(name = "gender")
    private String gender;

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "address")
    private String address;
    
    @Column
    private String password;

}