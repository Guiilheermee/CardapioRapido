<?php
require_once '../class/Restaurantes.php';
$cardapio = new Restaurantes();
$retorno = $cardapio->listar_restaurantes();
header('Content-Type: application/json');
if ($retorno['success']) {
    echo json_decode($retorno);
} else {
    $_SESSION['alert'] = $retorno['alert'];
}