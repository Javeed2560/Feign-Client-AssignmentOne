package com.javeed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.javeed.model.Student;
import com.javeed.repository.StudentRepository;

public class StudentController {
	
	@Autowired
	StudentRepository studentRepo;
	
	@PostMapping("/student")
	Student addStudent(@RequestBody Student student) {
		return studentRepo.save(student);
	}
	
	@GetMapping("/student")
	List<Student> getAllStudent() {
		return studentRepo.findAll();
	}
	
	@PutMapping("/student")
	Student updateStudent(@RequestBody Student student) {
		return studentRepo.save(student);
	}
	
	@DeleteMapping("/student/{id}")
	String deleteStudentById(@PathVariable Long id) {
		studentRepo.deleteById(id);
		return "Deleted Successfully";
	}


}
