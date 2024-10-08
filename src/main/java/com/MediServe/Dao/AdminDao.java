package com.MediServe.Dao;

import com.MediServe.entity.Admin;
import com.MediServe.entity.Doctor;

public interface AdminDao {

	Doctor addDoctor(Doctor doctor);

	Admin loginAdmin(Admin admin);

}
