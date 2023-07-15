package com.rest.flightmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.flightmanager.dao.Flight;
import com.rest.flightmanager.repository.FlightSearchRepository;
import com.rest.flightmanager.service.FlightSearchService;


@RestController
public class FlightSearchController {

	@Autowired
	private FlightSearchRepository flightSearchRepository;
	
	@Autowired
	private FlightSearchService flightSearchService;
	
	@RequestMapping("/")
	public String homePage() {
		return "hello!";
	}
	
	@RequestMapping( "/flights")
	public List<Flight> getAllFlights(){
		return flightSearchService.getFlights();
	}
}
