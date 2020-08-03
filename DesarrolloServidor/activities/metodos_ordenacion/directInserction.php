<?php
/**
 *
 * Order array using Direct Inserction
 */
define('METHOD_ARRAY', 'Inserción Directa');

function insercionDirecta($array,$num)
{
    for ($i = 1; $i < $num; $i++)
    {
        $vector1 = $array[$i];
        $vector2 = $i - 1;
        while ($vector2 >= 0 && $array[$vector2] > $vector1)
        {
                $array[$vector2 + 1] = $array[$vector2];
                $vector2--;
        }
        $array[$vector2 + 1] = $vector1;
    }
    return $array;
}


$vectorA=array(7,1,3,4,20);
$vectorB=insercionDirecta($vectorA,sizeof($vectorA));
?>

<h1>Metodo de ordenación <?php echo METHOD_ARRAY; ?></h1>

<p>Tenemos este array: </p>

<?php var_dump($vectorA); ?>

<p>Y después de ordenarlo con <strong><?php echo METHOD_ARRAY; ?></strong> queda de la siguiente manera: </p>

<?php 
var_dump($vectorB);
?>