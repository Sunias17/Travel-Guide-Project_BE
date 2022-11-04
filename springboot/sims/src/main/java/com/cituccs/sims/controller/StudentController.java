package com.cituccs.sims.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cituccs.sims.Entity.StudentEntity;
import com.cituccs.sims.Service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService stserv;
	
	@GetMapping("/print")
	public String printHelloStudent() {
		return "Hello, Student!";
	}
	
	@PostMapping("/postStudent")
	public StudentEntity insertStudent(@RequestBody StudentEntity student) {
		return stserv.insertStudent(student);
	}
	
	@GetMapping("/displayAllStudent")
	public List<StudentEntity> getAllStudents(){
		return stserv.getAllStudents();
	}
	
	@GetMapping("/getByFirstname")
	public StudentEntity findByFirstname(@RequestParam String firstname) {
		return stserv.findByFirstname(firstname);
	}
	
	@PutMapping("/putStudent")
	public StudentEntity putStudent(@RequestParam int id,@RequestBody StudentEntity newStudentDetails) throws Exception{
		return stserv.putStudent(id, newStudentDetails);
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable int id){
		return stserv.deleteStudent(id);
	}
}