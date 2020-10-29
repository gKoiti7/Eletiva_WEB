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
	
	<h2>Lista de Cursos:</h2>
	<ul>
		<c:forEach items="${ cursos }" var="curso">
			<li>
				${ curso.nome } - ${ curso.periodicidade } - ${ curso.descricao }
			</li>
		</c:forEach>
	</ul>
	
</body>
</html>