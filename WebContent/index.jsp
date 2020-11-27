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
			<a href="index.jsp">
				<img class="img.fluid" src="img/logo.png" />
			</a>			
			<h2>Sistema de Gest�o Acad�mica </h2>
			<label></label>
		</nav>
	</header>
	
	<main>
		<form class="menu-main" action="${ linkEntradaServlet }" method="get">
			<li class="li-index">
				<input type="hidden" name="action" value="Form" />
				<input type="hidden" name="form" value="aluno" />
				<button class="btn menu-header" type="submit">Aluno</button>
			</li>
		</form>
		<form class="menu-main" action="${ linkEntradaServlet }" method="get">	
			<li class="li-index">
				<input type="hidden" name="action" value="Form" />
				<input type="hidden" name="form" value="professor" />
				<button class="btn menu-header" type="submit">Professores</button>
			</li>	
		</form>	
		<form class="menu-main" action="${ linkEntradaServlet }" method="get">	
			<li class="li-index">
				<input type="hidden" name="action" value="Form" />
				<input type="hidden" name="form" value="curso" />
				<button class="btn menu-header" type="submit">Curso</button>
			</li>
		</form>	
		<form class="menu-main" action="${ linkEntradaServlet }" method="get">	
			<li class="li-index">
				<input type="hidden" name="action" value="Form" />
				<input type="hidden" name="form" value="disciplina" />
				<button class="btn menu-header" type="submit">Disciplina</button>
			</li>
		</form>
		<form class="menu-main" action="${ linkEntradaServlet }" method="get">	
			<li class="li-index">
				<input type="hidden" name="action" value="Form" />
				<input type="hidden" name="form" value="turma" />
				<button class="btn menu-header" type="submit">Turma</button>
			</li>
		</form>
	</main>
	
	<footer>		
			<p>Projeto da disciplina Eletiva-Web</p>
			<p>Professor: Claudio Jose Silva Gomes</p>	
	</footer>
</body>
</html>