<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<%@ include file="parts/meta.jsp" %>
 
<title>Insert title here</title>

<%@ include file="parts/header.jsp" %>
</head>

<body>
	<div>
        <div class="container justify-content-center align-items-center text-center">
            <div class="row ">
                <div class="col-12 py-5 text-center">
                    <p class="titulo"><h1>AGIS - Sistema Acadêmico</h1></p>
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
                <!--<img class="card-img-top" data-src="holder.js/100px225?theme=thumb&amp;bg=55595c&amp;fg=eceeef&amp;text=Thumbnail" alt="Thumbnail [100%x225]" style="height: 225px; width: 100%; display: block;" src="presença.png" data-holder-rendered="true">-->
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

<%@ include file="parts/footer.jsp" %> 

</html>
<!-- 
<h1>Cadastro de Nomes</h1>
<br>
<form name="formulario" action="cadastro.jsp" method="post">
	<input type="text" name="nome">
	<input type="submit">
</form>
-->