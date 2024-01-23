<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello declare</title>
</head>
<body>
	<%! int x=10, y, z=0; %>
	<% y=200;
		z=x+y;
		out.append("Answer: ");
		out.append(String.valueOf(z));
	%>
	<h1>Hoac la ta xuat kieu expression</h1>
	<hr>
	<%="Answer: " %>
	<%=z %>
</body>
</html>