package com.curio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
public class InternshipApplication {
  
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ia_Id;
	
	private Integer Int_id;
	
	private Integer I_id;
	
	private String ia_status;
	
}
