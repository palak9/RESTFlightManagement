package com.rest.flightmanager.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.flightmanager.dao.Flights;
import com.rest.flightmanager.service.FlightService;

@RestController
public class FlightController {

	@Autowired
	private FlightService flightService;

	@RequestMapping("/flights")
	public List<Flights> getAllflights() {
		return flightService.getFlights();
	}
	
	@PostMapping("/flights")
	public void addFlight(@RequestBody Flights flight) {
//		Flights newFlight = new Flights();
	}
	
}
