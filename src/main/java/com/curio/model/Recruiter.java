package com.curio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity 
@Data
@NoArgsConstructor 
@AllArgsConstructor 
@ToString 
public class Recruiter {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer r_id;
	@NotNull 
	private String r_fullname;
	@NotNull 
	private String r_username;
	@NotNull 
	private String r_password;
	
	private String r_companyName;
	
	private Integer r_companyId;
	
	private String r_phoneNo;
	
	private String r_address;
	@Email 
	private String r_email;
	
	
	

}
