package com.curio.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.curio.model.InternshipApplication;

@RestController 
public class InternshipApplicationController {

	@PostMapping("/iahome")
	public Object demoMethod(@RequestBody @Valid InternshipApplication  internshipApplication ) {

		System.out.println(internshipApplication);

		return internshipApplication;
	}
	@PostMapping("/interApp")
	public ModelAndView saveInternshipApplication (@ModelAttribute InternshipApplication  internshipApplication) {

		System.out.println(internshipApplication);
		ModelAndView s1 = new ModelAndView();
		s1.setViewName("InternshipApplication-data");
		s1.addObject("InternshipApplication",internshipApplication);
		return s1;
	}

}
