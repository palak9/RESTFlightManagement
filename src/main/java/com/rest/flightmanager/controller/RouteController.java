package com.rest.flightmanager.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rest.flightmanager.dao.Route;
import com.rest.flightmanager.service.RouteService;

@RestController
public class RouteController {

	@Autowired
	private RouteService routeService;
	
	@RequestMapping("/routes")
	public List<Route> getAllAvailableRoutes() {
		return routeService.getAllRoutes(); 
	}
	
	@PutMapping("/routes/{routeId}")
	public boolean updateRoute(@PathVariable Integer routeId, @RequestBody Route route) {
		return routeService.updateRoute(routeId, route);
	}
}
