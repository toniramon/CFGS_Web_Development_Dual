<?php
/*************************************************************
***   Class ‘numtoword’:
***			 by José Giambruno josegiambruno@adinet.com.uy

*** - It turns I number in its equivalent one in text.
*** - This version provides functions to obtain the output
***		 in english, Spanish, frances, Italian, German and
*** 		Portuguese.
***
*************************************************************
*** Application:
*** - the applications Are multiple that require the function.
*** - It is intention of the author, to collect collaborations
*** 	in other different languages.
*** - if it does not wish to install it, the program this functional one
*** 	in http://www.cuentafacil.com/numbers/example.php
*************************************************************



*************************************************************
***		- Convierte un numero en su equivalente en texto.
***        - Esta version provee funciones para obtener la salida
***        	en ingles, español, frances, italiano, aleman y
***         portugues.
***
*************************************************************
***   Application:
*** 	- Son multiples las aplicaciones que requieren la funcion.
***		- Es intencion del autor, coleccionar colaboraciones
***        	en otros diferentes idiomas.
***		- si no desea instalarlo, el programa esta funcional
***        	en http://www.cuentafacil.com/numbers/example.php
*************************************************************
*************************************************************
***       Include this code in your script:  Incluya este codigo en su script
***    -------------------------------------------------
			require_once('numtoword.php');
            $resultinwords=new numtoword;
		    $result=$resultinwords->en($x);      // for english
***    -------------------------------------------------
***              (optional)        [sp]          // spanish
***                                [fr]          // francaise
***                                [pt]          // portuguese
***                                [it]          // italiano
***                                [de]          // germany
***    -------------------------------------------------
***         Where $x is the number to work
*************************************************************
***/
class numtoword{
	var $text;
    function numtoword(){
		$this->text=$text;
    }
// the array and the file produce a new asociative array
    function en($x){                   	// english language
        $v=array(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,30,40,50,60,70,80,90,100,1000,1000000);
        $fd = fopen ("words_en.txt", "r");
        while (!feof($fd)) {
            $buffer = fgets($fd, 4096);
            $y=$y+1;
            $numeral=$v[$y];
            $w[$numeral]=$buffer;
            $word[$y]=$buffer;   		// new array is $word[].
        }
        fclose ($fd);                   // close file
        $quit_spaces=strlen($w[4])-4;  	// determines the blank space in each line to quit
		$all=strlen($x);
		$search=strstr($x,",");         // search for decimal point
		$dot=chr(46);
		$searchdot=strstr($x,$dot);
		$cosex=strlen($search);
		if (strlen($searchdot>0)){
    		$search=$searchdot;         // have decimals
		}
		$numbersout=strlen($search);
		$newx=substr($x,0,$all-$numbersout);
		$cents=substr($search,1,2);
        $d=substr($cents,0,1);
        $u=substr($cents,1,1);
		if ($cents>0){

 			$cents=" point ".$w[$d].$w[$u];
// if your option is currency dolar,uncomment the next line
//            $cents=" dollars and ".$cents." cents";
		}
		$x=$newx;                       // now, $x is an integer
		$e=strlen($x);
        if ($e>9){
         	echo "it exceeds amount digitos that can be processed";
            return;
        }
		$e=strlen($x);
	    $n=substr($x,$e-2,2);           	// take the last two
        $d=substr($n,0,1);
        $u=substr($n,1,1);
        $d=$d*10;
        if ($n<21){                         // 1 to 20
        	$n=$n*1;
        	$units=$w[$n];
        }else{                              // 21 to 99
        	$units=$w[$d];
            $minus=strlen($units);
            $units=substr($units,0,$minus-$quit_spaces);
            $units=$units."-".$w[$u];
        }
        if (strlen($x)>2){                  // 100 to 999
         	$c=substr($x,$e-3,3);
            $ce=substr($c,0,1);
            $resto=substr($x,$e-2,2);
            if ($resto>0){
                $hunds="and ";
            }
 			if ($ce>0){
            	$hunds=$w[$ce]." hundred ".$hunds;
            }
        }
        if (strlen($x)>3){              	// 1000 to 99.999
         	if (strlen($x)==4){
             	$u=substr($x,0,1);
                if ($u>0){
                	$thousis=$w[$u]." thousand ";
                }
            }
            if (strlen($x)>4){              // 10.000 to 99.999
            	$du=substr($x,$e-5,2);
                $du=$du*1;
     			if($du<21){                 // 10.000 to 20.000
                	if ($du>0){
                		$thousis=$w[$du]." thousand ";
                    }
                }else{
                 	$d=substr($du,0,1);     // 21.000 to 99.000
                    $d=$d*10;
                    $u=substr($du,1,1);
                    $thousis=$w[$d];//.
					$minus=strlen($thousis);
                    $thousis=substr($thousis,0,$minus-$quit_spaces);
                    if ($d>0){
                    	$thousis=$thousis."-".$w[$u]."thousand ";
                    }
                    if (strlen($x)>5){
                    	$thousis=" and ".$thousis;
                    }
                }
            }
        }
        if (strlen($x)>5){                  // 100.000 to 999.999
	        $c=substr($x,$e-6,3);
            $ce=substr($c,0,1);
            $ntury=substr($c,1,2);
            if ($ce>0){
            	$hundth=$w[$ce]." hundred ";
                if ($ntury=="00"){
                 	$hundth=$w[$ce]." hundred thousand ";
                }
            }
        }
        if ($e>6){                          // 1.000.000 to 9.000.000
        	if ($e==7){
           		$mi=substr($x,$e-7,1);
            }
            if ($e>7)                       // 10.000.000 to 99.000.000
            	$mi=substr($x,$e-8,2);
                $m=substr($m,0,1);
                $i=substr($m,1,1);
            }
            if($mi<21){
            	if($mi>0){
            		$millis=$w[$mi]." million ";
                }
           	}
            if ($mi>20){
            	$m=substr($mi,0,1);
                $i=substr($mi,1,1);
            	$m=$m*10;
                $mill=$w[$m];
                $out=strlen($mill);
               	$mill=substr($mill,0,$out-$quit_spaces);
              	$ones=$w[$i];
                $millis=$mill."-".$ones."million ";
        	}
            if($e>8){
             	$cofm=substr($x,$e-9,1);
                $dofm=substr($x,$e-8,2);
                $millis=$w[$cofm]." hundred and ".$millis;
                if ($dofm=="00"){
                	$millis=$w[$cofm]." hundred million ";//.
                }
            }
        $mynumber=$millis.$hundth.$thousis.$hunds.$units.$cents;
        return $mynumber;
    }
// end function en();

    function it($x){                     // italiano
    	$v=array(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,30,40,50,60,70,80,90,100,1000,1000000);
	    $fd = fopen ("words_it.txt", "r");
    	while (!feof($fd)) {
        	$buffer = fgets($fd, 4096);
        	$y=$y+1;
        	$numeral=$v[$y];
        	$w[$numeral]=$buffer;
            $word[$y]=$buffer;
        }
        fclose ($fd);
        $qs=strlen($w[4])-7;
		$todo=strlen($x);
		$buscar=strstr($x,",");
		$dot=chr(46);
		$buscarpunto=strstr($x,$dot);
		$cosex=strlen($buscar);
		if (strlen($buscarpunto>0)){
    		$buscar=$buscarpunto;
		}
		$numbersout=strlen($buscar);
		$newx=substr($x,0,$todo-$numbersout);
		$centesimos=substr($buscar,1,2);
        $d=substr($centesimos,0,1);
        $u=substr($centesimos,1,1);
		if ($centesimos>0){
 			$centesimos=" virgola ".$w[$d].$w[$u];
		}
//            $centesimos=" liras ".$centesimos;
		$x=$newx;
		$e=strlen($x);
        if ($e>9){
         	echo "eccede i digitos di quantità che possono essere proceduti";
            return;
        }
		$e=strlen($x);
        $n=$x;
        if($e>1){
	    	$n=substr($x,$e-2,2);
        }
        $d=substr($n,0,1);
        $u=substr($n,1,1);
        $d=$d*10;
        if ($n<21){
        	$n=$n*1;
        	$unidades=$w[$n];
        }
        if($n>20){
        	$unidades=substr($w[$d],0,strlen($w[$d])-$qs).$w[$u];
        }
        if($e>2){
         	$n=substr($x,$e-3,1);
            if($n==1){
            	$c=$n*100;
             	$centenas=substr($w[$c],0,strlen($w[$c])-$qs);
            }
            if($n>1){
             	$centenas=substr($w[$n],0,strlen($w[$n])-$qs)."cento";
            }
        }
		if($e>3){
        	$cdu=substr($x,$e-3,3);
//            echo "cdu=".$cdu;
         	if($e==4){

            	$n=substr($x,$e-4,1);
        //        $largo=0;
                if($n>1){
             		$miles=substr($w[$n],0,strlen($w[$n])-$qs)."mila";
                }
                if($n==1){
                 	$miles="mille e ";
                }
                if($n==1 and $cdu=="000"){
                 	$miles="mille";
                }
            }
            if($e>4){
             	$n=substr($x,$e-5,2);
                $d=substr($n,0,1)*10;
                $u=substr($n,1,1);
                if($n<21){
                 	$miles=substr($w[$n],0,strlen($w[$n])-$qs)."mila";
                }
                if($n>20){
                 	$miles=substr($w[$d],0,strlen($w[$n])-$qs).substr($w[$u],0,strlen($w[$u])-$qs)."mila";
                }
            }
            if($e>5){
             	$n=substr($x,$e-6,1);
                if($n==1){
                 	$n=0;
                }
                $cienmiles=substr($w[$n],0,strlen($w[$n])-$qs)."cento";
            }
            if($e>6){
             	if($e==7){
                	$n=substr($x,$e-7,1);
                 	$millones=substr($w[$n],0,strlen($w[$n])-$qs)."milione";
                }
                if($e>7){
                 	$n=substr($x,$e-8,2);
                    $d=substr($n,0,1)*10;
                    $u=substr($n,1,1);
                    if($n<21){
                     	$millones=substr($w[$n],0,strlen($w[$n])-$qs)."milione";
                    }
                    if($n>20){
                     	$millones=substr($w[$d],0,strlen($w[$d])-$qs).substr($w[$u],0,strlen($w[$u])-$qs)."milione";
                    }
                }
            }
            if($e>8){
             	$n=substr($x,$e-9,1);
                $millones=substr($w[$n],0,strlen($w[$n])-$qs)."cento".$millones;
            }
        }
        $mynumber=$millones.$cienmiles.$miles.$centenas.$unidades.$centesimos;
        return $mynumber;
    }
// end function it();

    function pt($x){                     // portugues
        $v=array(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,30,40,50,60,70,80,90,100,200,300,400,500,600,700,800,900,1000,1000000);
        $fd = fopen ("words_pt.txt", "r");
        while (!feof($fd)) {
            $buffer = fgets($fd, 4096);
            $y=$y+1;
            $numeral=$v[$y];
            $w[$numeral]=$buffer;
            $word[$y]=$buffer;
        }
        fclose ($fd);
		$todo=strlen($x);
		$buscar=strstr($x,",");
		$dot=chr(46);
		$buscarpunto=strstr($x,$dot);
		$cosex=strlen($buscar);
		if (strlen($buscarpunto>0)){
    		$buscar=$buscarpunto;
		}
		$numbersout=strlen($buscar);
		$newx=substr($x,0,$todo-$numbersout);
		$centesimos=substr($buscar,1,2);
        $d=substr($centesimos,0,1);
        $u=substr($centesimos,1,1);
		if ($centesimos>0){
 			$centesimos=" e ".$d.$u." centavos";
		}
//            $centesimos=" reais ".$centesimos;
		$x=$newx;
		$e=strlen($x);
        if ($e>9){
         	echo "excede os digitos de uma quantidade que podem ser processados";
            return;
        }
		$e=strlen($x);
        $n=$x;
        if(strlen($x)>1){
		    $n=substr($x,$e-2,2);
        }
        $d=substr($n,0,1);
        $u=substr($n,1,1);
        $d=$d*10;
        if ($n<22){
        	$n=$n*1;
        	$unidades=$w[$n];
        }
        if($n>21){
            $unidades=$w[$d]." e ".$w[$u];
        }
        $e=strlen($x);
        if($e>2){
         	$n=substr($x,$e-3,1)*100;
            if($n>1){
            	$centenas=$w[$n];
            }
            if($n=="100"){
             	$centenas="cento ";
            }
            $du=$d.$u;
            if ($n=="100" and $du=="00"){
             	$centenas=" cem ";
            }
        }
		if($e>3){
         	if(strlen($x)==4){
            	$n=substr($x,$e-4,1);
                $miles=$w[$n]." mil ";
            }
            if($e>4){
            	$losmiles=substr($x,$e-6,3);
             	$n=substr($x,$e-5,2);
                $d=substr($n,0,1)*10;
                $u=substr($n,1,1);
                if($u==0){
                   	$miles=$w[$d]."mil ";
                }
                if($u>0){
                	$miles=$w[$d]." e ".$w[$u]." mil ";
  				}
                if($losmiles=="000"){
                   	$miles="";
                }
            }
        }
        if(strlen($x)>5){
        	$du=substr($x,$e-5,2);
            $n=substr($x,$e-6,1)*100;
            if($n>100){
            	$cienmiles=$w[$n];
            }
            if($n==100 and $du > "00" ){
             	$cienmiles="cento ";
            }
            if($n==100 and $du=="00"){
             	$cienmiles="cem ";
            }
        }
        if(strlen($x)>6){
         	if(strlen($x)==7){
             	$n=substr($x,$e-7,1);
                $millones=$w[$n]." milhão ";
            }
            if(strlen($x)>7){
             	$n=substr($x,$e-8,2);
                $d=substr($n,0,1)*10;
                $u=substr($n,1,1);
                $millones=$w[$d]." e ".$w[$u]." milhão ";
                if($n<21){
                 	$millones=$w[$n]." milhão ";
                }
            }
        }
        if(strlen($x)>8){
         	$n=substr($x,$e-9,1)*100;
            $millones=$w[$n].$millones;
        }
        $mynumber=$millones.$cienmiles.$miles.$centenas.$unidades.$centesimos;
        return $mynumber;
    }
// end function pt();

	function de($x){					// deustch
        $v=array(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,30,40,50,60,70,80,90,100,101,200,1000,1000000);
        $fd = fopen ("words_de.txt", "r");
        while (!feof($fd)) {
            $buffer = fgets($fd, 4096);
            $y=$y+1;
            $numeral=$v[$y];
            $w[$numeral]=$buffer;
            $word[$y]=$buffer;
        }
        fclose ($fd);
        $qs=strlen($w[4])-4;
		$todo=strlen($x);
		$buscar=strstr($x,",");
		$dot=chr(46);
		$buscarpunto=strstr($x,$dot);
		$cosex=strlen($buscar);
		if (strlen($buscarpunto>0)){
    		$buscar=$buscarpunto;
		}
		$numbersout=strlen($buscar);
		$newx=substr($x,0,$todo-$numbersout);
		$centesimos=substr($buscar,1,2);
        $d=substr($centesimos,0,1);
        $u=substr($centesimos,1,1);
		if ($centesimos>0){
        	if ($centesimos<21){
            	$u=$centesimos*1;
             	$centesimos=" mit ".substr($w[$u],0,$largo-$qs);
                if($u==1){
                 	$centesimos=$centesimos."s";
                }
            }else if($centesimos>20){
 				$centesimos=" mit ".substr($w[$u],0,$largo-$qs)."und".substr($w[$d],0,$largo-$qs)."zig";
            }
		}
		$x=$newx;
		$e=strlen($x);
        if ($e>9){
         	echo "es übersteigt Menge digitos, die verarbeitet werden können";
            return;
        }
		$e=strlen($x);
        if($e==1){
         	$x="0".$x;
        }
        $e=strlen($x);
	    $n=substr($x,$e-2,2);
        $d=substr($n,0,1);
        $u=substr($n,1,1);
        $d=$d*10;
        $w[1]="ein  ";
        if ($u==1 and $d=="00"){
            $w[1]="eins ";
        }
	    $largo=strlen($w[$u]);
        if ($n<21){
           	$n=$n*1;
        	$unidades=$w[$n];
        }else{
            if ($u>0){
        	$unidades=substr($w[$u],0,$largo-$qs)."und".$w[$d];
        	}
        }
        if ($n>20){
        	if($u>0){
         		$unidades=substr($w[$u],0,$largo-$qs)."und".$w[$d];
            }
            if($u==0){
             	$unidades=$w[$d];
            }
        }
        if ($e>2){
         	$n=substr($x,$e-3,1);
            $largo=strlen($w[$n]);
            if ($n==1){
            	$centenas="hundert";
            }
            if ($n>1){
            	$centenas=substr($w[$n],0,$largo-$qs)."hundert";
            }
        }
        if ($e>3){
        	if($e==4){
            	$u=substr($x,$e-4,1);
                $largo=strlen($w[$u]);
                $miles=substr($w[$u],0,$largo-$qs)."tausend";
            }
  			if ($e>4){
            	$n=substr($x,$e-5,2);
             	$d=substr($n,0,1);
                $u=substr($n,1,1);
                $n=$n*1;
                if ($n<13 and $n!="0"){
                	$largo=strlen($w[$n]);
                    $miles=substr($w[$n],0,$largo-$qs)."tausend";
            	}
                if ($n>12){
                 	$largo=strlen($w[$u]);
                    $w[$u]=substr($w[$u],0,$largo-$qs);
                    $miles=$w[$u];
                    $w[$u]=$w[$u]." ";
                    $largo=strlen($w[$d]);
                    $miles=$miles."und".substr($w[$d],0,$largo-$qs)."tausend";
                }
        	}
            $zeroes=substr($x,$e-6,1);
            if ($e>5 and $zeroes!="0"){
            	$cm=substr($x,$e-6,1);
                $largo=strlen($w[$cm]);
                $cienmiles=substr($w[$cm],0,$largo-$qs)."hundert";
            }
            if ($e>6){
                if ($e==7){
                	$n=substr($x,$e-7,1);
                    $largo=strlen($w[$n]);
                    $millones=substr($w[$n],0,$largo-$qs)."millon";
                }
                if ($e>7){
                   	$n=substr($x,$e-8,2);
					$d=substr($n,0,1);
                	$u=substr($n,1,1);
                    $n=$n*1;
                    if ($n<13){
                    	$largo=strlen($w[$n]);
                        $millones=substr($w[$n],0,$largo-$qs)."millon";
                    }
                    if ($n>12){
                     	$largo=strlen($w[$u]);
                        $millones=substr($w[$u],0,$largo-$qs);
                        $d=$d*10;
                        $largo=strlen($w[$d]);
                        $millones=$millones."und".substr($w[$d],0,$largo-$qs)."millon";
                    }
                }
                if($e>8){
                 	$n=substr($x,$e-9,1);
                    $largo=strlen($w[$n]);
                    $millones=substr($w[$n],0,$largo-$qs)."hundred".$millones;
                }
            }
        }
        $mynumber=$millones.$cienmiles.$miles.$centenas.$unidades.$centesimos;
        return $mynumber;
    }
// end function de();

	function fr($x){					// francaise
            $v=array(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,30,40,50,60,70,80,90,100,1000,1000000);
        $fd = fopen ("words_fr.txt", "r");
        while (!feof($fd)) {
            $buffer = fgets($fd, 4096);
            $y=$y+1;
            $numeral=$v[$y];
            $w[$numeral]=$buffer;
            $word[$y]=$buffer;
        }
        fclose ($fd);
		$todo=strlen($x);
		$buscar=strstr($x,",");
		$dot=chr(46);
		$buscarpunto=strstr($x,$dot);
		$cosex=strlen($buscar);
		if (strlen($buscarpunto>0)){
    		$buscar=$buscarpunto;
		}
		$numbersout=strlen($buscar);
		$newx=substr($x,0,$todo-$numbersout);
		$centesimos=substr($buscar,1,2);
        $d=substr($centesimos,0,1);
        $u=substr($centesimos,1,1);
		if ($centesimos>0){

 			$centesimos=" avec ".$d.$u."/100";
		}
//            $centesimos=" francs ".$centesimos;
		$x=$newx;
		$e=strlen($x);
        if ($e>9){
         	echo "il dépasse quantité de digits qui peuvent être traités";
            return;
        }
		$e=strlen($x);
	    $n=substr($x,$e-2,2);
        $d=substr($n,0,1);
        $u=substr($n,1,1);
        $d=$d*10;
        if ($n<21){
        	$n=$n*1;
        	$unidades=$w[$n];
        }
		if ($n>20 and $n<90){
        	$unidades=$w[$d].$w[$u];
        }
        if ($n>89){
        	$u=$n-80;
            $unidades=$w[80].$w[$u];
        }
        if ($e>2){
        	$n=substr($x,$e-3,1);
        	if ($n>0){
        		$centenas=$w[$n]."cent ";
            	if ($n>1){
             		$centenas=$w[$n]."cents ";
           	 	}
        	}
        }
		if ($e>3){
            if($e==4){
            	$n=substr($x,$e-4,1);
             	$miles=$w[$n]."mille ";
            }
            if($e>4){
             	$n=substr($x,$e-5,2);
                $d=substr($n,0,1);
                $u=substr($n,1,1);
                if($n<21){
                 	$miles=$w[$n]."mille ";
                }
                if ($n>20 and $n<90){
                 	$miles=$w[$d*10].$w[$u]."mille ";
                }
                if ($n>89){
                 	$u=$n-80;
                    $miles=$w[80].$w[$u]."mille ";
                }
            }
            if ($e>5){
             	$n=substr($x,$e-6,1);
                if($n>0){
                 	$cienmiles=$w[$n]."cents ";
                    if($n==1){
                    	$cienmiles=$w[$n]."cent ";
                    }
                }
				$v=substr($x,$e-6,3);
                if($v=="000"){
                 	$miles="";
                }
            }
            if($e>6){
            	$millones=" million ";
             	if ($e==7){
                	$n=substr($x,$e-7,1);
                    $millones=$w[$n].$millones;
                }
                if ($e>7){
                 	$n=substr($x,$e-8,2);
                    $d=substr($n,0,1);
                    $u=substr($n,1,1);
                    if($n<21){
                     	$millones=$w[$n].$millones;
                    }
	                if ($n>20 and $n<90){
                    	$millones=$w[$d].$w[$u].$millones;
                    }
                    if ($n>89){
                     	$d=80;
                        $u=$n-80;
                       	$millones=$w[$d].$w[$u].$millones;
                    }
                }
            }
            if ($e>8){
             	$n=substr($x,$e-9,1);
                if($n>0){
                 	$cienmilmill=$w[$n]."cents ";
                    if($n==1){
                    	$cienmilmill=$w[$n]."cent ";
                    }
                }
                $millones=$w[$n].$millones;
            }
        }
        $mynumber=$millones.$cienmiles.$miles.$centenas.$unidades.$centesimos;
        return $mynumber;
    }
// end function fr();

	function sp($x){                   // idioma español
    	$v=array(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,20,30,40,50,60,70,80,90,100,200,300,400,500,600,700,800,900,1000,1000000);
		$fd = fopen ("words_sp.txt", "r");
		while (!feof($fd)) {
    		$buffer = fgets($fd, 4096);
    		$y=$y+1;
    		$numeral=$v[$y];
    		$w[$numeral]=$buffer;
    		$word[$y]=$buffer;
		}
		fclose ($fd);
		$todo=strlen($x);
		$buscar=strstr($x,",");
		$dot=chr(46);
		$buscarpunto=strstr($x,$dot);
		$cosex=strlen($buscar);
		if (strlen($buscarpunto>0)){
    		$buscar=$buscarpunto;
		}
		$numbersout=strlen($buscar);
		$newx=substr($x,0,$todo-$numbersout);
		$centesimos=substr($buscar,1,2);
		if ($centesimos>0){
 			$centesimos=" con ".$centesimos."/100";
		}
		$x=$newx;
		$e=strlen($x);
        if ($e>9){
         	echo "excede cantidad de digitos que se pueden procesar";
            return;
        }
	    $n=substr($x,$e-2,2);
	    $auxnum=$n;
  			if ($n<10){
		   		$n=$n*1;
				$texto=$w[$n];
  				$n="0".$n;
  			}
    		$f=strlen($x);
			if($n==substr($x,$f-2,2)){
  				if ($n<2){
        			$w[1]="";
        		}
			}
			if (substr($n,1,1)==1){
   				$w[1]="uno";
   			}
			$unidad=substr($n,1,1);
			$decena=substr ($n,0,1);
			if ($unidad < 1 or $decena==0 ){
				$texto=$w[$decena].$w[$unidad];
			}
    		if ($decena>2 and $unidad>0){
 	   			$decena=$decena*10;
				$texto=$w[$decena]." y ".$w[$unidad];
    		}
    		if ($decena<1 and $unidad>0){
    			$texto=$w[$unidad];
    		}
    		if ($decena>0 and $unidad==0){
       			$decena=$decena*10;
    			$texto=$w[$decena];
    		}
			if ($decena==2 and $unidad>0){
       			$w[20]="veinti";
        		$anteultimo=20;
       			$texto=$w[$anteultimo].$w[$unidad];
			}else{
    			if($decena==2 and $unidad==0){
	   				$w[20]="veinte";
    	    		$texto=$w[$n];
        		}
	   		}
			if ($n==10){
    			$texto="diez";
    		}
			if ($n >10 and $n < 16){
				$texto=$w[$n];
   			}
    		if ($n > 15 and $n < 20){
     			$texto=" diez y ".$w[$unidad];
    	   	}
            $unidades=$texto;
// cargo centenas.
	    if ($e>2){
	    	$num=substr($x,$e-3,1);
            $e=strlen($x);
    		$n=substr($x,$e-2,2);
    		if ($num==1 and $n>0){
        		$w[100]="ciento ";
    		}
    		$l=substr($x,$e-3,1);
    		$century=$l*100;
    		$centenas=$w[$century];
	    }
	    if ($e>3){
   		 	if($e==4){
        		$num=substr($x,$e-4,1);
            	$num="0".$num;
        	}else{
        		$num=substr($x,$e-5,2);
        	}
// cargo decenas de mil;
        	$w[1]="un";
        	$n=$num;
    		$f=strlen($x);
			if($n==substr($x,$f-2,2)){
  				if ($n<2){
        		   	$w[1]="";
        		}
			}
			$unidad=substr($n,1,1);
			$decena=substr ($n,0,1);
			if ($unidad < 1 or $decena==0 ){
				$texto=$w[$decena].$w[$unidad];
			}
   			if ($decena>2 and $unidad>0){
 	   			$decena=$decena*10;
				$texto=$w[$decena]." y ".$w[$unidad];
    		}
    		if ($decena>0 and $unidad==0){
       	   		$decena=$decena*10;
    			$texto=$w[$decena];
    		}
			if ($decena==2 and $unidad>0){
       			$w[20]="veinti";
           		$anteultimo=20;
       			$texto=$w[$anteultimo].$w[$unidad];
			}else{
    			if($decena==2 and $unidad==0){
	   				$w[20]="veinte";
    	    		$texto=$w[$n];
        		}
			}
			if ($n==10){
    			$texto="diez";
			}
			if ($n >10 and $n < 16){
				$texto=$w[$n];
   			}
    		if ($n > 15 and $n < 20){
     			$texto=" diez y ".$w[$unidad];
    		}
    		if ($n==1){
    			$w[1]="un";
    		}
    		if ($n<10){
        		$miaux=substr($n,1,1);
         		$texto=$w[$miaux];
    		}
          $miles=$texto;
    		if ($num > 0){
     			$miles=$miles." mil ";
    		}
    	}
// cargo las centenas de mil:
    	if ($e>"5"){
       		$num=substr($x,$e-6,1);
    		$dos="0".$num;
            $n=$num;
    		$n=$n*100;
    		if (substr($x,1,2)=="00"){
    			$texto=$w[$n]."mil ";
    		}else{
    			$w[100]="ciento ";
    			$texto=$w[$n];
    		}
    		if ($n==0 and substr($x,1,2)=="00"){
    			$texto="";
    		}
            $cienmiles=$texto;
    	}
    	if ($e==7){
    		$num=substr($x,$e-7,1);
			if ($num<2){
				$texto=$w[$num]." millon ";
    		}else{
    			$texto=$w[$num]." millones ";
    		}
  		$millones=$texto;
    	}
    	if ($e>7){
    		$n=substr($x,$e-8,2);
            $digito=substr($x,$e-7,1);
            if ($digito==1){
             	$w[1]="un ";
            }
	    	$auxnum=$n;
            if 	($n==1){
            }
  			if ($n<10){
		   		$n=$n*1;        // quito el digito inicial para poder leer el indice
				$texto=$w[$n];
  				$n="0".$n;
  			}
    		$f=strlen($x);
			if($n==substr($x,$f-2,2)){
  				if ($n<2){
        			$w[1]="";
        		}
			}
			if (substr($n,1,1)==1){
   				$w[1]="un ";
   			}
			$unidad=substr($n,1,1);
			$decena=substr ($n,0,1);
			if ($unidad < 1 or $decena==0 ){
				$texto=$w[$decena].$w[$unidad];
			}
    		if ($decena>2 and $unidad>0){
 	   			$decena=$decena*10;
				$texto=$w[$decena]." y ".$w[$unidad];
    		}
    		if ($decena<1 and $unidad>0){
    			$texto=$w[$unidad];
    		}
    		if ($decena>0 and $unidad==0){
       			$decena=$decena*10;
    			$texto=$w[$decena];
    		}
			if ($decena==2 and $unidad>0){
       			$w[20]="veinti";
        		$anteultimo=20;
       			$texto=$w[$anteultimo].$w[$unidad];
			}else{
    			if($decena==2 and $unidad==0){
	   				$w[20]="veinte";
    	    		$texto=$w[$n];
        		}
	   		}
			if ($n==10){
    			$texto="diez";
    		}
			if ($n >10 and $n < 16){
				$texto=$w[$n];
   			}
    		if ($n > 15 and $n < 20){
     			$texto=" diez y ".$w[$unidad];
    		}
            $millones=$texto;
        	$millones=$millones."millones ";
    	}
// cargo centenas de millones
		if ($e==9){
        	$c=substr($x,$e-9,1);
        	$du=substr($x,e-8,2);
        	$w[100]="ciento ";
	        if ($c==1 and $du==0){
    	     	$w[100]="cien ";
       	 	}
            $c=$c*100;
            $millones=$w[$c].$millones;
        }
    	$mynumber=$millones.$cienmiles.$miles.$centenas.$unidades.$centesimos;
        return $mynumber;
	}
// end function sp()

}
// end class numtoword()
?>