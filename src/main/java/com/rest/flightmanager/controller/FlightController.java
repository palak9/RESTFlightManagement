package com.rest.flightmanager.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import com.rest.flightmanager.dao.Flights;
import com.rest.flightmanager.service.FlightService;

public class FlightController {

	@Autowired
	private FlightService flightService;

	@RequestMapping("/flights")
	public List<Flights> getAllflights() {
		return flightService.getFlights();
	}

}