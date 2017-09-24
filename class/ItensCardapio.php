<?php
//Caminho deste arquivo: \class\ItensCardapio.php
require_once '../database/DataBase.php';

class ItensCardapio extends DataBase{

    private $pdo;
    private $conn;
    private $sql;
    private $query;
    private $rows;
        
    /**
     * Função que adiciona um item de cardápio.
     * @param array $data
     * @return array
     */
    public function add($data = array()){
            $this->conn = new DataBase(); 
            $this->pdo = $this->conn->DatabaseDefault();
            //informa o insert na tabela com os campos
            $this->sql = "INSERT INTO itens_cardapio (nome_item_cardapio) VALUES (?);";
            $this->query = $this->pdo->prepare ( $this->sql );
            //campos bind enviados (o nome do índice em $data é o mesmo do formulário, que é o mesmo do banco
            $this->query->bindValue(1, $data['nome_item_cardapio']);
            //EXECUÇÃO NO BANCO
            if($this->query->execute()){//OK
                return array("success" => 1);
            }else{//NÃO EXECUTOU
                $this->queryError = $this->query->errorInfo();
                parent::__destruct();
                return array("success" => "0", "alert" => "Error - ".$this->queryError[2]);
            }
    }
}
?>