package com.curio.controller;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curio.model.Admin;
import com.curio.repo.AdminRepo;
import com.curio.service.AdminService;

@RestController
public class AdminContoller {
	
	@Autowired
	AdminService adminService;
	@Autowired
	AdminRepo adminRepo;
	
	@GetMapping("/admin")
	public String addAdmin() {
		
		Admin admin = new Admin();
		admin.setEmail("Hello@gmail.com");
		admin.setPassoword(hashPassword("Admin123"));
		adminService.saveAdminData(admin);
		Admin findById = adminRepo.SearchByEmail("Hello@gmail.com");
		
		checkPass("Admin123",findById.getPassoword());
		return "admin addded";
		
	}
	
	
	private String hashPassword(String plainTextPassword){
		return BCrypt.hashpw(plainTextPassword, BCrypt.gensalt());
	}
	
	private void checkPass(String plainPassword, String hashedPassword) {
		if (BCrypt.checkpw(plainPassword, hashedPassword))
			System.out.println("The password matches.");
		else
			System.out.println("The password does not match.");
	}
	
	
}
