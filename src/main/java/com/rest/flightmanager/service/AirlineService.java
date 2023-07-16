package com.rest.flightmanager.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.flightmanager.dao.Airline;
import com.rest.flightmanager.repository.AirlineRepository;

@Service
public class AirlineService {

	@Autowired
	private AirlineRepository airlinerepository;
	
	public List<Airline> getFlights(){
		List<Airline> flights = new ArrayList<>();
		for(Airline flight : airlinerepository.findAll()) {
			flights.add(flight);
		}
		System.out.println("Flight:"+flights);
		return flights;
	}
	
	public void addFlight(Airline airline) {
		airlinerepository.save(airline);
	}
	
	public Airline getFlightDetail(int airlineId) {
		return airlinerepository.findById(airlineId).orElseThrow();
	}
}
