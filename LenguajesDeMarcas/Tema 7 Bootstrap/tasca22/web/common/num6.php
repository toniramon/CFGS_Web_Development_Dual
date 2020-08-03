<?php
 $num=$_GET[var1];

?>




<?php
/**
 * OEOG Ejemplo de uso de Class para convertir numeros en palabras
 * Probado en/Tested on PHP 5-Apache2-XP
 *
 *
 * @version   $Id: CNumeroaLetra_ejemplo.php,v 1.0.0 2004-10-29 13:20 ortizom Exp $
 * @author    Omar Eduardo Ortiz Garza <ortizom@siicsa.com>
 * @copyright (c) 2004-2005 Omar Eduardo Ortiz Garza
 * @since     Friday, October 29, 2004
 **/

 $lang=$_GET[lang];
 include("lang/es.php");
$nummenos=$num - 1;
$nummas=$num + 1;
$metadescripcion= "El $num es el número natural que sigue al $nummenos y precede al $nummas.";

$paginacion= $num/1000;
$paginacion= floor($paginacion);
$primero= $paginacion*1000 + 1;
$numero= _NUMERO;
$numerourl= _NUMEROURL;
$title="$num, $numero $num, $numeroenletras" ;
?>

<!doctype html>
<html lang="es">
<?php	include 'common/config.php';
	include 'common/head.php';
?>
<body>
<?php
	include 'common/header.php';	
	
?>

<!-- BODY CONTAINER - FULL WIDTH -->
<div class="container-fluid">
    <div class="row">

        <?php
	        include 'common/leftmenu.php';
        ?>
        
        <!-- =========================
             BLOG SECTION 
        ============================== -->
        <div class="col-md-18 col-sm-18">
            <div class="blog-style-one">
               
                <article class="blog-item">
                    <header>
                        <h2 class="title">
                            El N�mero <?php echo $num; ?>

                        </h2>
                    </header>
                   <br>
                    <a href="./"><?php echo _NUMEROS;?></a> >
                    <a  href="numeros-0<?php echo $paginacion;?>.html"><?php echo _NUMEROS;?> <?php echo _DEL;?> <?php echo $primero;?> <?php echo _AL;?> <?php echo $primero+999;?></a>
                    
                    <hr>
                    
                     <?php
	                    include 'common/336x280.php';	                    
                    ?>
                     <?php
	                    include 'common/336x280.php';	                    
                    ?>
                    
                    <img src="numero-<?php echo $num;?>.png" alt="numero <?php echo $num;?>" />
                    
                    <br><br><br><br>
                    
                    <h3><?php echo _PROPIEDADESMATEMATICAS;?> <?php echo _Y;?> <?php echo _PROPIEDADESTRIGONOMETRICAS;?> <?php echo _DE;?> <?php echo $num;?></h3>
                    
                    <br>
                    <a href="<?php echo $num; ?>.html"><?php echo $num;?></a> <?php echo _ESELNUMERONATURAL;?> <?php echo _QUESIGUEAL;?> <a href="<?php echo $num - 1; ?>.html"><?php echo $num - 1;?></a> <?php echo _Y;?> <?php echo _PRECEDEAL;?> <a href="<?php echo $num + 1; ?>.html"><?php echo $num + 1;?></a>.
<br />
<?php echo $num;?> <?php if ($num % 2 == "0"){ ?>
            es un n�mero par.</a>
   <?php } else { ?>
        es un n�mero impar. <?php } ?>
        
        <br />
                    
                    
                    
                    <br>
                    	<hr>
                    
                    <header>
                        <h4 class="title">
                            N�meros generados aleatoriamente 
                        </h4>
                    </header>

					<br><br>
                    <?php
					
					for($i = 0; $i < 120 ; $i++)
					{
					$number = rand(1,50000);
					$tam = rand(16,32);
					if($lang=="es"){ $numerotext=_NUMEROES;}
					if($lang=="en"){ $numerotext=_NUMEROEN;}
					if($lang=="ru"){ $numerotext=_NUMERORU;}
					if($lang=="cn"){ $numerotext=_NUMEROCN;}
					if($lang=="pt"){ $numerotext=_NUMEROPT;}
					?>
						
						<a href="<?php echo $urlbase;?>/<?php echo $number;?>.html"><?php echo $number;?></a> &nbsp;&nbsp;&nbsp;
						
					<?php
					
					
					}
					
					?>	
                   

                    
                </article>

                
            </div>
        </div>
       

        
            </div>
</div> <!-- end of .container-fluid -->


<?php include 'common/footer.php';?>




</body>
</html>