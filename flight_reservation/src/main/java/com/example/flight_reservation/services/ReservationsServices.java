package com.example.flight_reservation.services;

import com.example.flight_reservation.dto.ReservationPassenger;
import com.example.flight_reservation.entities.Reservations;

public interface ReservationsServices {

	Reservations bookFlightTicket(ReservationPassenger request);
}
