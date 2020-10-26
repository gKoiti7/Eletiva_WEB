<!DOCTYPE html>
<html lang="pt-br">

    <?php
		include('templates/header.php');
	?>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<meta name="description" content="">
		<meta name="author" content="">
		<link rel="icon" href="../../../../favicon.ico">

		<title>Pesquisar Aluno</title>

		<!-- Principal CSS do Bootstrap -->
		<link href="../../dist/css/bootstrap.min.css" rel="stylesheet">

		<!-- Estilos customizados para esse template -->
		<link href="form-validation.css" rel="stylesheet">
	</head>

    <body class="bg-light">

    <div class="container">
      <div class="py-5 text-center">
        <h2>Pesquisar Aluno</h2>
        <p class="lead">Esta seção do AGIS necessita das seguintes informações do aluno(a):</br>CPF</p>
      </div>
	  
		<?php
					if(isset($_SESSION['msg'])){
						echo $_SESSION['msg'];
						unset($_SESSION['msg']);
					}
					echo "</br>";
		?>
		
      <div class="row">
        
        <div class="col-md-8 order-md-1">
          <h4 class="mb-3">Inserir dados</h4>
			
          <form class="needs-validation" novalidate="" method="get" action="puxar.php">
		  
            <div class="row">
              <div class="col-md-6 mb-3">
                <label for="cpf">CPF do aluno</label>
                <input type="number" class="form-control" id="cpf" placeholder="01234567890" value="" required="" name="cpf">
                <div class="invalid-feedback">
                  É obrigatório inserir um CPF válido.
                </div>
              </div>
            </div>
			
			<center>
            <hr class="mb-4">
            <button class="btn btn-primary btn-lg btn-block" type="submit">Buscar</button>
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

    <?php
		include('templates/footer.php');
	?>

</html>