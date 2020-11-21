package com.example.flight_checkin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.flight_checkin.dto.ReservationUpdateRequest;
import com.example.flight_checkin.dto.Reservations;
import com.example.flight_checkin.integration.ReservationsRestClient;

@Controller
public class ReservationsController {

	@Autowired
	ReservationsRestClient  restClient;
	
	@RequestMapping("/showCheckin")
	public String shoeCheckin() {
		return "showCheckin";
	}
	
	@RequestMapping("/startCheckin")
	public String startCheckin(@RequestParam("id") long id , ModelMap modelMap) {
		Reservations reservation = restClient.findReservation(id);
		modelMap.addAttribute("reservation", reservation);
		return "reservationDetails";
	}
	
	@RequestMapping("/completeCheckIn")
	public String completeCheckIn(@RequestParam("reservationId") long id , @RequestParam("numberOfBags") int numberOfBags) {
		ReservationUpdateRequest request = new ReservationUpdateRequest();
		request.setCheckedIn(true);
		request.setNumberOfBags(numberOfBags);
		request.setId(id);
		restClient.updateReservation(request);
		return "confirmCheckin";
	}
}
