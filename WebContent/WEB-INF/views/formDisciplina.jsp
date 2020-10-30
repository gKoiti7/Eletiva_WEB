<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<c:url value="/entrada" var="linkEntradaServlet"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" />
<link rel="StyleSheet" type="text/css" href="./css/style.css" media="screen" >
<title>Insert title here</title>
</head>
<body>
	<header>
		<nav class="navbar">
			<a href="index.jsp">
				<img class="img.fluid" src="img/logo.png" />
			</a>			
			<h2>Sistema de Gestão Acadêmica </h2>
			<label></label>
		</nav>
	</header>
	
	<main class="container">		
		<form class="form-area" action="#" method="post">
			<h1>Cadastrando nova Disciplina:</h1>
			
			<div class="form-group">
				<label for="nomeDisciplina">Nome da Disciplina:</label>
				<input class="form-control" type="text" name="nomeDisciplina" id="nomeDisciplina" />
			</div>
			
			<div class="form-group">
				<label for="cargaDisciplina">Carga Horária:</label>
				<input class="form-control" type="text" name="cargaDisciplina" id="cargaDisciplina" />
			</div>
			
			<div class="form-group">
				<label for="ementaDisciplina">Ementa:</label>
				<textarea class="form-control" name="ementaDisciplina" id="ementaDisciplina" rows="3"></textarea>
			</div>
			
			<div class="form-footer">
				<button type="submit" class="btn btn-secondary">Cadastrar</button>
				<a class="btn btn-secondary" href="index.jsp" role="button">Voltar</a>
			</div>
			
		</form>
	</main>
	
	<footer>		
					
	</footer>
</body>
</html>