package com.example.flight_reservation.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reservations")
public class Reservations extends AbstractEntity{

	@Column(name = "checked_in")
	private boolean checkedIn;

	@Column(name = "number_of_bags")
	private int numberOfBags;

	
	@OneToOne
	Passengers passenger;

	@OneToOne
	Flights flight;

	public boolean isCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}

	public int getNumberOfBags() {
		return numberOfBags;
	}

	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}

	public Passengers getPassenger() {
		return passenger;
	}

	public void setPassenger(Passengers passenger) {
		this.passenger = passenger;
	}

	public Flights getFlight() {
		return flight;
	}

	public void setFlight(Flights flight) {
		this.flight = flight;
	}


}
