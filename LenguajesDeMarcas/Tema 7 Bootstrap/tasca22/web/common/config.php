<?php
$dominio=$_SERVER['SERVER_NAME'];
$dominio=str_replace("www.","", $dominio);
if($dominio =="localhost"){
$dirname=dirname($_SERVER['PHP_SELF']);
$urlbase="http://localhost$dirname";
} else {
$urlbase="https://$dominio";
}
if(empty($urlbase)){$urlbase=$_SERVER['HTTP_HOST'];}
function LetraNIF ($dni) {
/* Obtiene letra del NIF a partir del DNI */
  $valor= (int) ($dni / 23);
  $valor *= 23;
  $valor= $dni - $valor;
  $letras= "TRWAGMYFPDXBNJZSQVHLCKEO";
  $letraNif= substr ($letras, $valor, 1);
  return $letraNif;
}
?>
