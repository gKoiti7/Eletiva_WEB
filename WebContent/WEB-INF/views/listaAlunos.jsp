<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
	
	<div class="container">
		<h2>Lista de Alunos:</h2>
		
		<table class="table mt-5">
			<thead>
				<tr>
					<th scope="col">Nome</th>
					<th scope="col">Turma</th>
					<th scope="col"></th>
					<th scope="col"></th>
				</tr>
			</thead>
			
			<tbody>
			
			<c:forEach items="${ alunos }" var="aluno">
				<tr>
				
					<th>${ aluno.nome }</th>
					<th>${ aluno.turma }</th>
					<th><a href="/EletivaWeb/entrada?action=SelectAluno&id=${ aluno.id }">Editar</a></th>
					<th><a href="/EletivaWeb/entrada?action=Delete&nome=aluno&id=${ aluno.id }">Excluir</a></th>
				
				</tr>
			</c:forEach>
			
			</tbody>

		</table>
			
	</div>
		
</body>
</html>