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

import com.cituccs.sims.Entity.CourseEntity;
import com.cituccs.sims.Service.CourseService;

@RestController
@RequestMapping("/comments")
public class CommentController {
	
	@Autowired
	CommentService cserv;
	
	@GetMapping("/test")
	public String printHelloWorld() {
		return "This is the comment route";
	}
	
	
	@DeleteMapping("/deleteComment/{commentId}")
	public String deleteComment(@PathVariable int commentId){
		return cserv.deleteComment(commentId);
	}
}
