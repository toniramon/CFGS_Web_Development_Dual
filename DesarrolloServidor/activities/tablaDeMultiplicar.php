<?php
/**
 *
 * Primera práctica de Servidor
 * Crearemos una tabla de multiplicar.
 */

define("NUMEROS", 18);
define("MULTIPLICADORES", 12);

?>

<html>
<head></head>
<body>
<table border="1">
    <?php
    for ($i = 0; $i <= NUMEROS; $i++) {
        echo "<tr>
                <td>$i</td>";
        for ($j = 0; $j <= MULTIPLICADORES; $j++) {
            echo "<td>".$i * $j."</td>";
        }
        "</tr>";
    }
    ?>
</table>
</body>
</html>