package com.example.flight_checkin.dto;

import java.sql.Timestamp;
import java.util.Date;




public class Flights {

	private long id;
	

	private String flightNumber;

	
	private String operatingAirlines;

	
	private String departureCity;

	
	private String arrivalCity;

	
	private Date dateOfDept;

	
	private Timestamp estimatedDeptTime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
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
