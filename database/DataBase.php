<?php
class DataBase {
	private $connecting_df;
	private $connecting_bs;
	private $db;

	public function __construct(){
		ini_set('display_errors',1);
		ini_set('display_startup_erros',1);
		error_reporting(E_ALL);
	}
	
	public function __destruct(){
		$this->connecting_df = null;
		$this->connecting_bs = null;
	}
	
	public function DatabaseDefault() {
		try{
			$this->connecting_df = new PDO("mysql:host=localhost;dbname=cardapio", "root", "");
			$this->connecting_df->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
			$this->connecting_df->exec('SET NAMES utf8');
			
			return $this->connecting_df;
		}catch (PDOException $e){
			die("Connection Error: " . $e->getMessage());
		}
	}
}
?>