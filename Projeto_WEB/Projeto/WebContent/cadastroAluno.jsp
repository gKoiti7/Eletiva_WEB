<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
<%@ include file="parts/meta.jsp" %>
 
<title>Insert title here</title>

<!-- Principal CSS do Bootstrap -->
		<link href="../../dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Estilos customizados para esse template -->
		<link href="form-validation.css" rel="stylesheet">
		

<%@ include file="parts/header.jsp" %>
</head>

    <body class="bg-light">

    <div class="container">
      <div class="py-5 text-center">
        <h2>Cadastrar Aluno</h2>
        <p class="lead">Esta seção do AGIS necessita das seguintes informações do aluno(a):</br>RG, CPF</p>
      </div>
		
      <div class="row">
        
        <div class="col-md-8 order-md-1">
          <h4 class="mb-3">Cadastro de Alunos</h4>
			
          <form class="needs-validation" novalidate="" method="post" action="cadastro.jsp">
		  
            <div class="row">
              <div class="col-md-6 mb-3">
                <label for="Nome">Nome completo do aluno</label>
                <input type="text" class="form-control" id="Nome" placeholder="Gustavo" value="" required="" name="nome">
                <div class="invalid-feedback">
                  É obrigatório inserir um nome válido.
                </div>
              </div>
            </div>
			
			 <div class="row">
              <div class="col-md-6 mb-3">
                <label for="RG">RG do aluno</label>
                <input type="number" class="form-control" id="RG" placeholder="012345678" value="" required="" name="rg">
                <div class="invalid-feedback">
                  É obrigatório inserir um RG válido.
                </div>
              </div>
            </div>
			
			 <div class="row">
              <div class="col-md-6 mb-3">
                <label for="CPF">CPF do aluno</label>
                <input type="number" class="form-control" id="CPF" placeholder="01234567890" value="" required="" name="cpf">
                <div class="invalid-feedback">
                  É obrigatório inserir um CPF válido.
                </div>
              </div>
            </div>

            <div class="mb-3">
              <label for="email">Email <span class="text-muted">(Opcional)</span></label>
              <input type="text" class="form-control" id="email" placeholder="fulano@exemplo.com" name="e-mail">
              <div class="invalid-feedback">
                Por favor, insira um endereço de e-mail válido.
              </div>
            </div>
			
			 <div class="row">
              <div class="col-md-3 mb-3">
                <label for="cc-expiracao">Ano de nascimento</label>
                <input type="number" class="form-control" id="cc-expiracao" placeholder="2001" required="" name="nascimento">
                <div class="invalid-feedback">
                  Ano de nascimento é obrigatório.
                </div>
              </div>
            </div>

            <h4 class="mb-3">Curso do aluno</h4>
            <div class="d-block my-3">
			
              <div class="custom-control custom-radio">
                <input id="analise" name="aval" type="radio" class="custom-control-input" checked="" required="" value="Análise e Desenvolvimento de Sistemas">
                <label class="custom-control-label" for="analise">Análise e Desenvolvimento de Sistemas</label>
              </div>
			  
              <div class="custom-control custom-radio">
                <input id="agro" name="aval" type="radio" class="custom-control-input" required="" value="Agronegócio">
                <label class="custom-control-label" for="agro">Agronegócio</label>
              </div>
			  
              <div class="custom-control custom-radio">
                <input id="rh" name="aval" type="radio" class="custom-control-input" required="" value="Recursos Humanos">
                <label class="custom-control-label" for="rh">Recursos Humanos</label>
              </div>
			  
			  <div class="custom-control custom-radio">
                <input id="secretariado" name="aval" type="radio" class="custom-control-input" required="" value="Secretariado">
                <label class="custom-control-label" for="secretariado">Secretariado</label>
              </div>
			  
			  <div class="custom-control custom-radio">
                <input id="adm" name="aval" type="radio" class="custom-control-input" required="" value="Administração">
                <label class="custom-control-label" for="adm">Administração</label>
              </div>
			  
            </div>

			<center>
            <hr class="mb-4">
            <button class="btn btn-primary btn-lg btn-block" type="submit">Cadastrar</button>
			</center>
			
			</br>
			
          </form>
        </div>
      </div>

    </div>

    <!-- Principal JavaScript do Bootstrap
    ================================================== -->
    <!-- Foi colocado no final para a página carregar mais rápido -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery-slim.min.js"><\/script>')</script>
    <script src="../../assets/js/vendor/popper.min.js"></script>
    <script src="../../dist/js/bootstrap.min.js"></script>
    <script src="../../assets/js/vendor/holder.min.js"></script>
    <script>
      // Exemplo de JavaScript para desativar o envio do formulário, se tiver algum campo inválido.
      (function() {
        'use strict';

        window.addEventListener('load', function() {
          // Selecione todos os campos que nós queremos aplicar estilos Bootstrap de validação customizados.
          var forms = document.getElementsByClassName('needs-validation');

          // Faz um loop neles e previne envio
          var validation = Array.prototype.filter.call(forms, function(form) {
            form.addEventListener('submit', function(event) {
              if (form.checkValidity() === false) {
                event.preventDefault();
                event.stopPropagation();
              }
              form.classList.add('was-validated');
            }, false);
          });
        }, false);
      })();
    </script>

</body>

<%@ include file="parts/footer.jsp" %> 

</html>