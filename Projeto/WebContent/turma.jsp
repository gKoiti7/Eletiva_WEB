<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" />
<link rel="StyleSheet" type="text/css" href="./css/style.css" media="screen" >
<title>Insert title here</title>
</head>
<body>
	
	<main class="container">		
		<form class="form-area" action='TurmaController' method="post">
			<h1>Cadastrando nova Turma:</h1>
			
			<div class="form-group">
				<label for="idTurma">Id:</label>
				<input class="form-control" type="text" name="id" id="idTurma" value="<c:out value="${user.id}" />" readonly="readonly"/>
			</div>
			
			<div class="form-group">
				<label for="nomeTurma">Nome:</label>
				<input class="form-control" type="text" name="nome" id="nomeTurma" value="<c:out value="${user.nome}" />" />
			</div>
			
			<div class="form-group">
				<label for="descricaoTurma">Descri��o:</label>
				<input class="form-control" type="text" name="descricao" id="descricaoTurma" value="<c:out value="${user.descricao}" />"/>
			</div>
			
			<div class="form-footer">
				<button type="submit" class="btn btn-secondary">Cadastrar</button>
				<a class="btn btn-secondary" href="index.jsp" role="button">Voltar</a>
			</div>			
		</form>
	</main>
</body>
</html>