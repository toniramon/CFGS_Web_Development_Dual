<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Tabla de la Verdad</title>
</head>
<body>
    
</body>
</html>
<?php
/**
 * 
 * Crea una página web (con PHP) que muestre el estado de una variable obtenido al aplicar las funciones isset($var), empty($var), (bool) $var, isnull($var) a los valores mostrados en la tabla (una fila para cada valor).
 * A esta tabla tienes que añadirle dos columnas: una para isnull() y otra columna, posicionada a la izquierda que indique el número de fila.
 * El intérprete PHP estará configurado en modo desarrollo, tal que muestre al cliente todos los errores, 'warning', 'notice', etc.
 * Anota en qué fila y qué función emite un mensaje y el texto del mismo.
 */


/**
 *  @param mixed.
 *  @return boolean 
 */
function isVarSet($value) {
    return isset($value);
}

function isVarEmpty($value) {
    return empty($value);
}

function createNewTableRow($variable) 
{
    global $var;
    static $i = 1;

    $output = "";
    $output .= "";
    return $output . PHP_EOL;
}

$var = createNewTableRow($test1);

// Array donde almacenamos todas las variables que queremos que salgan en la tabla.
$values_list = []

// Métodos que queremos ejecutar. Contendrá el nombre de las funciones.
$metodos = ['isVarSet', 'isVarEmpty', ]

$funcs = get_defined_functions();
echo count($funcs['internal']);


?>