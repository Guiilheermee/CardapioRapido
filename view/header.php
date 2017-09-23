<?php session_start(); ?>
<!DOCTYPE html>
<html lang="pt-BR">
    <head>
        <meta charset="UTF-8">
        <title><?php echo $page_title; ?></title>

        <script src="https://npmcdn.com/tether@1.2.4/dist/js/tether.min.js"></script>
        <link rel="stylesheet" href="../../../resources/css/bootstrap.css">
        <link rel="stylesheet" href="../../../resources/css/style.css" >


   <script src="../../../resources/js/jquery-3.2.1.min.js"></script>
    <script src="../../../resources/js/bootstrap.min.js"></script>
    <script src="../../../resources/js/jquery.mask.min.js"></script>

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
                    <li class="active"><a href="../../../login.php">Início</a></li>
                    <li><a href="../../../sobre.php">Sobre</a></li>
                    <li><a class="glyphicon glyphicon-log-out" href="../../../logout.php"> Sair</a></li>
                </ul>
            </div>
        </div>
    </nav>

    <body>
        <div class="container">
           