<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Flights</title>
<link href="webjars/bootstrap/4.5.3/css/bootstrap.min.css"
	rel="stylesheet">
<style>
.box {
	width: 600px;
	margin: 30px auto;
}
</style>
</head>
<body>
	<!-- code to find flight is written in FlightsController -->
	<div class="container-fluid">
		<div class="box">
		<h2 style="text-align: center;">Search Flights</h2>
		<p>${flightsMsg}</p>
		<form action="findFlights" method="post" >
		<div class="row">
			<div class="form-group col-md-4">
				<label>from :</label> 
				<select name="from" class="form-control" required>
					<option value="Bangalore">Bangalore</option>
					<option value="Chennai">Chennai</option>
					<option value="Mumbai">Mumbai</option>
					<option value="Kolkata">Kolkata</option>
					<option value="Delhi">Delhi</option>
					<option value="Pune">Pune</option>
				</select> 
				</div>
				<div class="form-group col-md-4 ">
				<label>to : </label> 
				<select name="to" class="form-control" required>
					<option value="Bangalore">Bangalore</option>
					<option value="Chennai">Chennai</option>
					<option value="Mumbai">Mumbai</option>
					<option value="Kolkata">Kolkata</option>
					<option value="Delhi">Delhi</option>
					<option value="Pune">Pune</option>
				</select>
				</div>
				<div class="form-group col-md-4">
				<label>Travel Date : </label>
				<input type="date" name="departureDate"  class="form-control" required>
				</div>
				
				
				
			</div>
			<div>
				<input type="submit" value="Search"  class="btn btn-primary">
			</div>
			
		</form>
		</div>
		<%@ include file = "/WEB-INF/jsps/commonparts/footer/footer.jsp" %>
	</div>
	<script>
	</script>
</body>
</html>