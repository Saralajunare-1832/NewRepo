package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.model.Student;
import com.service.StudentService;

@RestController 
public class StudentController {
	   
	   
	@Autowired    
	private StudentService stdService;

	@RequestMapping("/") //@GetMapping   
	public List<Student> getAllStudent()  
	{    
	return stdService.getAllStudent();    
	}


	@RequestMapping(value="/add-student", method=RequestMethod.POST)//@PostMapping    
	public String addStudent(@RequestBody Student student)  
	{    
	stdService.addstudent(student);  
	return "Added successfully...";
	} 
	@GetMapping("/Student/{id}")
	public Student getstudent(@PathVariable("id") int id)
	{
		return stdService.getStudentbyId(id);
	}
	@DeleteMapping("/Student/{id}")
	public Boolean deleteStudentbyId(@PathVariable("id")int id)
	{
		stdService.deleteStudentbyId(id);

		return true;
	}
	@PutMapping("/Student/{id}")
	public Student updateStudentbyId(@RequestBody Student std ,@PathVariable("id")int id)
	{
		 return stdService.updateStudentbyId(std,id);
	}
	
	
	
	}    

