package com.example.flight_reservation.repositories;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.flight_reservation.entities.Flights;

public interface FlightsRepository extends JpaRepository<Flights, Long> {
	@Query("FROM Flights where departureCity=:from and arrivalCity=:to and dateOfDept=:date")
    List<Flights> findFlights(String from , String to , Date date);
}
