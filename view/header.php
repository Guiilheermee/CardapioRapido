<?php session_start(); ?>
<!DOCTYPE html>
<html lang="pt-BR">
    <head>
        <meta charset="UTF-8">
        <title><?php echo $page_title; ?></title>

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="css/style.css" >
    </head>
    <nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="row">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"  aria-controls="navbar">
                    <span class="sr-only">Navegação</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Cardápio Rápido</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="../../../CardapioRapido/login.php">Início</a></li>
                    <li><a href="../../../CardapioRapido/sobre.php">Sobre</a></li>
                    <li><a class="glyphicon glyphicon-log-out" href="../../../CardapioRapido/logout.php"> Sair</a></li>
                </ul>
            </div>
        </div>
    </nav>

    <body>
        <div class="container">