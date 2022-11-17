package com.cituccs.sims.Service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cituccs.sims.Entity.CourseEntity;
import com.cituccs.sims.Repository.CourseRepository;

@Service
public class CommentService {
	
	@Autowired
	CommentRepository crepo;
	
// FOR POSTING COMMENTS TO GUIDEPOST
	
	public String deleteComment(int commentId) {
		String msg;
		if(crepo.findById(commentId) !=null) {
			crepo.deleteById(commentId);
			msg = "Comment ID Number " + commentId + " is successfully deleted!";
		}else 
			msg = "Comment ID Number " + commentId + " is NOT found!";
		
		return msg;
	}
}
