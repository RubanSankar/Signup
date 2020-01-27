<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logged Out</title>
</head>
<body>
	<%
	    response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
		response.setHeader("Pragma","no-cache");
		response.setHeader("Expires","0");
		if(session.getAttribute("name")!=null){
			response.sendRedirect("/Welcome.jsp");
		}
		else
		{	
			
//			 RequestDispatcher rd=request.getRequestDispatcher("/");
//			rd.include(request, response);
			 response.sendRedirect("/");
			 
		}
	
	%>
	
	<h3>You have been logged out</h3>
</body>
</html>