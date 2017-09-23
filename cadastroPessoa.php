<?php
$page_title = 'Cadastro Pessoa';
include __DIR__ . '/view/header.php';
?>
<div class="margem">
    <div class="container">
        <h3>Cadastro pessoa física - Cardápio Rápido UEMS/UFGD</h3>
        <?php
        if (isset($_SESSION['success']) && $_SESSION['success']) {
            echo '<div class="alert alert-success alert-dismissable">
                      <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                      <strong>Successo!</strong> Cadastro efetuado.
                    </div>';
        }

        if (isset($_SESSION['alert']) && $_SESSION['alert']) {
            echo '<div class="alert alert-warning alert-dismissable">
                      <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                      <strong>Atenção! </strong>' . $_SESSION['alert'] . '
                    </div>';
        }

        session_destroy();
        ?>
        <div class="jumbotron">
            <form method="post" action="controller/formulario.php">
                <div class="row">
                    <div class="col-md-12">
                        <div class="form-group">
                            <label>Nome</label>
                            <input id="name" type="text" class="form-control" placeholder="Nome Completo" aria-describedby="basic-addon1" name="nome" required>
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
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <div class="form-group">
                            <button type="reset" onclick="clearInputs()" class="btn btn-default"> Limpar</button>
                            <!--<button type="submit" class="btn btn-primary"> Cadastrar</button>-->
                            <button type="submit" class="btn btn-success" aria-expanded="false">
                                Registrar <span class="glyphicon glyphicon-floppy-disk"></span>
                            </button>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </div>
  
    <script>
      
        $(document).ready(function () {
            $("#tel").mask("(00)00000-0000");
            $("#cpf").mask("000.000.000-00");

        });

          function clearInputs(){
            $("#name").html("");
        }
    </script>
    <?php
    include __DIR__ . '/view/footer.php';
    ?>