package com.example.flight_reservation.controllers;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.flight_reservation.entities.Flights;
import com.example.flight_reservation.repositories.FlightsRepository;

@Controller
public class FlightsController {

	@Autowired
	FlightsRepository flightsRepo;
	
	@RequestMapping("/findFlights")
	public String findFlights(@RequestParam("from") String from , @RequestParam("to") String to , @RequestParam("departureDate") Date date , ModelMap modelMap) {
		List<Flights> flights = flightsRepo.findFlights(from, to, date);
		if(flights.isEmpty()) {
			modelMap.addAttribute("flightsMsg", "No flights available");
			return "flight/searchFlights";
		}else {
			modelMap.addAttribute("flights", flights);
			return "flight/displayFlights";
		}
		
	}
}
