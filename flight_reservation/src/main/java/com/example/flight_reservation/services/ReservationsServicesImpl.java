package com.example.flight_reservation.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.flight_reservation.dto.ReservationPassenger;
import com.example.flight_reservation.entities.Flights;
import com.example.flight_reservation.entities.Passengers;
import com.example.flight_reservation.entities.Reservations;
import com.example.flight_reservation.repositories.FlightsRepository;
import com.example.flight_reservation.repositories.PassengersRepository;
import com.example.flight_reservation.repositories.ReservationsRepository;

@Service
public class ReservationsServicesImpl implements ReservationsServices{
	
    // to get flight details using flightId	
	@Autowired
	FlightsRepository flightsRepo;
	
	
	// to save passenger details using save method
	@Autowired
	PassengersRepository passengersRepo;
	
	// to save reservation details using save method
	@Autowired
	ReservationsRepository reservationsRepo;
	
	public Reservations bookFlightTicket(ReservationPassenger request) {
		
		/*
		 *  1) find flight using flightId present in request object.
		 *     write code to store flight details in flight object
		 * 
		 * */
		long flightId = request.getFlightId();
		Optional<Flights> findById = flightsRepo.findById(flightId);
		Flights flight = findById.get();
		System.out.println(flight);
		/* this contains the flight details*/
		
		/*
		 *   2) to save entered passenger details into database
		 */
		
		Passengers passenger = new Passengers();
		passenger.setFirstName(request.getPassengerFirstName());
		passenger.setLastName(request.getPassengerLastName());
		passenger.setEmail(request.getPassengerEmail());
		passenger.setPhone(request.getPassengerPhone());
		passengersRepo.save(passenger);
			
		
		Reservations reservation = new Reservations();
			reservation.setCheckedIn(false);
			reservation.setPassenger(passenger);
			reservation.setFlight(flight);
			Reservations save = reservationsRepo.save(reservation);
			return save;
		}
}
