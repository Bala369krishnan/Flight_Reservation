package com.example.flight_reservation.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.flight_reservation.dto.ReservationPassenger;
import com.example.flight_reservation.entities.Flights;
import com.example.flight_reservation.entities.Reservations;
import com.example.flight_reservation.repositories.FlightsRepository;
import com.example.flight_reservation.services.ReservationsServices;
import com.example.flight_reservation.util.EmailUtil;
import com.example.flight_reservation.util.PDFGenerator;
@Controller
public class ReservationsController {

	
	@Autowired
	FlightsRepository flightsRepo;
	
	@Autowired
	ReservationsServices reservationsService;
	
	@Autowired
	PDFGenerator pdfGenerator;
	
	@Autowired
	EmailUtil emailUtil;
	
	@RequestMapping("/addPassenger")
	public String addPassenger(@RequestParam("flightId") Long flightId ,ModelMap modelMap) {
		Optional<Flights> selectedFlight = flightsRepo.findById(flightId);
		Flights flight = selectedFlight.get();
		modelMap.addAttribute("flight", flight);
		return "reservation/completeReservation";
	}
	
	@RequestMapping("/confirmBooking")
	public String confirmBooking(ReservationPassenger request ,ModelMap modelMap) {
		Reservations booking = reservationsService.bookFlightTicket(request);
		
		
		modelMap.addAttribute("firstName", booking.getPassenger().getFirstName());
		modelMap.addAttribute("lastName", booking.getPassenger().getLastName());
		modelMap.addAttribute("email", booking.getPassenger().getEmail());
		modelMap.addAttribute("phone", booking.getPassenger().getPhone());
		modelMap.addAttribute("flightNumber", booking.getFlight().getFlightNumber());
		modelMap.addAttribute("operatingAirlines", booking.getFlight().getOperatingAirlines());
		modelMap.addAttribute("deptartureCity", booking.getFlight().getDepartureCity());
		modelMap.addAttribute("arrivalCity", booking.getFlight().getArrivalCity());
		modelMap.addAttribute("dateOfDept", booking.getFlight().getDateOfDept());
		modelMap.addAttribute("estimatedDeptTime", booking.getFlight().getEstimatedDeptTime());
		
		
		String filePath="/home/bluedragon/Desktop/reservation/pdf/ticketbooked"+booking.getId()+".pdf";
		
		pdfGenerator.generateItinerary(booking,filePath);
		
		emailUtil.sendItinerary(booking.getPassenger().getEmail(),filePath);
		
		return "reservation/bookingConfirm";
	}
	
}
