package com.cituccs.sims.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloGalvez {
	@RequestMapping("/hello")
	public String hello() {
		return "Hello, Brett Josef C. Galvez, BSIT-3";
	}
}
