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
public class Internship {
	
	@Id
	private Integer id;
	
	private Integer R_id;
	
	private Integer Ic_id;
	
	private String title;
	
	private String expReq;
	
	private String eduReq;
	
	private String I_role;
	
	private Long I_stipend;
	
	private String I_address;
	
	private Integer I_vacancy;
	
	private String I_lastDate;
	
	private String I_category;
	
	
}