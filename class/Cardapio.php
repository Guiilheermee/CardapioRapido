<?php

	require_once '../database/DataBase.php';

	class Cardapio extends DataBase{

		private $pdo;
		private $conn;
		private $sql;
		private $query;
		private $query2;
		private $rows;

		public function listar_cardapio_por_restaurante($data = array()){
			$this->conn = new DataBase(); //abre instncia com banco
			$this->pdo = $this->conn->DatabaseDefault();
			$this->sql = "INSERT INTO pessoas (`nome`, `cpf`, `data_nascimento`, `telefone`, `senha`) VALUES (?, ?, ?, ?, ?)";
			$this->query = $this->pdo->prepare ( $this->sql );

			if($this->query->execute()){
				$id_pessoas = $this->pdo->lastInsertId();

				$this->sql = "SELECT FROM * cardapio_dio(`id_pessoas`, `cpf`, `senha`) VALUES (?, ?, ?)";
				$this->query2 = $this->pdo->prepare ( $this->sql );
				$this->query2->bindValue(1, $id_pessoas);
				$this->query2->bindValue(2, $data['cpf']);
				$this->query2->bindValue(3, $data['senha']);


				if($this->query2->execute()){
					parent::__destruct();
			
					return array("success" => 1);
				}else{
					$this->queryError = $this->query->errorInfo();

					parent::__destruct();
				
					return array("success" => 0, "alert" => "Error - ".$this->queryError[2]);
				}
			}else{
				$this->queryError = $this->query->errorInfo();

				parent::__destruct();
				
				return array("success" => 0, "alert" => "Error - ".$this->queryError[2]);
			}
		}
	}

?>
