package com.cituccs.sims.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cituccs.sims.Entity.CourseEntity;

@Repository
public interface CommentRepository extends  JpaRepository<CommentEntity, Integer>{

	CommentEntity findById(Integer commentId);
	List<CommentEntity> findUserComments(Integer userId);,
	
	
}

