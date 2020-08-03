<?php

  $page = $_GET['num'];



?>

<?php


$primero = 1000*($page);
$ultimo = 1000*$page + 999;
$primero=str_pad($primero, 8, "0", STR_PAD_LEFT);
$ultimo = str_pad($ultimo, 8, "0", STR_PAD_LEFT);
?>

<?php
$title="Lista de números del $primero al $ultimo";
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
      <h1 class="mt-4 mb-3">DNIs del <?php echo $primero;?> al <?php echo $ultimo;?>
        <small>Subheading</small>
      </h1>
	  <ol class="breadcrumb">
        <li class="breadcrumb-item">
          <a href="index.html">Home</a>
        </li>
        <li class="breadcrumb-item active">Full Width</li>
      </ol>                    
                  
<p>Aquí puede ver listados todos los números del Documento Nacional de Identidad del <?php echo $primero;?> al <?php echo $ultimo;?> con su correspondiente letra</p>
      
	  

                <ul class="pagination pagination-lg">
        
                    <?php if($page != "0"){?><li class="page-item"><a class="page-link"  href="0"><<</a></li><?php }?>
                    <?php if($page != "0"){?><li class="page-item"><a class="page-link"  href="<?php echo $page-1;?>"><</a></li><?php }?>
                    <?php if($page != "99999"){?><li class="page-item"><a class="page-link"  href="<?php echo $page+1;?>" class="control-next">></a></li><?php }?>
                    <?php if($page != "99999"){?><li class="page-item"><a class="page-link"  href="99999" class="control-last">>></a></li><?php }?>


 </ul>

     
                                               


<ul class="columns list-unstyled">											   
<?php
for ($i=0; $i <= 999; $i++) {
$num= $i + 1000*$page;
$num=str_pad($num, 8, "0", STR_PAD_LEFT);
?>
<li><a href="<?php echo $urlbase;?>/<?php echo $num;?>"><?php echo $num;?><?php echo LetraNIF($num);?></a></li>
<?php }?>
</ul>

                                        </div>














<?php include 'common/footer.php';?>



