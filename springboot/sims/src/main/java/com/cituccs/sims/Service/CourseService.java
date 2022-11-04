package com.cituccs.sims.Service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cituccs.sims.Entity.CourseEntity;
import com.cituccs.sims.Repository.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	CourseRepository crepo;
	
	public CourseEntity putCourse(int courseid, CourseEntity newCourseDetails) throws Exception{
		CourseEntity course = new CourseEntity();
		
		try {
			course = crepo.findById(courseid).get();
			course.setCode(newCourseDetails.getCode());
			course.setDescription(newCourseDetails.getDescription());
			course.setUnit(newCourseDetails.getUnit());
			return crepo.save(course);
		}catch(NoSuchElementException nex) {
			throw new Exception("Course ID Number "+ courseid +" does not exist!");
		}
		
	}
	
	public String deleteCourse(int courseid) {
		String msg;
		if(crepo.findById(courseid) !=null) {
			crepo.deleteById(courseid);
			msg = "Course ID Number " + courseid + " is successfully deleted!";
		}else 
			msg = "Course ID Number " + courseid + " is NOT found!";
		
		return msg;
	}
	
	public CourseEntity insertCourse(CourseEntity course) {
		return crepo.save(course);
	}
	
	public List<CourseEntity> getAllCourses(){
		return crepo.findAll();
	}
	
	
	public CourseEntity findByCode(String code) {
		if(crepo.findByCode(code) !=null)
			return crepo.findByCode(code);
		else
			return null;
	}
}
