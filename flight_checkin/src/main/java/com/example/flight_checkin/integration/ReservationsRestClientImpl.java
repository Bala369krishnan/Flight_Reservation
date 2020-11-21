package com.example.flight_checkin.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.flight_checkin.dto.ReservationUpdateRequest;
import com.example.flight_checkin.dto.Reservations;

@Component
public class ReservationsRestClientImpl implements ReservationsRestClient{

	@Override
	public Reservations findReservation(long id) {
		RestTemplate restTemplate = new RestTemplate();
		Reservations reservation = restTemplate.getForObject("http://localhost:8080/flightreservation/reservation/"+id,Reservations.class);
		return reservation;
	}

	@Override
	public Reservations updateReservation(ReservationUpdateRequest request) {
		RestTemplate restTemplate = new RestTemplate();
		Reservations reservation = restTemplate.postForObject("http://localhost:8080/flightreservation/reservation", request, Reservations.class);
		return reservation;
		
	}

}
