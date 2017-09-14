<?php
if (isset($_GET['id'])) {
    $id= (int) $_GET['id'];
     $nome= $_GET['nome'];
    echo $id . $nome;    
    }