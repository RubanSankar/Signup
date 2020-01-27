<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<link rel="stylesheet" href="index.css"/>
</head>
<body>
<input type="hidden" id="refreshed" value="no">
  
<% response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
  response.setHeader("Pragma","no-cache");
  response.setHeader("Expires","0"); %>
  <%
  
  if(session.getAttribute("name")==null)
	  
	  response.sendRedirect("/");
	  
	  
	  
	  
  %>
<%="Welcome "+(String)session.getAttribute("name") %>
<form action="/Logout" method="post">
<div>
<% response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
  response.setHeader("Pragma","no-cache");
  response.setHeader("Expires","0"); %>

<button>LOG OUT</button>
</div>
</form>

</body>
</html>