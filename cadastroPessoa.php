<?php session_start(); ?>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <title>Cardápio Rápido</title>
 
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <h3>Cadastro pessoa física - Cardápio Rápido</h3>
        <?php
            if (isset($_SESSION['success']) && $_SESSION['success'] ) {
                echo '<div class="alert alert-success alert-dismissable">
                      <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                      <strong>Successo!</strong> Cadastro efetuado.
                    </div>';
            }

            if (isset($_SESSION['alert']) && $_SESSION['alert'] ) {
                echo '<div class="alert alert-warning alert-dismissable">
                      <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                      <strong>Atenção! </strong>'.$_SESSION['alert'].'
                    </div>';
            }

            session_destroy();
        ?>
        <form method="post" action="controller/formulario.php">
            <div class="row">
                <div class="col-md-12">
                    <div class="form-group">
                        <label>Nome</label>
                        <input type="text" class="form-control" placeholder="Nome Completo" aria-describedby="basic-addon1" name="nome" required>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-4">
                    <div class="form-group">
                        <label>CPF</label>
                        <input id="cpf" type="text" maxlength="14" placeholder="111.222.333-44" class="form-control" name="cpf" required>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="form-group">
                        <label>Data</label>
                        <input type="date" class="form-control" name="data">
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="form-group">
                        <label>Telefone</label>
                        <input id="tel" type="text" maxlength="11" placeholder="(11) 91111-1111" class="form-control" name="telefone" required>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <div class="form-group">
                        <label>Senha</label>
                        <input type="password" class="form-control" placeholder="********" name="senha" required>
                    </div>
                </div>
            </div>
            <hr>
            <div class="row">
                <div class="col-md-12">
                    <div class="form-group">
                        <button type="reset" class="btn btn-default"> Limpar</button>
                        <!--<button type="submit" class="btn btn-primary"> Cadastrar</button>-->
                        <button type="submit" class="btn btn-success" aria-expanded="false">
                            Registrar <span class="glyphicon glyphicon-floppy-disk"></span>
                        </button>
                    </div>
                </div>
            </div>
        </form>
    </div>
 
    <script src="/Cadastro/js/jquery-3.2.1.min.js"></script>
    <script src="/Cadastro/js/bootstrap.min.js"></script>
    <script src="/Cadastro/js/jquery.mask.min.js"></script>
    <script>
        $(document).ready(function(){
            $("#tel").mask("(00)    00000-0000");
            $("#cpf").mask("000.000.000-00");

        });
    </script>

</body>
</html>