package com.cituccs.sims.Service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cituccs.sims.Entity.AdministratorEntity;
import com.cituccs.sims.Repository.AdministratorRepository;

@Service
public class AdministratorService {
	
	@Autowired
	AdministratorRepository arepo;
	
	//get username and password from database
	public boolean checkLoginDetails(String username, String password) {
		AdministratorEntity admin = new AdministratorEntity();
		return false;
		/*
		if(arepo.exists(username)==true) {
			admin = arepo.findByUsername(username);
			if(admin.getPassword().equals(password)) 
				return true;
			else
				return false;
		}else
			return false; */
	}
}
