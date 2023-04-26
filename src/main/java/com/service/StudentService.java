package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.model.Student;
import com.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired    
	private StudentRepository stdRepository;    
	public List<Student> getAllStudent()  
	{    
	List<Student>student = new ArrayList<>();    
	stdRepository.findAll().forEach(student::add);    
	return student;    
	}    
	public void addstudent(Student student)  
	{    
	stdRepository.save(student); 
	
	}
	public Student getStudentbyId(int id) {
		// TODO Auto-generated method stub
		return stdRepository.findById(id).get();
	}


	public void deleteStudentbyId(int id) {
		// TODO Auto-generated method stub
		stdRepository.deleteById(id);
	}


	public Student updateStudentbyId(Student std,int id) {
		// TODO Auto-generated method stub
		return stdRepository.save(std);
	}
	
	 
	}    

