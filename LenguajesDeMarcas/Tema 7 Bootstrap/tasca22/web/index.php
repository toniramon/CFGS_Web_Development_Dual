<?php	include 'common/config.php';

$title="Dni, Información sobre todos los DNIs Españoles";
	include 'common/head.php';
	include 'common/header.php';	
	
?>


    <!-- Page Content -->
    <div class="container">

      <!-- Page Heading/Breadcrumbs -->
      <h1 class="mt-4 mb-3">Todo sobre el DNI
        <small>Todos los DNIs de España</small>
      </h1>
	  <ol class="breadcrumb">
        <li class="breadcrumb-item">
          <a href="./">DNI</a>
        </li>
      </ol>                    

 <div class="col-lg-12">
         
 	           
<?php
for ($i=0; $i <= 9; $i++) {

?>
<a class="btn btn-success" href="<?php echo $urlbase;?>/<?php echo $i;?>"><?php echo $i;?></a>

<?php }?>
 </div>   
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
       <?
                            include("lang/port_es.txt");                  
                    ?>     
	  

      

     
                                               


<ul class="columns list-unstyled">											   
                    <?php
                                        
                                        for($i = 0; $i < 120 ; $i++)
                                        {
                                        $number = rand(1,99999999);
										$number=str_pad($number, 8, "0", STR_PAD_LEFT);
                                    
                                        ?>
        <li><a href="<?php echo $urlbase;?>/<?php echo $number;?>"><?php echo $number;?><?php echo LetraNIF($number);?></a></li>       
                                        <?php
                                        
                                        
                                        }
                                        
                                        ?> 
</ul>

                                        </div>














<?php include 'common/footer.php';?>


             
                    
                   
                    
                  
       
                   
