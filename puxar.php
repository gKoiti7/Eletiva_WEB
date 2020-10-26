<!--
<?php
	include_once("conexao.php");
?>
-->

<?php
	include('templates/header.php');
?>
	<head>
		<title>Informações do Aluno</title>
	</head>
	<body>
		<!--Conteúdo-->
			<div class="container">
				<div class="py-5 text-center">
					<h2>Informações do Aluno</h2>
					<!--<p class="lead">Esta seção do AGIS necessita das seguintes informações do aluno(a):</br>RG, CPF</p>-->
				</div>
				
				</br>
				
				<?php
				
					$cpf=filter_input(INPUT_GET, 'cpf', FILTER_SANITIZE_NUMBER_INT);
					
					//Receber o número da página
					$pagina_atual=filter_input(INPUT_GET, 'pagina', FILTER_SANITIZE_NUMBER_INT);
					$pagina=(!empty($pagina_atual))?$pagina_atual:1;
					
					//Configurar a quantidade de itens por página
					$qnt_result_pag=3;
					
					//Calcular o início da visualização
					$inicio=($qnt_result_pag * $pagina)-$qnt_result_pag;
					
					//Puxando registros do banco de dados
					//$result_transparencia="SELECT * FROM transparencia WHERE :CPF = $cpf LIMIT $inicio,$qnt_result_pag";
					//$resultado_transparencia=mysqli_query($conn, $result_transparencia);
					
						//while($row_transparencia=mysqli_fetch_assoc($resultado_transparencia)){
							//echo "Nome do servidor público: ". $row_transparencia['Nome']."</br>";
							//echo "Cargo do servidor público: ". $row_transparencia['Cargo']."</br>";
							//echo "Salário do servidor público: R$". $row_transparencia['Salario']."</br>";
							//echo "</br><hr>";
							echo "Nome do aluno: Gustavo</br>";
							echo "CPF do aluno: 123456789</br>";
							echo "</br></hr>";
							echo "Nome do aluno: Luciana</br>";
							echo "CPF do aluno: 123456789</br>";
							echo "</br></hr>";
							echo "Nome do aluno: Rafael</br>";
							echo "CPF do aluno: 123456789</br>";
							echo "</br></hr>";
						//}
					
					//Paginação - Somar a quantidade de usuários
					//$result_pag="SELECT COUNT(id)As num_result FROM transparencia";
					//$resultado_pag=mysqli_query($conn, $result_pag);
					//$row_pag=mysqli_fetch_assoc($resultado_pag);
					//$quantidade_pag=ceil($row_pag['num_result']/$qnt_result_pag);
					$quantidade_pag=2;
					
					//Limitar os links antes e depois
					echo "</br>";
					
					$max_links=2;
					
					echo " <a href='puxar.php?pagina=1'>Primeira</a> ";
					
					for($pag_ant=$pagina - $max_links;$pag_ant<=$pagina-1;$pag_ant++){
						if($pag_ant>=1){
							echo " <a href='puxar.php?pagina=$pag_ant'>$pag_ant</a> ";
						}
					}
					
					echo " $pagina ";
					
					for($pag_dep=$pagina+1;$pag_dep<=$pagina+$max_links;$pag_dep++){
						if($pag_dep<=$quantidade_pag){
							echo " <a href='puxar.php?pagina=$pag_dep'>$pag_dep</a> ";
						}
					}
						
					echo " <a href='puxar.php?pagina=$quantidade_pag'>Última</a> ";
				?>
			</div>	
			
	</body>
	
	 <?php
		include('templates/footer.php');
	?>
	
</html>