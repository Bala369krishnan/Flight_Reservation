package com.example.flight_reservation.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "users")
public class Users extends AbstractEntity{

	/*
	 * Encapsulation in java .
	 * 1) make all the variables in the class private .
	 * 2) create public getter and setter methods for these variables*/
	
	@Column(name = "first_name")
	@NotEmpty(message = "first name cannot be empty")
	private String firstName;

	@Column(name = "last_name")
	@NotEmpty(message = "last name cannot be empty")
	private String lastName;

	@Column(name = "email" , unique = true)
	@NotEmpty(message = "email name cannot be empty")
	@Email
	private String email;

	@Column(name = "password")
	@NotEmpty(message = "password name cannot be empty")
	private String password;

	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
