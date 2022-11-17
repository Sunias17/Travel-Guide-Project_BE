package com.cituccs.sims.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_favorites")
public class FavoritesEntity {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int favoriteid;
	private boolean status;
	
	@ManyToOne
	@JoinColumn(name="guidepostid")
	private GuidepostEntity guidepost;
	
	@ManyToOne
	@JoinColumn(name="username")
	private UserEntity user;
	
	public FavoritesEntity() {}
	
	public FavoritesEntity(int favoriteid, boolean status, GuidepostEntity guidepost, UserEntity user) {
		super();
		this.favoriteid = favoriteid;
		this.status = status;
		this.guidepost = guidepost;
		this.user = user;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getFavoriteid() {
		return favoriteid;
	}

	public GuidepostEntity getGuidepost() {
		return guidepost;
	}

	public UserEntity getUser() {
		return user;
	}
	
	
	
}
