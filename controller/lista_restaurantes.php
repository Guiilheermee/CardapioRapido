<?php

require_once '../class/Restaurantes.php';
$cardapio = new Restaurantes();
$retorno = $cardapio->listar_restaurantes();

if ($retorno['success']) {
    echo json_encode($retorno);
} else {
    $_SESSION['alert'] = $retorno['alert'];
}