package com.cituccs.sims.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cituccs.sims.Entity.AdministratorEntity;
import com.cituccs.sims.Entity.StudentEntity;

@Repository
public interface AdministratorRepository  extends  JpaRepository<AdministratorEntity, Integer>{
	
	StudentEntity findByUsername(String username);
}
