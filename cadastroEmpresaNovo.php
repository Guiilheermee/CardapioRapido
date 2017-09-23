<?php
$page_title = 'Cadastro da Empresa';
include __DIR__ . '/view/header.php';
?>

<div class="margem">
    <h3>Cadastro da Empresa - Cardápio Rápido UEMS/UFGD</h3>

    <div class="jumbotron">
        <form method="post" action="controller/formulario2.php"></form>
        <div class="row">
            <div class="col-md-6">
                <div class="form-group">
                    <label>Nome</label>
                    <input type="text" class="form-control" placeholder="Nome da Empresa" aria-describedby="basic-addon1" name="nome" required>
                </div>
            </div>

            <div class="col-md-6">
                <div class="form-group">
                    <label>CNPJ</label>
                    <input id= "cnpj" type="text" class="form-control" placeholder="00.000.000/0001-12" aria-describedby="basic-addon1" name="cnpj" required>
                </div>
            </div>

        </div>
        <div class="row">
            <div class="col-md-4">
                <div class="form-group">
                    <label>CEP</label>
                    <input id="cep" type="text" class="form-control" placeholder="00000-000" aria-describedby="basic-addon1" name="cep" required>
                </div>
            </div>

            <div class="col-md-4">
                <div class="form-group">
                    <label>Endereço</label>
                    <input type="text" class="form-control" aria-describedby="basic-addon1" name="endereco" required>
                </div>
            </div>

            <div class="col-md-4">
                <div class="form-group">
                    <label>Bairro</label>
                    <input type="text" class="form-control" aria-describedby="basic-addon1" name="bairro" required>
                </div>
            </div>

        </div>
        <div class="row">
            <div class="col-md-4">
                <div class="form-group">
                    <label>Telefone</label>
                    <input id = "tel"type="text" class="form-control" placeholder="(67) 3467-2525" aria-describedby="basic-addon1" name="tel" required>
                </div>
            </div>

            <div class="col-md-4">
                <div class="form-group">
                    <label>Estado</label>
                    <select name="estados-brasil" class="form-control" name="estado" aria-describedby="basic-addon1" required>
                        <option value="" selected>Selecione</option>
                        <option value="AC">Acre</option>
                        <option value="AL">Alagoas</option>
                        <option value="AP">Amapá</option>
                        <option value="AM">Amazonas</option>
                        <option value="BA">Bahia</option>
                        <option value="CE">Ceará</option>
                        <option value="DF">Distrito Federal</option>
                        <option value="ES">Espírito Santo</option>
                        <option value="GO">Goiás</option>
                        <option value="MA">Maranhão</option>
                        <option value="MT">Mato Grosso</option>
                        <option value="MS" selected>Mato Grosso do Sul</option>
                        <option value="MG">Minas Gerais</option>
                        <option value="PA">Pará</option>
                        <option value="PB">Paraíba</option>
                        <option value="PR">Paraná</option>
                        <option value="PE">Pernambuco</option>
                        <option value="PI">Piauí</option>
                        <option value="RJ">Rio de Janeiro</option>
                        <option value="RN">Rio Grande do Norte</option>
                        <option value="RS">Rio Grande do Sul</option>
                        <option value="RO">Rondônia</option>
                        <option value="RR">Roraima</option>
                        <option value="SC">Santa Catarina</option>
                        <option value="SP">São Paulo</option>
                        <option value="SE">Sergipe</option>
                        <option value="TO">Tocantins</option>
                    </select>
                </div>
            </div>

            <div class="col-md-4">
                <div class="form-group">
                    <label>Cidade</label>
                    <input type="text" class="form-control" aria-describedby="basic-addon1" name="nome" required>
                </div>
            </div>

        </div>
    </div>
    
    <!--Divisão-->
    
    <div class="jumbotron">
        <div class="row">
            <div class="col-md-6">
                <div class="form-group">
                    <label>Entrega</label>
                    <select name="delivery" class="form-control" name="delivery" aria-describedby="basic-addon1" required>
                        <option value="" selected>Selecione</option>
                        <option value="S">Sim</option>
                        <option value="N">Não</option>
                    </select>
                </div>
            </div>
            <div class="col-md-6">
                <div class="form-group">
                    <label>Horário de Funcionamento</label>
                    <input type="datetime" class="form-control" aria-describedby="basic-addon1" name="nome" required>
                </div>
            </div>
        </div>
        <div class="row" >

            <div class="col-md-6">
                <div class="form-group">
                    <label>Marmitex</label>
                    <select name="comida" class="form-control" name="delivery" aria-describedby="basic-addon1" required>
                        <option value="" selected>Selecione</option>
                        <option value="S">Sim</option>
                        <option value="N">Não</option>
                    </select>
                </div>
            </div>
            <div class="col-md-6">
                <div class="form-group">
                    <label>Preço do Marmitex</label>
                    <input type="text" class="form-control" aria-describedby="basic-addon1" placeholder="R$ 00,00" name="nome" required>
                </div>
            </div>
        </div>
        <div class="row" >
            <div class="col-md-6">
                <div class="form-group">
                    <label>Prato Feito</label>
                    <select name="comida" class="form-control" name="delivery" aria-describedby="basic-addon1" required>
                        <option value="" selected>Selecione</option>
                        <option value="S">Sim</option>
                        <option value="N">Não</option>
                    </select>
                </div>
            </div>
            <div class="col-md-6">
                <div class="form-group">
                    <label>Preço do Prato Feito</label>
                    <input type="text" class="form-control" aria-describedby="basic-addon1" placeholder="R$ 00,00" name="nome" required>
                </div>
            </div>
        </div>

        <div class="row" >
            <div class="col-md-6">
                <div class="form-group">
                    <label>Por Kilo</label>
                    <select name="comida" class="form-control" name="delivery" aria-describedby="basic-addon1" required>
                        <option value="" selected>Selecione</option>
                        <option value="S">Sim</option>
                        <option value="N">Não</option>
                    </select>
                </div>
            </div>
            <div class="col-md-6">
                <div class="form-group">
                    <label>Preço do Kilo</label>
                    <input id = "preco"type="text" class="form-control" aria-describedby="basic-addon1" placeholder="R$ 00,00" name="nome" required>
                </div>
            </div>
        </div>

        <div class="row" >
            <div class="col-md-6">
                <div class="form-group">
                    <span class="input-group-addon">Cartões aceitos</span>
                    <input type="checkbox" name="vehicle" value="MASTERCARD" > MASTERCARD &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                    <input type="checkbox" name="form-control" value="VISA" > VISA <br>
                    <input type="checkbox" name="form-control" value="AMERICANEXPRESS" > AMERICANEXPRESS
                    <input type="checkbox" name="form-control" value="ELO" > ELO<br>

                </div>  		
            </div>

            <div class="col-md-6">
                <div class="form-group">
                    <span class="input-group-addon" id="comida" aria-describedby="basic-addon1">Comidas servidas</span>
                    <input type="checkbox" name="form-control" value="MASTERCARD" > Almoço
                    <input type="checkbox" name="form-control" value="VISA" > Janta <br>
                    <input type="checkbox" name="form-control" value="AMERICANEXPRESS" > Sobremesa
                    <input type="checkbox" name="form-control" value="ELO" > Lanche<br>

                </div>  		
            </div>

        </div>
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

</div>

<script>
    $(document).ready(function () {
        $("#tel").mask("(00) 00000-0000");
        $("#cep").mask("00000-000");
        $("#preco").mask("00,00");
        $("#cnpj").mask("00.000.000/0000-00");

    });
</script>

<?php
include __DIR__ . '/view/footer.php';
?>