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
			<h2>Sistema de Gestão Acadêmica </h2>
			<label></label>
		</nav>
	</header>
	
	<main>
		<div id="menuCadastro">
		<h1 class="subtitulo">Cadastro: </h1>
			<form style="border-right:1px solid #FF6F7C;height:70px" class="menu-main" action="${ linkEntradaServlet }" method="get">
				<li class="li-index">
					<input type="hidden" name="action" value="Form" />
					<input type="hidden" name="form" value="aluno" />
					<button class="btn menu-header" type="submit">Aluno</button>
				</li>
			</form>
			<form style="border-right:1px solid #FF6F7C;height:70px" class="menu-main" action="${ linkEntradaServlet }" method="get">	
				<li class="li-index">
					<input type="hidden" name="action" value="Form" />
					<input type="hidden" name="form" value="professor" />
					<button class="btn menu-header" type="submit">Professores</button>
				</li>	
			</form>	
			<form style="border-right:1px solid #FF6F7C;height:70px" class="menu-main" action="${ linkEntradaServlet }" method="get">	
				<li class="li-index">
					<input type="hidden" name="action" value="Form" />
					<input type="hidden" name="form" value="curso" />
					<button class="btn menu-header" type="submit">Curso</button>
				</li>
			</form>	
			<form style="border-right:1px solid #FF6F7C;height:70px" class="menu-main" action="${ linkEntradaServlet }" method="get">	
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
		</div>
		
		<div id="menuCadastro">
		<h1 class="subtitulo">Consulta: </h1>
			<form style="border-right:1px solid #FF6F7C;height:70px" class="menu-main" action="${ linkEntradaServlet }" method="get">
				<li class="li-index">
					<input type="hidden" name="action" value="ShowAlunos" />
					<input type="hidden" name="lista" value="aluno" />
					<button class="btn menu-header" type="submit">Aluno</button>
				</li>
			</form>
			<form style="border-right:1px solid #FF6F7C;height:70px" class="menu-main" action="${ linkEntradaServlet }" method="get">	
				<li class="li-index">
					<input type="hidden" name="action" value="ShowProfessores" />
					<input type="hidden" name="lista" value="professor" />
					<button class="btn menu-header" type="submit">Professores</button>
				</li>	
			</form>	
			<form style="border-right:1px solid #FF6F7C;height:70px" class="menu-main" action="${ linkEntradaServlet }" method="get">	
				<li class="li-index">
					<input type="hidden" name="action" value="ShowCursos" />
					<input type="hidden" name="lista" value="curso" />
					<button class="btn menu-header" type="submit">Curso</button>
				</li>
			</form>	
			<form style="border-right:1px solid #FF6F7C;height:70px" class="menu-main" action="${ linkEntradaServlet }" method="get">	
				<li class="li-index">
					<input type="hidden" name="action" value="ShowDisciplinas" />
					<input type="hidden" name="lista" value="disciplina" />
					<button class="btn menu-header" type="submit">Disciplina</button>
				</li>
			</form>
			<form class="menu-main" action="${ linkEntradaServlet }" method="get">	
				<li class="li-index">
					<input type="hidden" name="action" value="ShowTurmas" />
					<input type="hidden" name="lista" value="turma" />
					<button class="btn menu-header" type="submit">Turma</button>
				</li>
			</form>
		</div>
	</main>
	
	<footer>		
			<p>Projeto da disciplina Eletiva-Web</p>
			<p>Professor: Claudio Jose Silva Gomes</p>	
	</footer>
</body>
</html>
