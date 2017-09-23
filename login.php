<?php
$page_title = 'Login - Cardápio Rápido';
include __DIR__ . '/view/header.php';
?>

<div class="row"> 

    <div class="col-xs-4 col-sm-3">
    </div>

    <div class="col-sm-6 col-xs-6" style="margin-top: 10%;">
        <h3>Cardápio Rápido UEMS/UFGD</h3>
        <form class="jumbotron" action="controller/login_function.php" method="POST" >
            <div class="form-group">
                <label for="disabledTextInput">CPF</label>
                <input type="text" name='login' id="cpf" autofocus class="form-control" placeholder="Informe o CPF" required="required">
            </div>
            <div class="form-group">
                <label for="disabledSelect">Senha</label>
                <input type="password" name='senha' id="disabledTextInput" pattern="[a-zA-ZÀÈÌÒÙàèìòùÁÉÍÓÚáéíóú1-9@_\-\.]" class="form-control" placeholder="Informe a Senha" required="required">

                </select>
            </div>

            <button type="submit" class="btn btn-success">
                <span class="glyphicon glyphicon-log-in" aria-hidden="true"></span> Entrar
            </button>

            <a href="cadastroPessoa.php" class="btn btn-success">
                <span class="glyphicon glyphicon-edit" aria-hidden="true"></span> Cadastrar
            </a>

        </form>
    </div>

    <div class="col-xs-6 col-sm-4" >
    </div>

</div>



<script src="/CardapioRapido/js/jquery-3.2.1.min.js"></script>
<script src="/CardapioRapido/js/bootstrap.min.js"></script>
<script src="/CardapioRapido/js/jquery.mask.min.js"></script>
<script>
    $(document).ready(function () {
        $("#cpf").mask("000.000.000-00");

    });
</script>

<br /><br />
<br />
<?php
include __DIR__ . '/view/footer.php';
?>