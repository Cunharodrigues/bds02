package com.devsuperior.bds02.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.bds02.entities.City;
import com.devsuperior.bds02.entities.Event;

public interface CityRepository extends JpaRepository<City, Long> {

	Event save(Event entity);
	
}
