package com.cituccs.sims.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cituccs.sims.Entity.AdministratorEntity;
import com.cituccs.sims.Repository.AdministratorRepository;

@Service
public class AdministratorService {
	
	@Autowired
	AdministratorRepository arepo;
	
	public boolean checkLoginDetails(String username, String password) {
		AdministratorEntity admin = new AdministratorEntity();
	
		if(arepo.findByUsername(username) !=null){
			admin = arepo.findByUsername(username);
			if(admin.getPassword().equals(password)) 
				return true;
			else
				return false;
		}else
			return false; 
	}
}
