package com.cituccs.sims.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cituccs.sims.Entity.FavoritesEntity;

@Repository
public interface FavoritesRepository  extends JpaRepository<FavoritesEntity, Integer>{

}
