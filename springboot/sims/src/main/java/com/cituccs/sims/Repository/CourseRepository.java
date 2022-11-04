package com.cituccs.sims.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cituccs.sims.Entity.CourseEntity;

@Repository
public interface CourseRepository extends  JpaRepository<CourseEntity, Integer>{

	CourseEntity findByCode(String firstCodename);
	
}

