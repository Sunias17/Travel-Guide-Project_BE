package com.cituccs.sims.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;

import com.cituccs.sims.Entity.SectionEntity;
import com.cituccs.sims.Repository.SectionRepository;

public class SectionService {
	@Autowired
	SectionRepository secrepo;
	
	public SectionEntity putSection(int sectionid, SectionEntity newSectionDetails) throws Exception{
		SectionEntity section = new SectionEntity();
		
		try {
			section = secrepo.findById(sectionid).get();
			section.setSectionname(newSectionDetails.getSectionname());
			return secrepo.save(section);
		}catch(NoSuchElementException nex) {
			throw new Exception("Section ID Number "+ sectionid +" does not exist!");
		}
		
	}
	
	public String deleteSection(int sectionid) {
		String msg;
		if(secrepo.findById(sectionid) !=null) {
			secrepo.deleteById(sectionid);
			msg = "Section ID Number " + sectionid + " is successfully deleted!";
		}else 
			msg = "Section ID Number " + sectionid + " is NOT found!";
		
		return msg;
	}
	
	public SectionEntity insertSection(SectionEntity section) {
		return secrepo.save(section);
	}
	
	public List<SectionEntity> getAllSection(){
		return secrepo.findAll();
	}
	
	
	public SectionEntity findBySectionName(String sectionName) {
		if(secrepo.findBySectionName(sectionName) !=null)
			return secrepo.findBySectionName(sectionName);
		else
			return null;
	}
}
