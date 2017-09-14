
<!DOCTYPE html>
<html lang="pt-BR">
<head>
	<meta charset="utf-8">
	<title>Cardápio Rápido</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
	<div class="container-fluid">
	<h3>Cadastro da Empresa - Cardápio Rápido UEMS/UFGD</h3><br />
	 		<div class="row"> 
 			
 			<div class="col-xs-6 col-sm-4">
 			</div>

 			<div class="col-xs-6 col-sm-4" style="margin-top: 0%;">
 				<form action="controller/registrar_function.php" method="POST">
 					<div class="input-group">
					  <span class="input-group-addon" id="basic-addon1">Nome:       </span>
					  <input type="text" class="form-control" name="nome" placeholder="Nome da Empresa" aria-describedby="basic-addon1" required>
					</div><br />

					<div class="input-group">
					  <span class="input-group-addon" id="basic-addon1">CNPJ:       </span>
					  <input type="text" class="form-control" name="cnpj" placeholder="00.000.000/0001-12" aria-describedby="basic-addon1" required>
					</div><br />

          
					<div class="input-group">
            <span class="input-group-addon" id="basic-addon1">CEP:        &nbsp</span>
            <input type="text" class="form-control" name="cep" pattern="\d{5}-?\d{3}" placeholder="00000-000" oninvalid="setCustomValidity('Seu CEP deve conter os seguintes formatos: 00000-000 ou 00000000')" Onkeyup="try{setCustomValidity('')}catch(e){}" maxlength="9" aria-describedby="basic-addon1" required>
          </div> <br />

          <div class="input-group">
            <span class="input-group-addon" id="basic-addon1">Endereço: </span>
            <input type="text" class="form-control" name="endereco" placeholder="Informe seu Endereço" maxlength="30" aria-describedby="basic-addon1" required>
          </div><br />

          <div class="input-group">
            <span class="input-group-addon" id="basic-addon1">Bairro:       </span>
            <input type="text" class="form-control" name="bairro" placeholder="Informe seu Bairro" maxlength="30" aria-describedby="basic-addon1" required>
          </div><br />

          <div class="input-group">
            <span class="input-group-addon" id="basic-addon1">Telefone:   </span>
            <input type="text" class="form-control" name="telefone"  placeholder="(11)91111-1111"aria-describedby="basic-addon1" required="required">
          </div><br />


          <div class="input-group">
            <span class="input-group-addon" id="basic-addon1">Estado:     </span>
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
                <option value="MS">Mato Grosso do Sul</option>
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
          </div> <br />

          <div class="input-group">
            <span class="input-group-addon" id="basic-addon1">Cidade:    &nbsp</span>
            <input type="text" class="form-control" name="cidade" placeholder="Cidade" aria-describedby="basic-addon1" required>
          </div> <br />

          <div class="input-group">
            <span class="input-group-addon" id="basic-addon1">Delivery:  &nbsp</span>
              <select name="delivery" class="form-control" name="delivery" aria-describedby="basic-addon1" required>
                <option value="" selected>Selecione</option>
                <option value="S">Sim</option>
                <option value="N">Não</option>
              </select>
          </div> <br />

            <div class="input-group">
            <span class="input-group-addon" id="basic-addon1">Marmitex:&nbsp</span>
              <select name="marmitex" class="form-control" name="marmitex" aria-describedby="basic-addon1" required>
                <option value="" selected>Selecione</option>
                <option value="S">Sim</option>
                <option value="N">Não</option>
              </select>
          	</div> <br />

          <div class="input-group">
          <span class="input-group-addon" id="basic-addon1">Cartões:     &nbsp</span>
          		<input type="checkbox" name="form-control" value="VISA" aria-describedby="basic-addon1"> VISA<br>
          		<input type="checkbox" name="form-control" value="ELO" aria-describedby="basic-addon1"> ELO<br>
          		<input type="checkbox" name="form-control" value="AMERICANEXPRESS" aria-describedby="basic-addon1"> AMERICANEXPRESS<br>
          		<input type="checkbox" name="form-control" value="MASTERCARD" aria-describedby="basic-addon1" > MASTERCARD
          	
          </div> <br />
          

					<div class="btn-group">
						<button type="submit" class="btn btn-success" aria-expanded="false">
	   			 			Registrar <span class="glyphicon glyphicon-floppy-disk"></span>
	  					</button>
					</div> 
 				</form>
 			</div>

 			<div class="col-xs-6 col-sm-4" >
 			</div>
 			

	
		
	</div>

	<script src="/Cadastro/js/jquery-3.2.1.min.js"></script>
    <script src="/Cadastro/js/bootstrap.min.js"></script>
    <script src="/Cadastro/js/jquery.mask.min.js"></script>

</body>
</html>