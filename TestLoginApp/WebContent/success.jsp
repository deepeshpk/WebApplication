<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ page import="java.util.List, sample.UserBean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Login successfull</h1>
 <title>   User Logged Successfully   </title>
      </head>
	         <center>
	         Welcome <jsp:expression>session.getAttribute("Username")</jsp:expression> 
	         Your Password is  <jsp:expression>session.getAttribute("Password")</jsp:expression> 
	         </center>
      </body>
</html>