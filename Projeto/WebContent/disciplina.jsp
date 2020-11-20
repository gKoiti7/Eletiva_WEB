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
		<form class="form-area" action='DisciplinaController' method="post">
			<h1>Cadastrando nova Disciplina:</h1>
			
			<div class="form-group">
				<label for="idDisciplina">Id:</label>
				<input class="form-control" type="text" name="id" id="idDisciplina" value="<c:out value="${user.id}" />" readonly="readonly"/>
			</div>
			
			<div class="form-group">
				<label for="nomeDisciplina">Nome:</label>
				<input class="form-control" type="text" name="nome" id="nomeDisciplina" value="<c:out value="${user.nome}" />" />
			</div>
			
			<div class="form-group">
				<label for="cargaDisciplina">Carga:</label>
				<input class="form-control" type="text" name="carga" id="cargaDisciplina" value="<c:out value="${user.cargaHoraria}" />"/>
			</div>
			
			<div class="form-group">
				<label for="ementaDisciplina">Ementa:</label>
				<input class="form-control" type="text" name="ementa" id="ementaDisciplina" value="<c:out value="${user.ementa}" />"/>
			</div>
			
			<div class="form-footer">
				<button type="submit" class="btn btn-secondary">Cadastrar</button>
				<a class="btn btn-secondary" href="index.jsp" role="button">Voltar</a>
			</div>			
		</form>
	</main>
</body>
</html>