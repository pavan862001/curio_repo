package com.curio.model;

import javax.persistence.Entity;
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
public class Student {
	
	@Id
	
	private Integer Int_id;
	@NotNull 
	private String studentName;
	@NotNull  
	private String stream;
	@Email 
	private String email;
	@NotNull 
	private String phoneno;
	@NotNull 
	private String collegename;
	@NotNull 
	private String gender;
	@NotNull 
	private String address;
	
	
}