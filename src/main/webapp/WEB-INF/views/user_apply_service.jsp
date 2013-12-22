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
            <a class="navbar-brand" href="#">${client.getUserName()}</a>
          </div>
		  <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
              <li class="active"><a href="#">Home</a></li>
              <li><a href="#about">My Profile</a></li>
              <li><a href="<c:url value="reservate"/>">Make a reservation</a></li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
                <ul class="dropdown-menu">
                  <li><a href="#">Action</a></li>
                  <li><a href="#">Another action</a></li>
                  <li><a href="#">Something else here</a></li>
                  <li class="divider"></li>
                  <li class="dropdown-header">Nav header</li>
                  <li><a href="#">Separated link</a></li>
                  <li><a href="#">One more separated link</a></li>
                </ul>
              </li>
            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </div>

	<div class="panel panel-default">
		<div class="panel-heading">Choose your services</div>
		<table class="table">
			<thead>
				<tr>
					<th>Name</th>
					<th>Cost</th>
					<th>Info</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="service" items="${services}">
					<tr>
						<td>${service.name}</td>
						<td>${service.cost}</td>
						<td>${service.info}</td>
						<td><a class="btn remove" href="<c:url value="/userAddService/${service.id}"/>">Add Service</a></td>
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