package com.example.flight_checkin.dto;


public class Reservations {

	private long id;
	
	private boolean checkedIn;

	private int numberOfBags;

	Passengers passenger;

	Flights flight;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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
