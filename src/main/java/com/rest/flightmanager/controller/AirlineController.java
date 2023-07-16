package com.rest.flightmanager.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.rest.flightmanager.dao.Airline;
import com.rest.flightmanager.service.AirlineService;

@RestController
public class AirlineController {

	@Autowired
	private AirlineService airlineService;

	@RequestMapping("/")
	public String homePage() {
		return "hello!";
	}

	@RequestMapping("/airlines")
	public List<Airline> getAllFlights() {
		return airlineService.getFlights();
	}

	@RequestMapping(value = "/addAirlines", method = RequestMethod.POST)
	public String createFlight(@RequestBody Airline airline) {
		Airline newAirline = new Airline(airline.getAirline_id(), airline.getAirline_name(),
				airline.getAirline_capacity());
		airlineService.addFlight(newAirline);
		return "Airline added to database!";
	}
	
	@RequestMapping("/airlines/{airlineId}")
	public Airline getFlightDetails(@PathVariable int airlineId) {
		Airline airlineDetails = airlineService.getFlightDetail(airlineId);
		System.out.println("/airlines/{airlineId} : "+airlineDetails);
		return airlineDetails;
	}
}
