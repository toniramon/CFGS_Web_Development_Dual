<?php

  $page = $_GET['num'];



?>

<?php




?>

<?php
$title="DNIs que empiezan por $page";
?>
<?	include 'common/config.php';
	include 'common/head.php';
?>

<?
	include 'common/header.php';	
	
?>


    <!-- Page Content -->
    <div class="container">

      <!-- Page Heading/Breadcrumbs -->
      <h1 class="mt-4 mb-3">DNIs que empiezan por  <?php echo $page;?>
    
      </h1>
	  
	  <?php $caracteres=strlen($page);
$split=str_split($page);
?>  
	  <ol class="breadcrumb">
        <li class="breadcrumb-item">
          <a href="./">DNI</a>
        </li>
		
		<?php for ($i=1; $i <= $caracteres-1; $i++) {
		$rest = substr("$page", 0, $i); 	?>
        <li class="breadcrumb-item"><a href="<?php echo $urlbase;?>/<?php echo $rest;?>"><?php echo $rest;?></a></li>
		
		<?php } ?>
		<li class="breadcrumb-item"><?php echo $page;?></li>
      </ol>                    
                  
     
	  


     
   <?php if ($caracteres <= "6"){?>                                            
<ul class="botonera">	
<li class="btn bg-light">Dnis que empiezan por:</li>

											   
<?php
for ($i=0; $i <= 9; $i++) {

?>

<li><a class="btn btn-success" href="<?php echo $urlbase;?>/<?php echo $page;?><?php echo $i;?>"><?php echo $page;?><?php echo $i;?></a></li>

<?php }?>
</ul>
<?php }?>

<div style="clear:both"></div>
Necesitas un seguro de coche barato? Si aquí está tu DNI y necesitas asegurar tu coche 
<script async src="//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
<ins class="adsbygoogle"
     style="display:block; text-align:center;"
     data-ad-layout="in-article"
     data-ad-format="fluid"
     data-ad-client="ca-pub-0597127180252835"
     data-ad-slot="6510728069"></ins>
<script>
     (adsbygoogle = window.adsbygoogle || []).push({});
</script>
<p>
Aunque muchos usuarios recurren a la táctica de dejar de pagar el recibo cuando desean anular la póliza en cuestión, en realidad no es correcta. Además, faculta a las aseguradoras a reclamar el importe total de la póliza por no haber comunicado en el plazo oportuno nuestra intención de no renovar el citado seguro.
</p><p>
Algunas personas piensan que con el simple hecho de no pagar la prima del seguro es suficiente para instar la no renovación de un seguro. No obstante, si bien las compañías no suelen iniciar en la práctica ningún tipo de procedimiento jurídico contra ellas, la actual legislación establece que si por culpa del tomador la primera prima no ha sido pagada, o la prima única no lo ha sido a su vencimiento, el asegurador tiene derecho a resolver el contrato o exigir el pago de la prima debida en vía ejecutiva con base en la póliza.
</p><p>
Así, para evitar tener que pagar por un seguro dos veces, con el consiguiente coste y dolores de cabeza que esto nos puede acarrear, lo mejor que podemos hacer es solicitar la no renovación de la póliza, en el plazo que estipula la Ley, concretamente y como verá a continuación, en la actualidad se trata de dos meses, aunque en la propia póliza, según las condiciones de la misma y el tipo de compañía, se pueden contemplarse plazos inferiores. No obstante, sí podemos solicitar a la compañía el precio de la renovación con dos meses de antelación, y en base a esa cantidad, actuar en consecuencia.
</p><p>
Concretamente, según la Ley de Contrato de Seguro en su Artículo 22º, tanto la aseguradora como el tomador del seguro pueden oponerse a la prórroga del contrato mediante una notificación escrita a la otra parte, efectuada con al menos un plazo de dos meses de anticipación a la conclusión del período del seguro en curso.
</p><p>
Desde Seguros.es, y con el fin de evitar malentendidos, recomendamos comunicar la no renovación mediante el envío de un telegrama o burofax a la sede social de la compañía, con indicación de los datos del tomador, número de referencia de la póliza y la indicación inequívoca de que no se va a renovar la misma al próximo vencimiento.
</p><p>
Otros medios alternativos de comunicación, aunque menos recomendables desde el punto de vista legal, podrían ser presentar un escrito en el agente del seguro, exigiéndole el acuse mediante la colocación de firma, cuño de empresa, fecha y DNI del receptor, o el envío de un fax con guarda del reporte de envío.
</p>
    <h2 class="mt-4 mb-3">Lista de DNIs que empiezan por  <?php echo $page;?>
    
      </h2>                                      







<?php if ($caracteres == "1"){?>
<ul class="columns list-unstyled">											   
                    <?php
                                        
                                        for($i = 0; $i < 2000 ; $i++)
                                        {
                                        $number = rand(1,9999999);
										$number=str_pad($number, 7, "0", STR_PAD_LEFT);
										$number="$page$number";
                                    
                                        ?>
        <li><a href="<?php echo $urlbase;?>/<?php echo $number;?>"><?php echo $number;?><?php echo LetraNIF($number);?></a></li>       
                                        <?php
                                        
                                        
                                        }
                                        
                                        ?> 
</ul>
<?php }?>

<?php if ($caracteres == "2"){?>
<ul class="columns list-unstyled">											   
                    <?php
                                        
                                        for($i = 0; $i < 3000 ; $i++)
                                        {
                                        $number = rand(1,999999);
										$number=str_pad($number, 6, "0", STR_PAD_LEFT);
										$number="$page$number";
                                    
                                        ?>
        <li><a href="<?php echo $urlbase;?>/<?php echo $number;?>"><?php echo $number;?><?php echo LetraNIF($number);?></a></li>       
                                        <?php
                                        
                                        
                                        }
                                        
                                        ?> 
</ul>
<?php }?>

<?php if ($caracteres == "3"){?>
<ul class="columns list-unstyled">											   
                    <?php
                                        
                                        for($i = 0; $i < 4000 ; $i++)
                                        {
                                        $number = rand(1,99999);
										$number=str_pad($number, 5, "0", STR_PAD_LEFT);
										$number="$page$number";
                                    
                                        ?>
        <li><a href="<?php echo $urlbase;?>/<?php echo $number;?>"><?php echo $number;?><?php echo LetraNIF($number);?></a></li>       
                                        <?php
                                        
                                        
                                        }
                                        
                                        ?> 
</ul>
<?php }?>

<?php if ($caracteres == "4"){?>
<ul class="columns list-unstyled">											   
<?php
for ($i=0; $i <= 9999; $i++) {
$num= $i + 10000*$page;
$num=str_pad($num, 8, "0", STR_PAD_LEFT);
?>
<li><a href="<?php echo $urlbase;?>/<?php echo $num;?>"><?php echo $num;?><?php echo LetraNIF($num);?></a></li>
<?php }?>
</ul>
<?php }?>

<?php if ($caracteres == "5"){?>
<ul class="columns list-unstyled">											   
<?php
for ($i=0; $i <= 999; $i++) {
$num= $i + 1000*$page;
$num=str_pad($num, 8, "0", STR_PAD_LEFT);
?>
<li><a href="<?php echo $urlbase;?>/<?php echo $num;?>"><?php echo $num;?><?php echo LetraNIF($num);?></a></li>
<?php }?>
</ul>
<?php }?>


<?php if ($caracteres == "6"){?>
<ul class="columns list-unstyled">											   
<?php
for ($i=0; $i <= 99; $i++) {
$num= $i + 100*$page;
$num=str_pad($num, 8, "0", STR_PAD_LEFT);
?>
<li><a href="<?php echo $urlbase;?>/<?php echo $num;?>"><?php echo $num;?><?php echo LetraNIF($num);?></a></li>
<?php }?>
</ul>
<?php }?>



<?php if ($caracteres == "7"){?>
<ul class="columns list-unstyled">											   
<?php
for ($i=0; $i <= 9; $i++) {
$num= $i + 10*$page;
$num=str_pad($num, 8, "0", STR_PAD_LEFT);
?>
<li><a href="<?php echo $urlbase;?>/<?php echo $num;?>"><?php echo $num;?><?php echo LetraNIF($num);?></a></li>
<?php }?>
</ul>
<?php }?>

  </div>






<?php include 'common/footer.php';?>



