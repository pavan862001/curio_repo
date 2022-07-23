package com.curio.service;

import org.springframework.stereotype.Service;

import com.curio.model.Admin;

@Service
public interface AdminService {
	
	public Admin saveAdminData(Admin admin);
	

}
