package com.example.flight_checkin.integration;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.flight_checkin.dto.ReservationUpdateRequest;
import com.example.flight_checkin.dto.Reservations;

public interface ReservationsRestClient {

	public Reservations findReservation(@PathVariable("id") long id);
	public Reservations updateReservation(@RequestBody ReservationUpdateRequest request);
	
}
