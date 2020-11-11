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
			<img src="img/logo.png" />
		</nav>
	</header>
	
	<main class="container">		
		<form class="form-area" action="#" method="post">
			<h1>Cadastrando novo Aluno:</h1>
			
			<div class="form-group">
				<label for="nomeAluno">Nome do Aluno:</label>
				<input class="form-control" type="text" name="nomeAluno" id="nomeAluno" />
			</div>
			
			<div class="form-group">
				<label for="turmaAluno">Turma:</label>
				<input class="form-control" type="text" name="turmaAluno" id="turmaAluno" />
			</div>
			
			<div class="form-footer">
				<button type="submit" class="btn btn-secondary" href="listaAluno.jsp">Cadastrar</button>
				<a class="btn btn-secondary" href="index.jsp" role="button">Voltar</a>
			</div>			
		</form>
	</main>
	
	<footer>		
				
	</footer>
</body>
</html>