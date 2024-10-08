package com.MediServe.Service;

import com.MediServe.entity.Admin;
import com.MediServe.entity.Doctor;

public interface AdminService {

	Doctor addDoctor(Doctor doctor);

	Admin loginAdmin(Admin admin);

}
