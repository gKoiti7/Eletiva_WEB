<?php
	session_start();
	//include_once("conexao.php");

	$nome=filter_input(INPUT_GET, 'nome', FILTER_SANITIZE_STRING);
	
	$rg=filter_input(INPUT_GET, 'rg', FILTER_SANITIZE_NUMBER_INT);
	
	$cpf=filter_input(INPUT_GET, 'cpf', FILTER_SANITIZE_NUMBER_INT);
	
	$email=filter_input(INPUT_GET, 'e-mail', FILTER_SANITIZE_EMAIL);
				
	$ano=filter_input(INPUT_GET, 'nascimento', FILTER_SANITIZE_NUMBER_INT);
	//$idade=date("Y")-$ano;
				
	$opcao=isset($_GET["aval"])?$_GET["aval"]:0;
	switch($opcao){
		case 1:
			$curso="Análise e Desenvolvimento de Sistemas";
			break;
		case 2:
			$curso="Agronegócio";			
			break;
		case 3:
			$curso="Recursos Humanos";			
			break;
		case 4:
			$curso="Secretariado";			
			break;
		case 5:
			$curso="Administração";			
			break;
		default:
			$curso="Nao inserido";			
			break;
	}
?><!-- Deletar esta linha na implementação do BD -->
	<h4><p>Nome:<?php echo $nome?></p></h4></br>
	<h4><p>RG:<?php echo $rg?></p></h4></br>
	<h4><p>CPF:<?php echo $cpf?></p></h4></br>
	<h4><p>E-mail:<?php echo $email?></p></h4></br>
	<h4><p>Nascimento:<?php echo $ano?></p></h4></br>
	<h4><p>Curso:<?php echo $curso?></p></h4></br>

	<!--$enviar_dados = "INSERT INTO feedback (nome, ano, email, avaliacao, created) VALUES ('$nome', '$ano', '$email', '$avaliacao', NOW())";
	$resultado_dados = mysqli_query($conn, $enviar_dados);

	if(mysqli_insert_id($conn)){
		$_SESSION['msg'] = "<p style='color:green;'>Avaliação cadastrada com sucesso</p>";
	header("Location: contato.php");
	}
	else{
		$_SESSION['msg'] = "<p style='color:red;'>Avaliação não cadastrada com sucesso</p>";
	header("Location: contato.php");
	}
?>
-->