<?php
	require_once '../class/Res.php';
if (isset($_GET['id'])) {
    $id= (int) $_GET['id'];    
    $cardapio = new Cardapio();
	$retorno = $cardapio->listar_cardapio_por_restaurante($id);
        
	if ($retorno['success']){
		echo json_decode($retorno);
	} else{
		$_SESSION['alert'] = $retorno['alert'];
	}
}