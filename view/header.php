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
                    <li class="active"><a href="../../../sislabweb/view/main.php">Home</a></li>
                    <li><a href="../../../sislabweb/sobre.php">Sobre</a></li>
                    <li><a href="../../../sislabweb/contato.php">Contato</a></li>
                    <li><a href="../../../sislabweb/documentacao/index.html">Documentação</a></li>
                    <li><a class="btn btn-danger" href="../../../sislabweb/logout.php">Logout</a></li>
                </ul>
            </div>
        </div>
    </nav>

    <body>
        <div class="container">