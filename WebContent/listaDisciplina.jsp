<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<c:url value="/entrada" var="linkEntradaServlet"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" />
<link rel="StyleSheet" type="text/css" href="css/style.css" media="screen" >
<title>Insert title here</title>
</head>
<body>
	<header>
		<nav class="navbar">
			<img class="img.fluid" src="img/logo2.png" />
			<h2>Sistema de Gestão Acadêmica </h2>
			<label></label>
		</nav>
	</header>
	
	<div class="list">
	<table style="width:100%">
		<tr>
			<th>Nome</th>
			<th>Carga horária</th>
			<th>Ementa</th>
		</tr>
		<tr>
			<th>materia 1</th>
			<th>18:00 as 19:00</th>
			<th>descrição</th>
		</tr>
		<tr>
			<th>materia 2</th>
			<th>18:00 as 19:00</th>
			<th>descrição</th>
		</tr>
		<tr>
			<th>materia 3</th>
			<th>18:00 as 19:00</th>
			<th>descrição</th>
		</tr>
		<tr>
			<th>materia 4</th>
			<th>18:00 as 19:00</th>
			<th>descrição</th>
		</tr>
		<tr>
			<th>materia 5</th>
			<th>18:00 as 19:00</th>
			<th>descrição</th>
		</tr>
	</table>
	</div>

</body>