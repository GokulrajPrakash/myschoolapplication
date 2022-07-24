package com.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repository.StudentRepository;

@Service

public class studentserviceimp implements StudentService1 {

	
	
	@Override
	public String saveStudent(Student student) {
			
		if(student != null)
		{
			return "student is saved successfully";
		}
		else
		{
			return "student is not saved";
		}
	
	}

}
