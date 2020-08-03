<?php
class Agenda
{
    // database connnection and table name
    public $conn;
    private $table_name = "agenda";

    public function __construct($db)
    {
        $this->conn = $db;
    }

    public function addContact($name, $phone)
    { 
        // insert query
        $query = "insert into 
        $this->table_name (name, phone)
        values (:name, :phone)
        on duplicate key update
        phone = :phone";

        // prepare the query
        $stmt = $this->conn->prepare($query);
        $stmt->bindParam(':name', $name);
        $stmt->bindParam(':phone', $phone);

        // execute the query, also check if query was successful
        if($stmt->execute()){
            return true;
        } else {
            $this->showError($stmt);
            return false;
        }
    }

    public function deleteContact($name)
    {
        // Delete query
        $query = "DELETE FROM  
        $this->table_name 
        WHERE name = :name";

        // prepare the query
        $stmt = $this->conn->prepare($query);
        $stmt->bindParam(':name', $name);

        // execute the query, also check if query was successful
        if($stmt->execute()){
            return true;
        } else {
            $this->showError($stmt);
            return false;
        }
    }

    public function getTable() 
    {
        $query = "SELECT *
        from $this->table_name";
        
        $stmt = $this->conn->prepare($query);
        $stmt->execute();

        try {
            return $stmt->fetchAll();
        } catch (Exception $e) {
            print_r($e);
        }
    }

    public function showError($stmt){
        echo "<pre>";
            print_r($stmt->errorInfo());
        echo "</pre>";
    }
}

