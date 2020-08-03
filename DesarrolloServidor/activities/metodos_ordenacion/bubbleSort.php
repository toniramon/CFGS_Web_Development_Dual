<?php
/**
 *
 * Order array using Bubble Sort
 */
define('METHOD_ARRAY', 'Bubble Sort');

// Order array using order algorythm
function bubbleSort($value){
    $total = count($value);
    $isOrdered = false;
    while(!$isOrdered){
        $isOrdered = true;
        for($i = 1; $i < $total; $i++){
            if($value[$i] < $value[$i - 1]){
                $aux = $value[$i];
                $value[$i] = $value[$i - 1];
                $value[$i - 1] = $aux;
                $isOrdered = false;
            }
        }

    }
    return $value;
}

$orderme = [1,3,5,20,2];
$ordered_array = bubbleSort($orderme);
?>

<h1>Metodo de ordenación <?php echo METHOD_ARRAY; ?></h1>

<p>Tenemos este array: </p>

<?php var_dump($orderme); ?>

<p>Y después de ordenarlo con <strong><?php echo METHOD_ARRAY; ?></strong> queda de la siguiente manera: </p>

<?php var_dump($ordered_array); ?>