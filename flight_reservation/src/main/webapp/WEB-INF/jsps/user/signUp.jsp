<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up Page</title>
<link href="webjars/bootstrap/4.5.3/css/bootstrap.min.css"
	rel="stylesheet">
<style>
.box {

	width: 480px;
	margin: 30px auto;
}
</style>
</head>
<body>
	<div class="container-fluid">
		<div class="box">
			<h2>Sign up page</h2>
			<p>
				Already have an Account ? <a href="loginPage"> Login</a>
			</p>
			<p>${signUpMsg}</p>
			<form action="signUpUser" method="post">

				<div class="form-group">
					<label>First Name </label>
					<input type="text" name="firstName" class="form-control">
				</div>
				<div class="form-group">
					<label>Last Name </label>
					<input type="text" name="lastName" class="form-control">
				</div>
				<div class="form-group">
					<label>Email </label>
					<input type="email" name="email" class="form-control">
				</div>
				<div class="form-group">
					<label>Password </label>
					<input type="password" name="password" class="form-control">
					<small class="form-text text-muted"> Your password must be
						8-20 characters long. </small>
				</div>
				<input type="submit" value="Sign Up" class="btn btn-outline-success">
			</form>

		</div>
		<%@ include file = "/WEB-INF/jsps/commonparts/footer/footer.jsp" %>
	</div>
</body>
</html>