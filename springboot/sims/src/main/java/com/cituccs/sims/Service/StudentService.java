package com.cituccs.sims.Service;

import java.util.List;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cituccs.sims.Entity.StudentEntity;
import com.cituccs.sims.Repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository srepo;
	
	public StudentEntity putStudent(int id, StudentEntity newStudentDetails) throws Exception{
		StudentEntity student = new StudentEntity();
		
		try {
			student = srepo.findById(id).get();
			student.setCourse(newStudentDetails.getCourse());
			student.setYearlevel(newStudentDetails.getYearlevel());
			return srepo.save(student);
		}catch(NoSuchElementException nex) {
			throw new Exception("ID Number "+ id +" does not exist!");
		}
		
	}
	
	public String deleteStudent(int id) {
		String msg;
		if(srepo.findById(id) !=null) {
			srepo.deleteById(id);
			msg = "Student ID Number " + id + " is successfully deleted!";
		}else 
			msg = "Student ID Number " + id + " is NOT found!";
		
		return msg;
	}
	
	public StudentEntity insertStudent(StudentEntity student) {
		return srepo.save(student);
	}
	
	public List<StudentEntity> getAllStudents(){
		return srepo.findAll();
	}
	
	
	public StudentEntity findByFirstname(String firstname) {
		if(srepo.findByFirstname(firstname) !=null)
			return srepo.findByFirstname(firstname);
		else
			return null;
	}

}
