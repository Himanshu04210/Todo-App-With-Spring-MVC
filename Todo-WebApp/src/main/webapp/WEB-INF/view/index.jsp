<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
 	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
	

</head>
<body>
	<!-- <h1 onclick="sayHello()">click me</h1> -->
	<h2>Welcome to todo-app</h2>
	
	<form:form>
	
		<input type="text" name="name" placeholder="Enter your name"/>
		<input type="email" name="email" placeholder="Enter you email"/>
		<input type="password" name="password" placeholder="Enter a sucure password"/>
		<input type="text" name="mobileNo" placeholder="Enter your mobile number"/>
	
	
	</form:form>
	
</body>
<!-- <script type="text/javascript">
	function sayHello() {
		var name = prompt("Enter your name here");
		var greeting = "Hello " + name;
		alert(greeting);
	}
	
</script> -->
</html>