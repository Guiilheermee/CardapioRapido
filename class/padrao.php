<?php
	require_once 'connection/DataBase.class.php';

	class BusinessDAO extends DataBase{
		private $pdo;
		private $conn;
		private $sql;
		private $query;
		private $rows;
		private $managerDB;
		private $response;
		private $idBusiness;

		/*Metodo principal*/
		public function Business($data, $nameImage){
			$this->responseData = $this->SalveDataBusiness($data, $nameImage);			

			if($this->responseData->success){
				$this->responseContact = $this->SalveContact($data);
				
				if($this->responseContact->success){
					$response =(object) $this->LinkBusiness(
									"bs_link_contact",
									$this->responseData->lastId, 
									$this->responseContact->lastId, 
									"cod_business", 
									"cod_business_contact");
					if($response->success){
						return $response;
					}else{
						return $response;
					}
				}else{
					return $this->responseAddress;
				}
			}else{
				return $this->responseAddress;
			}
		}

		/*Salva os dados principais da Empresa*/
		private function SalveDataBusiness($data, $nameImage){
			setlocale(LC_ALL, "pt_BR", "pt_BR.iso-8859-1", "pt_BR.utf-8", "portuguese");
			date_default_timezone_set('America/Campo_Grande');

			$this->conn = new DataBase();
			/*Selecionando dados de conexao com o BD*/
			$this->pdo = $this->conn->DatabaseDefault();

			$this->sql = "INSERT INTO business (`cnpj_cpf`,`company_name`, `logo`, `date`, `branch`, `enabled`,`type_business`) VALUES (?, ?, ?, ?, ?, ?, ?)";

			$this->query = $this->pdo->prepare ( $this->sql );

			$this->query->bindValue(1, $this->ClearCnpjCpf($data->cpf_cnpj));
			$this->query->bindValue(2, $data->name_business);
			$this->query->bindValue(3, $nameImage);
			$this->query->bindValue(4, date("d/m/Y H:m:s"));
			$this->query->bindValue(5, 1);
			$this->query->bindValue(6, 0);
			$this->query->bindValue(7, $data->type_business);

			if($this->query->execute()){
				$lastId = $this->pdo->lastInsertId();
				
				parent::__destruct();
			
				return (object) array("success" => 1, "lastId" => $lastId);
			}else{
				$this->queryError = $this->query->errorInfo();

				parent::__destruct();
				
				return array("success" => 0, "alert" => "Error - ".$this->queryError[2]);
			}
		}

		private function SalveContact($data){
			$this->conn = new DataBase();
			/*Selecionando dados de conexao com o BD*/
			$this->pdo = $this->conn->DatabaseDefault();

			$this->sql = "INSERT INTO business_contact (`tel`, `cell`, `email`) VALUES (?, ?, ?)";

			$this->query = $this->pdo->prepare ( $this->sql );

			$this->query->bindValue(1, $data->fixo);
			$this->query->bindValue(2, $data->cel);
			$this->query->bindValue(3, $data->email);

			if($this->query->execute()){
				$lastId = $this->pdo->lastInsertId();

				parent::__destruct();
			
				return (object) array("success" => true, "lastId" => $lastId);
			}else{
				parent::__destruct();

				return false;
			}
		}

		/*Insere os dados que pertence as cardinalidades entre as tabelas*/
		private function LinkBusiness($table, $lasIdOne, $lasIdTwo, $paramOne, $paramTwo){
			$this->conn = new DataBase();
			/*Selecionando dados de conexao com o BD*/
			$this->pdo = $this->conn->DatabaseDefault();

			$this->sql = "INSERT INTO $table (`$paramOne`,`$paramTwo`) VALUES (?, ?)";

			$this->query = $this->pdo->prepare ( $this->sql );

			$this->query->bindValue(1, $lasIdOne);
			$this->query->bindValue(2, $lasIdTwo);

			if($this->query->execute()){
				parent::__destruct();
			
				return array("success" => 1);
			}else{
				$this->queryError = $this->query->errorInfo();

				parent::__destruct();
				
				return array("success" => 0, "alert" => "Error - ".$this->queryError[2]);
			}
		}
		
		private function ClearCnpjCpf($string){
			/*Remove Space*/
			$string = trim($string);
		
			/*Remove Caracters*/
			$string = str_replace(".", "", $string);
			$string = str_replace(",", "", $string);
			$string = str_replace("-", "", $string);
			$string = str_replace("/", "", $string);
		
			return $string;
		}

		private function SelectBusiness($id_business){ //trocar por public //tabela de login = 
			$this->pdo = new DataBase(); 
			
			$this->pdo = $this->pdo->DatabaseDefault();
			
			$this->sql = "SELECT * FROM business_conf WHERE cod_business  = ? and id = ?"; //? tratar todos tipo de sqlinject
			
			$this->query = $this->pdo->prepare($this->sql);
			
			$this->query->bindValue(1, $id_business); // 1 primeiro ponto de ?
			$this->query->bindValue(2, $id); // 2 segundo ponto de ?
			
			if ($this->query->execute ()) {
				parent::__destruct();
				
				return $this->query->fetchAll ( PDO::FETCH_OBJ );
			}else{
				parent::__destruct();
				
				$this->queryError = $this->query->errorInfo();
				
				return array("success" => 0, "alert" => "Error - ".$this->queryError[2]);
			}
		}
	}
?>