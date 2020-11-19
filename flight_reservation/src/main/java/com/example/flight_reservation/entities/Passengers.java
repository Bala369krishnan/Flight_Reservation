package com.example.flight_reservation.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "passengers")
public class Passengers extends AbstractEntity{

	@Column(name = "first_name")
	@NotEmpty(message = "first name cannot be empty")
	private String firstName;

	@Column(name = "last_name")
	@NotEmpty(message = "last name cannot be empty")
	private String lastName;

	@Column(name = "email")
	@NotEmpty(message = "email cannot be empty")
	@Email
	private String email;

	@Column(name = "phone")
	@NotEmpty(message = "phone number cannot be empty")
	private String phone;

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
