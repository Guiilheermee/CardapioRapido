<?php

	require_once '../database/DataBase.php';

	class Restaurantes extends DataBase{

		private $pdo;
		private $conn;
		private $sql;
		private $query;
		private $rows;

		public function listar_restaurantes(){
			$this->conn = new DataBase(); //abre instncia com banco
			$this->pdo = $this->conn->DatabaseDefault();
			$this->sql = "SELECT * FROM empresa";
			$this->query = $this->pdo->prepare ( $this->sql );
                        
			if($this->query->execute()){
                            $this->rows = $this->query->fetch(PDO::FETCH_OBJ);
				return array("success" => true,"data"=> $this->rows);
			}else{
				$this->queryError = $this->query->errorInfo();
				parent::__destruct();
				return array("success" => false, "msg" => "Error - ".$this->queryError[2]);
			}
		}
	}

?>