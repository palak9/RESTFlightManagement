package com.rest.flightmanager.repository;

import org.springframework.data.repository.CrudRepository;

import com.rest.flightmanager.dao.Flight;

public interface FlightSearchRepository extends CrudRepository<Flight, Integer> {

	
	
}
