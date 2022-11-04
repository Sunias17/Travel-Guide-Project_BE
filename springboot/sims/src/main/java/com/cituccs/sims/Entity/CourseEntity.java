package com.cituccs.sims.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="tbl_course")
public class CourseEntity {

	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int courseid;
	
	private String code;
	private String description;
	private int unit;
	
	
	@ManyToOne
	@JoinColumn(name="id")
	StudentEntity student;
	
	public CourseEntity() {}


	public CourseEntity(int courseid, String code, String description, int unit, StudentEntity student) {
		super();
		this.courseid = courseid;
		this.code = code;
		this.description = description;
		this.unit = unit;
		this.student = student;
	}


	public int getCourseid() {
		return courseid;
	}

	/*public void setCourseid(int courseid) {
		this.courseid = courseid;
	}*/

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	
	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}
	
	

	public StudentEntity getStudent() {
		return student;
	}


	public void setStudent(StudentEntity student) {
		this.student = student;
	}


	@Override
	public String toString() {
		return "CourseEntity [courseid=" + courseid + ", code=" + code + ", description=" + description + ", unit="
				+ unit + "]";
	}

}
