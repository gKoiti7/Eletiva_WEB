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
			<img class="img.fluid" src="img/logo2.png" />
			<h2>Sistema de Gestão Acadêmica </h2>
			<label></label>
		</nav>
	</header>
	
	<main>
		<ul class="menu-main">
			<li class="li-index">
				<a class="btn menu-header" href="/EletivaWeb/formAluno.jsp" role="button">
					Alunos
				</a>
			</li>
			
			<li class="li-index">
				<a class="btn menu-header" href="/EletivaWeb/formProfessor.jsp" role="button">
					Professores
				</a>
			</li>	
					
			<li class="li-index">
				<a class="btn menu-header" href="/EletivaWeb/formCurso.jsp" role="button">				
					Cursos
				</a>
			</li>
			
			<li class="li-index">
				<a class="btn menu-header" href="/EletivaWeb/formDisciplina.jsp" role="button">
					Disciplinas
				</a>
			</li>
			
			<li class="li-index">
				<a class="btn menu-header" href="/EletivaWeb/formTurma.jsp" role="button">
					Turmas
				</a>
			</li>
		</ul>
	</main>
	
	<footer>		
			<p>Projeto da disciplina Eletiva-Web</p>
			<p>Professor: Claudio Jose Silva Gomes</p>	
	</footer>
</body>
</html>