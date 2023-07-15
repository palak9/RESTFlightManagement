package com.rest.flightmanager.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.flightmanager.dao.Flight;
import com.rest.flightmanager.repository.FlightSearchRepository;

@Service
public class FlightSearchService {

	@Autowired
	private FlightSearchRepository flightSearchrepository;
	
	public List<Flight> getFlights(){
		List<Flight> flights = new ArrayList<>();
		for(Flight flight : flightSearchrepository.findAll()) {
			flights.add(flight);
		}
		System.out.println("Flight:"+flights);
		return flights;
	}
	
}
