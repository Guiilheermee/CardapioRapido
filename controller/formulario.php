<?php
	require_once '../class/Formulario.php';
	session_start();

	/*$nome = null;
	$data = null;
	$cpf = null;
	$telefone = null;
	$senha = null;*/

	if(empty($_POST['nome'])) // empty verifica se ela esta vazia ou não
	{
		$_SESSION['alert'] = "Campo nome obrigatório";
		header("Location: http://localhost/cadastro/");
	}/*else 
	{
		$nome = $_POST['nome'];
	}*/

	if (!is_numeric($_POST['telefone'])) //retorna true ou false
	{
		$_SESSION['alert'] = "Numero de telefone invalido 67999620112";
		header("Location: http://localhost/cadastro/");
	}

	$formulario = new Formulario();
	$retorno = $formulario->salvar($_POST);

	if ($retorno['success']){
		$_SESSION['success'] = 1;
		header("Location: http://localhost/cadastro/cadastroEmpresa.php");
	} else{
		$_SESSION['alert'] = $retorno['alert'];
	}
?>