package com.rest.flightmanager.repository;

import org.springframework.data.repository.CrudRepository;
import com.rest.flightmanager.dao.Flights;

public interface FlightsRepository extends CrudRepository<Flights, Integer> {

}
