<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
   <meta charset="ISO-8859-1">
   <title>Secret Code </title>
</head>
<body>
<h1> What is the Code ? </h1>
<form action="/" method="POST">
<p><c:out value="${ error }"></c:out></p>
 <input type="text" name="input">
 <input type="submit" value="Try Code" >
</form>

</body>
</html>