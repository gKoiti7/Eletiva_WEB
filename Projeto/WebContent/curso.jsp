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
		<form class="form-area" action='CursoController' method="post">
			<h1>Cadastrando novo Curso:</h1>
			
			<div class="form-group">
				<label for="idCurso">Id:</label>
				<input class="form-control" type="text" name="id" id="idCurso" value="<c:out value="${cursos.id}" />" readonly="readonly"/>
			</div>
			
			<div class="form-group">
				<label for="nomeCurso">Nome:</label>
				<input class="form-control" type="text" name="nome" id="nomeCurso" value="<c:out value="${cursos.nome}" />" />
			</div>
			
			<div class="form-group">
				<label for="periodicidadeCurso">Periodicidade:</label>
				<input class="form-control" type="text" name="periodicidade" id="periodicidadeCurso" value="<c:out value="${cursos.periodicidade}" />"/>
			</div>
			
			<div class="form-group">
				<label for="descricaoCurso">Descrição:</label>
				<input class="form-control" type="text" name="descricao" id="descricaoCurso" value="<c:out value="${cursos.descricao}" />"/>
			</div>
			
			<div class="form-footer">
				<button type="submit" class="btn btn-secondary">Cadastrar</button>
				<a class="btn btn-secondary" href="index.jsp" role="button">Voltar</a>
			</div>			
		</form>
	</main>
</body>
</html>