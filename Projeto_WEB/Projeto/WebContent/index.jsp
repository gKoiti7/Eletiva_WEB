<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
	
    <link rel="shortcut icon" href="assets/imagens/logo.png" sizes="32x32" type="image/png">
    <link rel="canonical" href="https://getbootstrap.com/docs/4.0/components/navbar/">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
	
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
	
    <link href="https://cdn.jsdelivr.net/npm/docsearch.js@2/dist/cdn/docsearch.min.css" rel="stylesheet">
  
<title>Insert title here</title>

<header>  
<nav class="navbar navbar-light" style="background-color: #BDC3C7">
  <!-- Conte�do do navbar -->
            <a class="navbar-brand" href="index.php"></a>   
			
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"  aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
			
			<div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
				<li class="nav-item active">
                    <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
				</li>
				<li class="nav-item">
                    <a class="nav-link" href="quemsomos.jsp">Desenvolvedores do AGIS</a>
				</li>
				<li class="nav-item">
                    <a class="nav-link" href="sobreosite.jsp">Sobre o AGIS</a>
				</li>
				</ul>
			</div>	
</nav>			
</header>

</head>
<body>

<div>
        <div class="container justify-content-center align-items-center text-center">
            <div class="row ">
                <div class="col-12 py-5 text-center">
                    <p class="titulo"><h1>AGIS - Sistema Acad�mico</h1></p>
                </div>
            </div>
        </div>
    </div>

	<main role="main">

      <div class="album py-5 bg-light">
        <div class="container">
          <div class="row">
		  
            <div class="col-md-4">
              <div class="card mb-4 shadow-sm">
                <!--<img class="card-img-top" data-src="holder.js/100px225?theme=thumb&amp;bg=55595c&amp;fg=eceeef&amp;text=Thumbnail" alt="Thumbnail [100%x225]" style="height: 225px; width: 100%; display: block;" src="aluno.png" data-holder-rendered="true">-->
                <div class="card-body">
					<p class="card-text">
						<h3><a href= "cadastroAluno.jsp">Cadastrar Aluno</a></h3>
					</p>
                </div>
              </div>
            </div>
			
            <div class="col-md-4">
              <div class="card mb-4 shadow-sm">
                <!--<img class="card-img-top" data-src="holder.js/100px225?theme=thumb&amp;bg=55595c&amp;fg=eceeef&amp;text=Thumbnail" alt="Thumbnail [100%x225]" style="height: 225px; width: 100%; display: block;" src="nota.png" data-holder-rendered="true">-->
                <div class="card-body">
					<p class="card-text">
						<h3><a href= "cadastroAluno.jsp">Cadastrar Professor</a></h3>
					</p>
                </div>
              </div>
            </div>
			
			<div class="col-md-4">
              <div class="card mb-4 shadow-sm">
                <!--<img class="card-img-top" data-src="holder.js/100px225?theme=thumb&amp;bg=55595c&amp;fg=eceeef&amp;text=Thumbnail" alt="Thumbnail [100%x225]" style="height: 225px; width: 100%; display: block;" src="presen�a.png" data-holder-rendered="true">-->
                <div class="card-body">
					<p class="card-text">
						<h3><a href= "cadastroAluno.jsp">Listar Registros</a></h3>
					</p>
                </div>
              </div>
            </div>
			
          </div>
        </div>
      </div>
	  
    </main>

</body>

<footer class="footer mt-auto py-3" style="background-color: #BDC3C7">
		
    <div class="text-center">
        <p class="texto-footer m-0">
            <a href="quemsomos.jsp">
				Desenvolvido por:
				Gustavo Koiti Kuwabata/
				Luciana Miki Ochiai/
				Raphael Rugna Vaqueiro<br>
				Fatec MC 2020
			</a>
        </p>
    </div>
	
</footer>

</html>
<!-- 
<h1>Cadastro de Nomes</h1>
<br>
<form name="formulario" action="cadastro.jsp" method="post">
	<input type="text" name="nome">
	<input type="submit">
</form>
-->