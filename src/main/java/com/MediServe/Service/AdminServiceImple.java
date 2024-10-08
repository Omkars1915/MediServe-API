package com.MediServe.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MediServe.Dao.AdminDao;
import com.MediServe.entity.Admin;
import com.MediServe.entity.Doctor;
@Service
public class AdminServiceImple implements AdminService {
	
	@Autowired
	private AdminDao admindao;

	@Override
	public Doctor addDoctor(Doctor doctor) {
		
		return admindao.addDoctor(doctor);
	}

	@Override
	public Admin loginAdmin(Admin admin) {
		return admindao.loginAdmin(admin);
	}

}
