package com.cituccs.sims.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;

import com.cituccs.sims.Entity.FavoritesEntity;
import com.cituccs.sims.Entity.UserEntity;
import com.cituccs.sims.Repository.FavoritesRepository;

public class FavoritesService {

	@Autowired
	FavoritesRepository frepo;
	
	//missing parameters and body
	public FavoritesEntity putFavorite() throws Exception{
		FavoritesEntity favorite = new FavoritesEntity();
		
		try {
			favorite.setStatus(true);
			return frepo.save(favorite);
		}catch(NoSuchElementException nex) {
			throw new Exception("Error");
		}
	}
	//missing parameters and body
	public FavoritesEntity deleteFavorite() throws Exception{
		FavoritesEntity favorite = new FavoritesEntity();
		
		try {
			favorite.setStatus(false);
			return frepo.save(favorite);
		}catch(NoSuchElementException nex) {
			throw new Exception("Error");
		}
	}
	/* missing parameters and body
	public FavoritesEntity insertFavorites() {
		
	}
	*/
	public List<FavoritesEntity> getUserFavorites(UserEntity user){
		//return frepo.findAll();
	}
	
	
}
