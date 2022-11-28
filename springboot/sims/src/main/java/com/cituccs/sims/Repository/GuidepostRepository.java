package com.travelguide.sims_app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travelguide.sims_app.Entity.GuidepostEntity;

@Repository
public interface GuidepostRepository extends JpaRepository<GuidepostEntity, Integer>{
	GuidepostEntity findByTitle(String title);
}
