package com.cituccs.sims.Entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tbl_student")
public class StudentEntity {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	private String firstname;
	private String lastname;
	private int yearlevel;
	
	@OneToMany(cascade = CascadeType.MERGE)
	private Set<CourseEntity> course;
	 
	
	public StudentEntity() {}
	
	
	public StudentEntity(int id, String firstname, String lastname, int yearlevel, Set<CourseEntity> course) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.yearlevel = yearlevel;
		this.course = course;
	}




	public int getId() {
		return id;
	}

	/*public void setId(int id) {
		this.id = id;
	}							*/

	public String getFirstname() {
		return firstname;
	}

	/*public void setFirstname(String firstname) {
		this.firstname = firstname;
	}*/

	public String getLastname() {
		return lastname;
	}

	/*public void setLastname(String lastname) {
		this.lastname = lastname;
	}*/

	public int getYearlevel() {
		return yearlevel;
	}

	public void setYearlevel(int yearlevel) {
		this.yearlevel = yearlevel;
	}
	
	

	public Set<CourseEntity> getCourse() {
		return course;
	}


	public void setCourse(Set<CourseEntity> course) {
		this.course = course;
	}


	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", yearlevel="
				+ yearlevel + ", course=" + course + "]";
	}
	
}
