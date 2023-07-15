package com.rest.flightmanager.repository;

import org.springframework.data.repository.CrudRepository;
import com.rest.flightmanager.dao.Airline;

public interface FlightSearchRepository extends CrudRepository<Airline, Integer> {

}
