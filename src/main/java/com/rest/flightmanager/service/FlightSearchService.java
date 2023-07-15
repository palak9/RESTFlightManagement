package com.rest.flightmanager.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.flightmanager.dao.Airline;
import com.rest.flightmanager.repository.FlightSearchRepository;

@Service
public class FlightSearchService {

	@Autowired
	private FlightSearchRepository flightSearchrepository;
	
	public List<Airline> getFlights(){
		List<Airline> flights = new ArrayList<>();
		for(Airline flight : flightSearchrepository.findAll()) {
			flights.add(flight);
		}
		System.out.println("Flight:"+flights);
		return flights;
	}
	
	public void addFlight(Airline airline) {
		 flightSearchrepository.save(airline);
	}
	
	public Airline getFlightDetail(int airlineId) {
		return flightSearchrepository.findById(airlineId).orElseThrow();
	}
}
