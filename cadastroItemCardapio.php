<?php
//Caminho deste arquivo: raiz do projeto
$page_title = 'Itens de Cardápio';
include __DIR__ . '/view/header.php';
?>
<div class="margem">
    <div class="container">
        <h3>Cadastrar Item de Cardápio</h3>
<?php
        if (isset($_SESSION['success']) && $_SESSION['success']) {
            echo 
                '<div class="alert alert-success alert-dismissable">
                    <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                    <strong>Sucesso!</strong> Cadastro efetuado.
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
            <form method="post" action="controller/cadastro_item_cardapio.php">
                <div class="row">
                    <div class="col-md-12">
                        <div class="form-group">
                            <label>Nome do Item do Cardápio</label>
                            <input type="text" class="form-control" pattern="[A-Za-z0-9]{1,20}" placeholder="Item do Cardápio" aria-describedby="basic-addon1" name="nome_item_cardapio" required>
                        </div>
                    </div>
                </div>
                <hr>
                </div>
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
    </div>
<script src="/CardapioRapido/js/jquery-3.2.1.min.js"></script>
<script src="/CardapioRapido/js/bootstrap.min.js"></script>
<script src="/CardapioRapido/js/jquery.mask.min.js"></script>
<?php
include __DIR__ . '/view/footer.php';
?>