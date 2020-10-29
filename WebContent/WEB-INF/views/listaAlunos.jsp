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
	<c:if test="${not empty aluno }">
		Aluno ${ aluno } cadastrado com sucesso!
	</c:if>
	
	<h2>Lista de Alunos:</h2>
	<ul>
		<c:forEach items="${ alunos }" var="aluno">
			<li>
				${ aluno.nome } - ${ aluno.turma }
			</li>
		</c:forEach>
	</ul>
	
</body>
</html>