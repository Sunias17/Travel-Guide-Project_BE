package com.cituccs.sims.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="tbl_comment")
public class CommentEntity {

	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int commentId;
	
	private String code;
	private String comment;
	private int unit;
	
	
	@ManyToOne
	@JoinColumn(name="id")
	GuidepostEntity guidePost;
	
	public CourseEntity() {}


	public CommentEntity(int commentId, String comment, GuidepostEntity guidePost) {
		super();
		this.commentId = courseid;
		this.comment = comment;
		this.guidePost = guidePost;
	}


	public int getCommentId() {
		return commentId;
	}



	
	public String getComment() {
		return comment;
	}


	public void setComment(String description) {
		this.comment = description;
	}
	
	

	public GuidepostEntity getGuidePost() {
		return student;
	}


	public void setGuidePost(GuidepostEntity guidePost) {
		this.guidePost = guidePost;
	}


	@Override
	public String toString() {
		return "CommentEntity [commentID:" + courseid + ", comment:" + comment +"]";
	}

}
