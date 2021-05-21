<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	HttpSession sesion = (HttpSession) request.getSession();
	String nombreimagen = String.valueOf(sesion.getAttribute("nombre"));
%>
<img alt="NoSeAbrio" src="Archivos/<%=nombreimagen%>" >
<h1><%=nombreimagen%></h1>
<a href="Archivos/Dramatization.pdf">Abrir PDF</a>
</body>
</html>