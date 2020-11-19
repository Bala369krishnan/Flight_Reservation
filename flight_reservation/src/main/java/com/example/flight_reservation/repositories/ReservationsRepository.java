package com.example.flight_reservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.flight_reservation.entities.Reservations;

public interface ReservationsRepository extends JpaRepository<Reservations, Long> {

}
