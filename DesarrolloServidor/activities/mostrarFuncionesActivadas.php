<?php
$funcs = get_defined_functions();
echo count($funcs['internal']);
var_dump($funcs);

?>