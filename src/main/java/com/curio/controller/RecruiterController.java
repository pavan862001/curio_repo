package com.curio.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.curio.model.Recruiter;

@RestController 
public class RecruiterController {
	@PostMapping("/Rhome")
	public Object rdemoMethod(@RequestBody @Valid Recruiter recruiter) {
	System.out.println(recruiter);
	return recruiter;
	}
	@PostMapping("/Rship")
	public ModelAndView saveRecruiter(@ModelAttribute Recruiter recruiter ) {
		System.out.println(recruiter);
		ModelAndView i1=new ModelAndView();
		i1.setViewName("Recruiter-data");
		i1.addObject("recruiter", recruiter);
		return i1;
	}
	@GetMapping("/rhome/{id}")
	public int getID(@PathVariable int id) {

		// processor code will come here if any
		return id;
	}

}
