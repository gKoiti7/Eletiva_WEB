<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h2>Lista de Alunos:</h2>
	<ul>
		<c:forEach items="${ alunos }" var="aluno">
			<li>
				${ aluno.nome } - ${ aluno.turma }
				<a href="/EletivaWeb/entrada?action=SelectAluno&id=${ aluno.id }">Editar</a>
				<a href="/EletivaWeb/entrada?action=Delete&nome=aluno&id=${ aluno.id }">Excluir</a>
			</li>
		</c:forEach>
	</ul>
	
</body>
</html>