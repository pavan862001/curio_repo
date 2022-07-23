package com.curio.controller;
import com.curio.model.Internship;
import com.curio.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.aspectj.lang.Aspects14;
import org.hibernate.criterion.AggregateProjection;
import org.springframework.data.relational.core.sql.SQL;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class InternshipController {
	@PostMapping("/Ihome")
	public Object idemoMethod(@RequestBody @Valid Internship internship) {
	System.out.println(internship);
	return internship;
	}
	@PostMapping("/iship")
	public ModelAndView saveInternship(@ModelAttribute Internship internship ) {
		System.out.println(internship);
		ModelAndView i1=new ModelAndView();
		i1.setViewName("Internship-data");
		i1.addObject("internship", internship);
		return i1;
	}
	@GetMapping("/Ihome/{id}")
	public int getID(@PathVariable int id) {

		// processor code will come here if any
		return id;
	}
	@GetMapping("/findInternship")
	public ResponseEntity<List<Internship>> findAll(){
		
		Internship i1 = new Internship();
		//Internship i2 = new Internship();
		i1.setId(128);
		i1.setR_id(121);
		i1.setIc_id(126);
		i1.setTitle("sample Internship");
		i1.setExpReq("freshers");
		i1.setEduReq("graduation");
		i1.setI_role("trainee");
		i1.setI_stipend(20000l);
		i1.setI_address("hyderabad");
		i1.setI_vacancy(50);
		i1.setI_lastDate("30-07-2022");
		i1.setI_category("IT");
		List<Internship> list = new ArrayList<>();
		list.add(i1);
		//list.add(i2);
		return new ResponseEntity<List<Internship>>(list, HttpStatus.OK);
		
	}
	
}
