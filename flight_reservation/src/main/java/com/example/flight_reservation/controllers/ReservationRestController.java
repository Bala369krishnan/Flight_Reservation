package com.example.flight_reservation.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.flight_reservation.dto.ReservationUpdateRequest;
import com.example.flight_reservation.entities.Reservations;
import com.example.flight_reservation.repositories.ReservationsRepository;

@RestController
public class ReservationRestController {
 
	@Autowired
	ReservationsRepository reservRepo;
	
	@RequestMapping("/reservation/{id}")
	public Reservations findReservation(@PathVariable("id") long id) {
		Optional<Reservations> findById = reservRepo.findById(id);
		return findById.get();
	}
	
	@RequestMapping("/reservation")
	public Reservations updateReservation(@RequestBody ReservationUpdateRequest request) {
		
		long id = request.getId();
		Optional<Reservations> findById = reservRepo.findById(id);
		Reservations reservation = findById.get();
		reservation.setCheckedIn(request.isCheckedIn());
		reservation.setNumberOfBags(request.getNumberOfBags());
		return reservRepo.save(reservation);
		
		}
	
}
