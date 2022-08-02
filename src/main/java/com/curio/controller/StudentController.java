package com.curio.controller;

import com.curio.model.Student;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

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

public class StudentController {
	

	@PostMapping("/home")
	public Object demoMethod(@RequestBody @Valid Student student) {

		System.out.println(student);

		return student;
	}
	@PostMapping("/student")
	public ModelAndView saveStudent(@ModelAttribute Student student) {

		System.out.println(student);
		ModelAndView s1 = new ModelAndView();
		s1.setViewName("Student-data");
		s1.addObject("student",student);
		return s1;
	}

	@GetMapping("/home/{id}")
	public int getID(@PathVariable int id) {

		// processor code will come here if any
		return id;
	}
	
	@GetMapping("/findStudent")
	public ResponseEntity<List<Student>> findAll(){
		
		Student s1 = new Student();
		Student s2 = new Student();
		s1.setInt_id(128);
		s1.setStudentName("naveen");
		s1.setStream("IT");
		s1.setEmail("naveen@gmail.com");
		s1.setPhoneno("8297479956");
		s1.setCollegename("Nizam college hyderabad");
		s1.setGender("Male");
		s1.setAddress("hyderabad");
		s2.setInt_id(129);
		s2.setStudentName("nithin");
		s2.setStream("MECH");
		s2.setEmail("nithin@gmail.com");
		s2.setPhoneno("1234567890");
		s2.setCollegename("Nizam college hyderabad");
		s2.setGender("male");
		s2.setAddress("hyderabad");
		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		return new ResponseEntity<List<Student>>(list, HttpStatus.OK);
		
	}
	@GetMapping("/findStudent1")
	public List<Object> findAll1(){
		
		Student s1 = new Student();
		Student s2 = new Student();
		s1.setInt_id(121);
		s1.setStudentName("Pawan");
		s1.setStream("IT");
		s1.setEmail("pavan@gmail.com");
		s1.setPhoneno("8297479956");
		s1.setCollegename("Nizam college hyderabad");
		s1.setGender("Male");
		s1.setAddress("hyderabad");
		s2.setInt_id(122);
		s2.setStudentName("Shirsha");
		s2.setStream("MECH");
		s2.setEmail("shirisha@gmail.com");
		s2.setPhoneno("1234567890");
		s2.setCollegename("Nizam college hyderabad");
		s2.setGender("Female");
		s2.setAddress("hyderabad");
		List<Object> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		return list;
		
	}

}