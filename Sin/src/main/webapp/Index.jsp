
   
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Cache-Control" content="no-store" />
<meta charset="ISO-8859-1">
<title>Login</title>
<!--

<script
  src="https://code.jquery.com/jquery-3.3.1.min.js"
  integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
  crossorigin="anonymous"></script> 
  
 -->	
 
	<script src="http://code.jquery.com/jquery-latest.min.js"></script>
   <link rel="stylesheet" href="index.css"/>
   <script src="Testindex.js"></script>
</head>
<body>
 <%
    response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
	response.setHeader("Pragma","no-cache");
	response.setHeader("Expires","0");
	
	if(session.getAttribute("name")!=null){
		response.sendRedirect("/Welcome.jsp");
	}
%>
	
		<div>
	
<!-- 	<form id="formL" method="post"onsubmit="test()"name="formL">
 -->
		Userid : <input type="text" name="userid"id="userid"><br><br>
		Password : <input type="password" name="pass"id="password"><br><br>
		<input type="submit" value="Sign in" id="submit"></input><br><br>
	<!-- form -->
		<a href="Signup.html"><button>Sign up </button></a>
	</div>
		
	
</body>
</html>