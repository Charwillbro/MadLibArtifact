<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MadLib Adventures</title>
</head>
<body>
	<form action="emergencyBroadcast" method="post">

		<h1>
			Make your own Emergency Alert <br>
		</h1>
		<h2>Ever wanted to warn your friends of impending disaster? Now
			you can!</h2>

		What doom will befall you and your friends?: <input type="text"
			name="yourDoom" size="20"> <br> 
			Enter your State: <input
			type="text" name="doomLocation" size="20"><br> <input
			type="radio" name="drill"
			value="This has been a test of the Emergency Broadcast System."
			checked> This is just a Drill<br> <input type="radio"
			name="drill" value="THIS IS NOT A DRILL!!" checked> NOT A
		DRILL! NOT A DRILL!<br> 
		<input type="submit" value="Call Servlet" />
	</form>
</body>
</html>