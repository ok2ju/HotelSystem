<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="<c:url value="resources/css/bootstrap.min.css"/>" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="resources/css/registration.css"/>" />
<title>Registration</title>
</head>
<body>
	<c:url value="/registration" var="regist"></c:url>

	<div class="container">

		<form:form class="form-signin" action="${regist}" method="POST" modelAttribute="client">
			<h2 class="form-signin-heading">Registration</h2>
			<form:input path="userName" type="text" class="form-control" placeholder="Username" />
			<form:input path="firstName" type="text" class="form-control" placeholder="First Name" />
			<form:input path="middleName" type="text" class="form-control" placeholder="Middle Name" />
			<form:input path="lastName" type="text" class="form-control" placeholder="Last Name" />
			<form:input path="email" type="text" class="form-control" placeholder="Email address" /> 
			<form:input path="password" type="password" class="form-control" placeholder="Password" />
			<input type="password" class="form-control" placeholder="Confirm Password" required>
			<button class="btn btn-lg btn-primary btn-block" type="submit">Register</button>
		</form:form>

	</div>
	<!-- /container -->
</body>
</html>