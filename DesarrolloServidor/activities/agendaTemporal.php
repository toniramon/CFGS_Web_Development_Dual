<?php
/**
 * 
 * Vamos a crear una agenda temporal.
 */

var_dump($_POST);

// Filtramos los datos.
$telefono = filter_input(INPUT_POST, 'telefono');
$nombre = filter_input(INPUT_POST, 'nombre');

isset($_POST['agenda']) ? $agenda = $_POST['agenda'] : $agenda = [];

// actualizar agenda. añadir nombre y tlf. 👈
if (!($nombre)) {
    echo "El nombre es obligatorio";
} else {
    if ($telefono) {
        $agenda[$nombre] = $telefono; 
    } else {
        unset($agenda[$nombre]);
    }
}

?>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Agenda</title>
</head>
<body>
    <form method="POST">
        <?php 
            foreach ($agenda as $nom => $telf) {
                echo "<input type='hidden' name='agenda[" . $nom . "]' value='" . $telf . "'>";
            }
        ?>
        <input type="text" name="nombre">
        <input type="text" name="telefono">
        <input type="submit" value="Enviar">
    </form>

    <ul>
        <?php 
            foreach ($agenda as $nom => $telf) {
                echo "Nombre: " . $nom . ", telefono: " . $telf . "</br>";
            }
        ?>
    </ul>
</body>
</html>
