package com.example.flight_reservation.entities;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "flights")
public class Flights extends AbstractEntity{

	@Column(name = "flight_number")
	private String flightNumber;

	@Column(name = "operating_airlines")
	private String operatingAirlines;

	@Column(name = "departure_city")
	private String departureCity;

	@Column(name = "arrival_city")
	private String arrivalCity;

	// import Date from java.util.Date;
	@Column(name = "date_of_departure")
	@Temporal(TemporalType.DATE)
	private Date dateOfDept;

	// import Timestamp from java.sql.Timestamp ;
	@Column(name = "estimated_departure_time")
	private Timestamp estimatedDeptTime;

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOperatingAirlines() {
		return operatingAirlines;
	}

	public void setOperatingAirlines(String operatingAirlines) {
		this.operatingAirlines = operatingAirlines;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}


	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public Date getDateOfDept() {
		return dateOfDept;
	}

	public void setDateOfDept(Date dateOfDept) {
		this.dateOfDept = dateOfDept;
	}

	public Timestamp getEstimatedDeptTime() {
		return estimatedDeptTime;
	}

	public void setEstimatedDeptTime(Timestamp estimatedDeptTime) {
		this.estimatedDeptTime = estimatedDeptTime;
	}

}
