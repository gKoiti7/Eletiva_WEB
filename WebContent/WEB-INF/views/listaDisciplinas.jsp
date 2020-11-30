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
		<h2>Lista de Disciplinas:</h2>
		
		<table class="table mt-5">
			<thead>
				<tr>
					<th scope="col">Nome</th>
					<th scope="col">Carga Horária</th>
					<th scope="col">Ementa</th>
					<th scope="col"></th>
					<th scope="col"></th>
				</tr>
			</thead>
			
			<tbody>
			
			<c:forEach items="${ disciplinas }" var="disciplina">
				<tr>
					<th>${ disciplina.nome }</th>
					<th>${ disciplina.cargaHoraria } h</th>
					<th>${ disciplina.ementa }</th>
					<th><a href="/EletivaWeb/entrada?action=SelectDisciplina&id=${ disciplina.id }">Editar</a></th>
					<th><a href="/EletivaWeb/entrada?action=Delete&nome=disciplina&id=${ disciplina.id }">Excluir</a></th>
				</tr>
			</c:forEach>
					
			</tbody>
		</table>
			
	</div>
	
</body>
</html>
