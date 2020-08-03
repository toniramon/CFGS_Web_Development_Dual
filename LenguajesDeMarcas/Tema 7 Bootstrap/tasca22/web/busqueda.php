<?php
include("common/config.php");
$search=$_GET[search];
$search = preg_replace("/[^0-9]/", "", $search);
$url=$search;
$longitud=strlen($url);
if(!is_numeric($url)){
$url="./";
}

if($longitud == "8"){

header("Location: $url");
}else if($longitud < "8"){
header("Location: $url");
}else if($longitud > "8"){
	$url = substr("$url", 0, 8);
header("Location: $url");	
}?>

