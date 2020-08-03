<?php
// Require common files.
require_once('common/config.php');
require_once('common/database.php');
require_once('Objects/Agenda.php');

// Create connection
$database = new Database();
$db = $database->getConnection();
$agenda = new Agenda($db);

// Filtramos los datos.
$nombre = filter_input(INPUT_POST, 'name');
$telefono = filter_input(INPUT_POST, 'phone');
$send = filter_input(INPUT_POST, 'send');

// actualizar agenda. añadir nombre y tlf. 👈

if (isset($send)) {
    if (!($nombre)) {
        echo "El nombre es obligatorio";
    } else {
        if ($telefono) {
            // INSERT or UPDATE USER.
            $agenda->addContact($nombre, $telefono);
        } else {
            // REMOVE USER.
            $agenda->deleteContact($nombre);
        }
    }
}

?>

<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Agenda con BBDD</title>
</head>

<body>
    <h1>Agenda</h1>
    <form action="" method="POST">
        <label for="name"> Name
        <input type="text" name="name">
        <input type="number" name="phone">
        <input type="submit" name="send">
    </form>
    <?php
        $table = $agenda->getTable();
        if ($table) {
            echo "<table>";
            echo "<tr>";

            foreach ($table as $row) {
                echo "<tr>";
                echo "<td>".$row['name']."</td>";
                echo "<td>".$row['phone']."</td>";
                echo "</tr>";
            }

            echo "</table>";

        }
        
    ?>
</body>

</html>