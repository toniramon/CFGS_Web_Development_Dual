<?php
/**
 * 
 * Vamos a crear una agenda temporal.
 */
session_start();

// Filtramos los datos.
$nombre = filter_input(INPUT_POST, 'nombre');
$telefono = filter_input(INPUT_POST, 'telefono');

// actualizar agenda. añadir nombre y tlf. 👈
if (!($nombre)) {
    echo "El nombre es obligatorio";
} else {
    if ($telefono) {
        $_SESSION['agenda'][$nombre] = $telefono;
    } else {
        unset($_SESSION['agenda'][$nombre]);
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
        <input type="text" name="nombre">
        <input type="text" name="telefono">
        <input type="submit" value="Enviar">
    </form>

    <ul>
        <?php 
            if (isset($_SESSION['agenda'])) {
                foreach ($_SESSION['agenda'] as $nom => $telf) {
                    echo "Nombre: " . $nom . ", telefono: " . $telf . "</br>";
                }
            } else {
                echo "Lo siento, pero no hay ningun usuario registrado";
            }
            
        ?>
    </ul>
</body>
</html>
