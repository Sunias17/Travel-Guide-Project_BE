package com.cituccs.sims.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cituccs.sims.Entity.SectionEntity;

public interface SectionRepository extends  JpaRepository<SectionEntity, Integer>{

	SectionEntity findBySectionName(String sectionName);
	
}
