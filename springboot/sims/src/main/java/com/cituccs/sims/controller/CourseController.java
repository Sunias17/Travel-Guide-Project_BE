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

import com.cituccs.sims.Entity.CourseEntity;
import com.cituccs.sims.Service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	CourseService cserv;
	
	@GetMapping("/print")
	public String printHelloWorld() {
		return "Hello, World!";
	}
	
	@PostMapping("/postCourse")
	public CourseEntity insertCourse(@RequestBody CourseEntity course) {
		return cserv.insertCourse(course);
	}
	
	@GetMapping("/displayAllCourses")
	public List<CourseEntity> getAllCourses(){
		return cserv.getAllCourses();
	}
	
	@GetMapping("/getByCode")
	public CourseEntity findByCode(@RequestParam String code) {
		return cserv.findByCode(code);
	}
	
	@PutMapping("/putCourse")
	public CourseEntity putCourse(@RequestParam int courseid,@RequestBody CourseEntity newCourseDetails) throws Exception{
		return cserv.putCourse(courseid, newCourseDetails);
	}
	
	@DeleteMapping("/deleteCourse/{courseid}")
	public String deleteCourse(@PathVariable int courseid){
		return cserv.deleteCourse(courseid);
	}
}
