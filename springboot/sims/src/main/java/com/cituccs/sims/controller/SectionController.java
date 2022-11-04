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

import com.cituccs.sims.Entity.SectionEntity;
import com.cituccs.sims.Service.SectionService;


@RestController
@RequestMapping("/section")
public class SectionController {

	@Autowired
	SectionService secserv;
	

	
	@PostMapping("/postSection")
	public SectionEntity insertSection(@RequestBody SectionEntity section) {
		return secserv.insertSection(section);
	}
	
	@GetMapping("/displayAllSections")
	public List<SectionEntity> getAllSection(){
		return secserv.getAllSection();
	}
	
	@GetMapping("/getBySectionName")
	public SectionEntity findBySectionName(@RequestParam String sectionName) {
		return secserv.findBySectionName(sectionName);
	}
	
	@PutMapping("/putSection")
	public SectionEntity putSection(@RequestParam int sectionid,@RequestBody SectionEntity newSectionDetails) throws Exception{
		return secserv.putSection(sectionid, newSectionDetails);
	}
	
	@DeleteMapping("/deleteSection/{id}")
	public String deleteSection(@PathVariable int id){
		return secserv.deleteSection(id);
	}
}
