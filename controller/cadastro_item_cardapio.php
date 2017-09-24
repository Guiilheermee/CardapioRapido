<?php
//Caminho deste arquivo: \controller\cadastro_item_cardapio.php
require_once '../class/ItensCardapio.php';
session_start();//cria nova sessão (linha 10)
header('Content-Type: application/json');

$data = $_POST;//recebe os valores do formulário enviados $_POST;
$cardapio = new ItensCardapio();
$retorno = $cardapio->add($data);//chama a função add passando os dados

if ($retorno['success']) {
    $_SESSION['success'] = 1;
    //alterar este location - configuração local
    header("Location: ../cadastroItemCardapio.php");
} else {
    $_SESSION['alert'] = $retorno['alert'];
}
?>