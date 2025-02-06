<%@page import="model.MayTinh"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		double kq = MayTinh.cong(100, 50);
	%>
	<%= kq %>
</body>
</html>