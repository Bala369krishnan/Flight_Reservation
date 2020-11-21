<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reservation Details</title>
</head>
<body>
<h2>Reservation Details</h2>
<table>
	<tr>
		<th colspan="2">Flight Details</th>
	</tr>
	<tr>
		<td>Airlines : </td>
		<td>${reservation.flight.operatingAirlines}</td>
	</tr>
	<tr>
		<td>Flight Number : </td>
		<td>${reservation.flight.flightNumber}</td>
	</tr>
	<tr>
		<td>Departure City : </td>
		<td>${reservation.flight.departureCity}</td>
	</tr>
	<tr>
		<td>Arrival City : </td>
		<td>${reservation.flight.arrivalCity}</td>
	</tr>
	<tr>
		<td>Date and Time of Departure : </td>
		<td>${reservation.flight.estimatedDeptTime}</td>
	</tr>
	<tr>
		<th colspan="2">Passenger details</th>
	</tr>
	<tr>
		<td>First Name : </td>
		<td>${reservation.passenger.firstName}</td>
	</tr>
	<tr>
		<td>Last Name : </td>
		<td>${reservation.passenger.lastName}</td>
	</tr>
	<tr>
		<td>Email : </td>
		<td>${reservation.passenger.email}</td>
	</tr>
	<tr>
		<td>Phone : </td>
		<td>${reservation.passenger.phone}</td>
	</tr>
</table>
<br>

<form action="completeCheckIn" method="post">
		Number of bags you want to checkin <input type="text" name="numberOfBags">
		<input type="hidden" value="${reservation.id}" name="reservationId">
		<input type="submit" value="Check In">
	</form>
</body>
</html>