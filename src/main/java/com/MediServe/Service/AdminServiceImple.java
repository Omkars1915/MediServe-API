package com.MediServe.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MediServe.Dao.AdminDao;
import com.MediServe.entity.Admin;
@Service
public class AdminServiceImple implements AdminService {
	
	@Autowired
	private AdminDao admindao;



	@Override
	public Admin loginAdmin(Admin admin) {
		return admindao.loginAdmin(admin);
	}


}
