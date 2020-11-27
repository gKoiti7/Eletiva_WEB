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
	<c:import url="header.jsp" />
	
	<main class="container">		
		<form class="form-area" action="${ linkEntradaServlet }" method="post">
			<h1>Editando Professor:</h1>
			
			<div class="form-group">
				<label for="nomeProfessor">Nome do Professor:</label>
				<input class="form-control" value="${ professor.nome }" type="text" name="nomeProfessor" id="nomeProfessor" />
			</div>
			
			<div class="form-group">
				<label for="titulacaoProfessor">Titulação:</label>
				<input class="form-control" value="${ professor.titulacao }" type="text" name="titulacaoProfessor" id="titulacaoProfessor" />
			</div>
			
			<input type="hidden" name="idProfessor" value="${ professor.id }" />
			
			<input type="hidden" name="action" value="EditProfessor" />
			
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