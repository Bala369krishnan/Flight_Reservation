package com.example.flight_reservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.flight_reservation.entities.Passengers;

public interface PassengersRepository extends JpaRepository<Passengers, Long> {

}
