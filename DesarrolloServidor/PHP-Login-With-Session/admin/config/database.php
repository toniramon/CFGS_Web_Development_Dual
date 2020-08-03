
<?php
// Import autoloader.
require('../../vendor/autoload.php');

$dotenv = Dotenv\Dotenv::createImmutable('../../');
$dotenv->load();

// used to get mysql database connection
class Database{
    
    // specify your own database credentials
    private $host;
    private $db_name;
    private $username;
    private $password;
    public $conn;

    function __construct() {
        $this->host = getenv('DB_HOST');
        $this->db_name = getenv('DB_NAME');
        $this->username = getenv('DB_USER');
        $this->conn = getenv('DB_PASS');
    }
 
    // get the database connection
    public function getConnection(){
 
        $this->conn = null;
 
        try{
            $this->conn = new PDO("mysql:host=" . $this->host . ";dbname=" . $this->db_name, $this->username, $this->password);
        }catch(PDOException $exception){
            echo "Connection error: " . $exception->getMessage();
        }
 
        return $this->conn;
    }
}
?>