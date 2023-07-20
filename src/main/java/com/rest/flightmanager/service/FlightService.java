package com.rest.flightmanager.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.flightmanager.dao.Flights;
import com.rest.flightmanager.repository.FlightsRepository;

@Service
public class FlightService {

	@Autowired
	private FlightsRepository flightsRepository;

	public List<Flights> getFlights() {
		List<Flights> flights = new ArrayList<>();
		for (Flights flight : flightsRepository.findAll()) {
			flights.add(flight);
		}
		return flights;
	}

	public void addFlight(Flights flight) {
		flightsRepository.save(flight);
	}
	
}
