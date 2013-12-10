<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="<c:url value="resources/css/bootstrap.min.css"/>" />
<link rel="stylesheet" type="text/css" href="<c:url value="resources/css/admin_add_apartment.css"/>" />
<title>Home Page</title>
<style>
	#wrap .panel-heading{
		margin-top: 50px;
	}
	
	#wrap .panel .table thead{
		background-color: grey;
	}
</style>
</head>
<body>
	    <!-- Wrap all page content here -->
    <div id="wrap">

      <!-- Fixed navbar -->
      <div class="navbar navbar-default navbar-fixed-top" role="navigation">
        <div class="container">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">ADMIN NAME</a>
          </div>
          <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
              <li class="active"><a href="#">Home</a></li>
              <li><a href="<c:url value="listHotels"/>">Add/delete Hotel</a></li>
              <li>
              	<a href="#contact" class="dropdown-toggle" data-toggle="dropdown">Apartment menu<b class="caret"></b></a>
                <ul class="dropdown-menu">
                  <li><a href="<c:url value="listApartments"/>">Show apartment list</a></li>
                  <li><a href="#">Add apartment</a></li>
                </ul>
              </li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">User menu <b class="caret"></b></a>
                <ul class="dropdown-menu">
                  <li><a href="<c:url value="listClients"/>">Show user list</a></li>
                </ul>
              </li>
            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </div>

	<div class="panel panel-default">
		<div class="panel-heading">Clients list</div>
		<table class="table">
			<thead>
				<tr>
					<th>Login</th>
					<th>Name</th>
					<th>Middle Name</th>
					<th>Last Name</th>
					<th>Password</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="client" items="${clients}">
					<tr>
						<td>${client.userName}</td>
						<td>${client.firstName}</td>
						<td>${client.middleName}</td>
						<td>${client.lastName}</td>
						<td>${client.password}</td>
						<td>${client.email}</td>
						<td><a class="btn remove" href="<c:url value="/remove/${client.id}"/>">Remove</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
		
    </div>
	
	<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="resources/js/bootstrap.min.js"></script>
</body>
</html>