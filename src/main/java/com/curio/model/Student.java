package com.curio.model;

import javax.persistence.Entity;
import javax.persistence.Id;


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
	private Integer id;
	
	private String studentName;
	
	private String stream;
	
	private String email;
	
	private String phoneno;
	
	private String collegename;
	
	private String gender;
	
	private String address;
	
	
}