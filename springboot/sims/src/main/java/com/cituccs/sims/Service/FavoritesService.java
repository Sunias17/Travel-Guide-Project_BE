package com.cituccs.sims.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cituccs.sims.Entity.FavoritesEntity;
import com.cituccs.sims.Repository.FavoritesRepository;

@Service
public class FavoritesService {

	@Autowired
	FavoritesRepository frepo;
	
	public FavoritesEntity putFavorites(int favoritesid, FavoritesEntity newFavoriteDetails) throws Exception{
		FavoritesEntity favorites = new FavoritesEntity();
		
		try {
			favorites = frepo.findById(favoritesid).get();
			favorites.setStatus(newFavoriteDetails.isStatus());
			return frepo.save(favorites);
		}catch(NoSuchElementException nex) {
			throw new Exception("ID Number "+ favoritesid +" does not exist!");
		}
		
	}
	
	public String deleteFavorites(int favoritesid) {
		String msg;
		if(frepo.findById(favoritesid) !=null) {
			frepo.deleteById(favoritesid);
			msg = "Student ID Number " + favoritesid + " is successfully deleted!";
		}else 
			msg = "Student ID Number " + favoritesid + " is NOT found!";
		
		return msg;
	}
	
	public FavoritesEntity insertFavorites(FavoritesEntity favorites) {
		return frepo.save(favorites);
	}
	
	public List<FavoritesEntity> getAllFavorites(){
		return frepo.findAll();
	}
	
	
//	public FavoritesEntity findById(int id) {
//		if(srepo.findByFirstname(firstname) !=null)
//			return srepo.findByFirstname(firstname);
//		else
//			return null;
//	}

}
