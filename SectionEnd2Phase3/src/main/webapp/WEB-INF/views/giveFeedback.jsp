<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Leave feedback</title>
</head>
<body>
	<form action = "giveFeedback" method = "post">
		Name: <input type = "text" name = "name">
		Feedback: <input type = "text" name="message">
		<br>
		<br>
		<button type = submit>Submit Feedback</button>
		
	</form>
</body>
</html>