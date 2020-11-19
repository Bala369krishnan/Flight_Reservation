package com.example.flight_reservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.flight_reservation.entities.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {

	Users findByEmail(String email);

}
