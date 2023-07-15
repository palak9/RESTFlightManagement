package com.rest.flightmanager.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.flightmanager.dao.Route;
import com.rest.flightmanager.repository.RouteRepository;

@Service
public class RouteService {

	@Autowired
	private RouteRepository routeRepository;
	
	public List<Route> getAllRoutes(){
		List<Route> routes = new ArrayList<>();
		for(Route route : routeRepository.findAll()) {
			routes.add(route);
		}
	    return routes;
	}
	
	public boolean updateRoute(Integer routeId, Route route) {
		boolean updated = false;
		for(Route r : routeRepository.findAll()) {
			if(routeId == r.getRoute_id()) {
				r.setFrom_location(route.getFrom_location());
				r.setTo_location(route.getTo_location());
				updated = true;
			}
		}
		return updated;
	}
}
