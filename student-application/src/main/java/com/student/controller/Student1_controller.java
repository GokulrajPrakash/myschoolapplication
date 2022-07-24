package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.service.studentservice1;

@RestController
@RequestMapping("/student")
public class Student1_controller {

	
	@Autowired
	studentservice1 studentService;
}
