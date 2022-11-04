package com.cituccs.sims.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_section")
public class SectionEntity {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int sectionid;
	private String sectionname;
	
	public SectionEntity(){}
	
	public SectionEntity(int sectionid, String sectionname) {
		super();
		this.sectionid = sectionid;
		this.sectionname = sectionname;
	}

	public String getSectionname() {
		return sectionname;
	}

	public void setSectionname(String sectionname) {
		this.sectionname = sectionname;
	}

	public int getSectionid() {
		return sectionid;
	}

	@Override
	public String toString() {
		return "SectionEntity [sectionid=" + sectionid + ", sectionname=" + sectionname + "]";
	}
	
}
