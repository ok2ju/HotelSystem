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

	  <c:url value="/addApartment" var="addApartmentUrl"></c:url>
		<form:form action="${addApartmentUrl}" method="POST" modelAttribute="apartment">
			<label>Number of room:</label>
		    <form:input path="numberOfRoom" placeholder="Number of room" class="input_field" size="20" maxlength="50" type="text" AUTOCOMPLETE="off" />
		    <label>Class apartment:</label>
		    <form:input path="classApartment" placeholder="Class apartment" class="input_field" size="20" maxlength="50" AUTOCOMPLETE="off"/>
		    <label>Count of rooms:</label>
		    <form:input path="numberOfRooms" placeholder="Count of rooms" class="input_field" size="20" maxlength="5550" AUTOCOMPLETE="off"/>
		    <label>Floor:</label>
		    <form:input path="floor" placeholder="Floor" class="input_field" size="20" maxlength="50" AUTOCOMPLETE="off"/>
		    <label>Info:</label>
		    <form:input path="info" placeholder="Info" class="input_field" size="20" maxlength="10000" AUTOCOMPLETE="off"/>
		    <label>Cost:</label>
		    <form:input path="cost" placeholder="Cost" class="input_field" size="20" maxlength="10000" AUTOCOMPLETE="off"/>
		    <input class="input_submit" type="submit" value="ADD" />
		</form:form>
		
    </div>
	
	<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="resources/js/bootstrap.min.js"></script>
</body>
</html>