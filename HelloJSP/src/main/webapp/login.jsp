<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login JSP</title>
</head>
<body>
	<%! String tenDN = request.getParameter("name");
	String mk = request.getParameter("pass");
	
	if(tenDn.equals("ABC") && mk.equals("MNK")) 
		response.sendRedirect(UserProfile.html);
		else response.sendRedirect(login.html);%>

		
		
		
</body>
</html>