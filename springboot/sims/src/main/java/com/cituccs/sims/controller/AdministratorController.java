package com.cituccs.sims.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cituccs.sims.Service.AdministratorService;

@RestController
@RequestMapping("/admin")
public class AdministratorController {
	
	AdministratorService aserv;
	
	@GetMapping("/displayAllStudent")
	public boolean checkLoginDetails(String username, String password) {
		return aserv.checkLoginDetails(username, password);
	}
}
