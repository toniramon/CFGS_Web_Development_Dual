<?php
   include 'common/config.php';
  $num = $_GET['num'];

$dnicomplet="$num".LetraNIF($num);
?>


<?php     

$title="$dnicomplet, Información sobre el dni $dnicomplet";
        include 'common/head.php';
?>

<?php
        include 'common/header.php';        
        
?>

    <!-- Page Content -->
    <div class="container">

      <!-- Page Heading/Breadcrumbs -->
      <h1 class="mt-4 mb-3"><?php echo $num;?><?php echo LetraNIF($num);?>
      </h1>

     <?php $caracteres=strlen($num);
$split=str_split($num);

?>  
	  <ol class="breadcrumb">
        <li class="breadcrumb-item">
          <a href="./">DNI</a>
        </li>
		
		<?php for ($i=1; $i <= $caracteres-1; $i++) {
		$rest = substr("$num", 0, $i); 	?>
        <li class="breadcrumb-item"><a href="<?php echo $urlbase;?>/<?php echo $rest;?>"><?php echo $rest;?></a></li>
		
		<?php } ?>
		<li class="breadcrumb-item"><?php echo $num;?><?php echo LetraNIF($num);?></li>
      </ol>   

	  <h2>¿Cómo escribir o leer el Dni <?php echo $num;?><?php echo LetraNIF($num);?>?</h2>	  
<?php

require_once('numtoword.php');

$x=$num;
if (isset($x)){



             $resultinwords=new numtoword;
    $result=$resultinwords->sp($x);     ?>
<?php    echo "El dni $num en español se escribe como ".$result; } ?>
<br />
<p>El dni <?php echo $num;?> se puede leer agrupando cada 2 cifras como: 
<?php
for ($i=0; $i < 7; $i=$i + 2) {
$x=$num[$i].$num[$i+1];

echo "($x) ";

 $resultinwords=new numtoword; $result=$resultinwords->sp($x); echo $result;  }?> 
 <br />
El dni <?php echo $num;?> se pronuncia cifra a cifra como:
<?php
for ($i=0; $i <= 7; $i++) {
$x=$num[$i];
echo "($x) ";
$resultinwords=new numtoword; $result=$resultinwords->sp($x); echo $result; }?>
.</p>

	  <h2>¿Porqué el Dni <?php echo $num;?> tiene la letra <?php echo LetraNIF($num);?>?</h2>
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
Cuando existe algún tipo de conflicto familiar lo más recomendable es buscar un buen abogado de familia, pero el problema surge al determinar qué es un buen abogado de familia. Y decimos que lo más recomendable en buscar un abogado de familia, no únicamente un abogado, ya que por las especialidades de la materia un abogado de familia tiene que tener unas determinadas cualidades profesionales, dotes personales y conocimientos técnicos jurídicos que no están al alcance de cualquier profesional del derecho.
</p><p> 

Y decimos también que es recomendable buscar un buen abogado de familia y no buenos abogados de familia, pues el buen profesional de familia es un profesional que trabaja en contacto directo con sus clientes, que ha de conocer de primera mano los problemas concretos de la familia concreta para llegar no a una solución sino a la mejor solución posible, por eso es recomendado acudir a un profesional que pudiendo contar o no en su despacho con más compañeros, se comprometa a atender personalmente a sus clientes, por eso es necesario un único abogado y no un equipo de abogados que impedirán el trato directo y personal con el cliente.

 </p><p> 

El buen abogado de familia ha de ser experto en su materia, materia que no es escasa pues a diferencia de la opinión común un abogado de familia no sólo es experto en nulidades matrimoniales, separaciones y divorcios, sino que ha de ser un auténtico experto en temas tan variados y diversos como la guardia y custodia de los menores, la custodia compartida, la liquidación de la sociedad matrimonial, la sustracción de menores (ya sea nacional o internacional), la modificación de medidas, equipos psicosociales, pensiones alimenticias, pensiones compensatorias, convenios reguladores, protocolo familiar, violencia de género, maltrato masculino y femenino, maltrato a menores, denuncias falsas, régimen de visitas, mediación familiar, casuística específica de las parejas de hecho, incapacitación civil… y tantas y tantas materias que afectan a la esfera más íntima de las personas.

 </p><p> 

Pero además un buen abogado de familia tiene que tener una buena trayectoria profesional en la que se tiene que aunar la experiencia suficiente, la especialización en la materia, y el conocimiento técnico, desaconsejándose a aquellos abogados que ante la pregunta de cualquier cliente contestan aquello de “yo llevo de todo”. Esta trayectoria profesional será la que genere la confianza debida en el cliente, confianza necesaria para poder plantear la mejor solución al caso concreto aunque dicha solución no sea la que inicialmente consideraba el cliente. Un buen abogado de familia tiene que tener la capacidad de plantear a su clientes soluciones que no se habían planteado hasta el momento y tiene que ser capaz de transmitir nuevos enfoques a los mismos problemas para poder llegar a mejores soluciones.

 </p><p> 

Un buen abogado de familia tiene que ser un buen abogado de menores cuando en los conflictos familiares existan hijos. Malo es todo aquel abogado de familia que ve únicamente a su cliente en aquél que le paga los honorarios, pues siempre que existan menores el abogado de familia tiene que tener claro que los hijos menores también son sus clientes, y además sus clientes preferentes.

 </p><p> 

Otra de las claves que distingue a un verdadero abogado de familia es que no ve a su cliente como a un cliente estándar con problemas estándar y con soluciones estándar. Un buen abogado de familia sabe que cada familia es una comunidad de intereses, valores y expectativas diferente a cualquier otra familia, y con mayor razón en los momentos de crisis familiar pues si bien es cierto que todas las familias felices lo parecen ser de la misma forma, sin embargo las familias y las parejas en crisis siempre lo son a su manera y con su casuística concreta.

 </p><p> 

Un buen abogado de familia ha de capaz de discernir los problemas presentes y los futuros, buscando soluciones a los presentes y evitando la generación de los futuros; para ello lo primero será trata de buscar una solución global, pero si esta no se puede conseguir el buen abogado de familia tendrá que parcializar los problemas e ir solucionándolos de forma independiente rompiendo en muchos casos la dinámica de los juzgados de familia y construyendo nuevos esquemas jurídicos para cada caso, luchando si es necesario por no vincular la guarda y custodia al uso de la vivienda, o los alimentos a la guarda y custodia, las comunicaciones al pago de los alimentos, etc., si con ello es capaz de dar solución real al problema planteado, teniendo siempre claro que tiene que primar el interés de los menores, y que en la relación entre los cónyuges, ex cónyuges o parejas ha de primar los principios de igualdad, compensación de desequilibrios, y corresponsabilidad parental.

 </p><p> 

Por último un buen abogado de familia ha de ser muchísimo más que un buen abogado, ha de ser un persona con grandes conocimientos psicológicos, ha de mostrar sinceridad absoluta, ha de tener sentido común, ha de ser razonable, ha de ser flexible en sus horarios de consultas, ha de ser cercano al cliente, ha de ser atento a las necesidades de los menores aunque nadie las manifieste, ha de ser un garante de la paz social y la paz familiar, ha de tener dotes de comunicación ante el cliente, ante su contrario y ante el juez.

 </p><p> 

Si busca entre sus familiares, amigos, compañeros y conocidos un buen abogado de familia cerciórese de que el abogado de familia que le recomiendan posea todas estas cualidades. Si por el contrario utiliza Google o cualquier otra herramienta de internet compruebe que el abogado con el que va a concertar una cita es especialista únicamente en derecho de familia, y comprueba igualmente si tiene la suficiente experiencia, pues el resto de virtudes no las podrá descubrir hasta la primera entrevista.

</p>

<p>Para verificar el <strong>NIF de españoles residentes mayores de edad</strong>, el algoritmo de cálculo del dígito de control es el siguiente:</p>

 <p> Se divide el número entre 23 y el resto se sustituye por una letra que se determina por inspección mediante la siguiente tabla:</p>
 <table align="center" border="1" cellpadding="2" cellspacing="1" style="width: 300px;"> <tbody> <tr> <td> <strong>RESTO</strong></td> <td style="text-align: center;"> <strong>0</strong></td> <td style="text-align: center;"> <strong>1</strong></td> <td style="text-align: center;"> <strong>2</strong></td> <td style="text-align: center;"> <strong>3</strong></td> <td style="text-align: center;"> <strong>4</strong></td> <td style="text-align: center;"> <strong>5</strong></td> <td style="text-align: center;"> <strong>6</strong></td> <td style="text-align: center;"> <strong>7</strong></td> <td style="text-align: center;"> <strong>8</strong></td> <td style="text-align: center;"> <strong>9</strong></td> <td style="text-align: center;"> <strong>10</strong></td> <td style="text-align: center;"> <strong>11</strong></td> </tr> <tr> <td> <strong>LETRA</strong></td> <td style="text-align: center;"> T</td> <td style="text-align: center;"> R</td> <td style="text-align: center;"> W</td> <td style="text-align: center;"> A</td> <td style="text-align: center;"> G</td> <td style="text-align: center;"> M</td> <td style="text-align: center;"> Y</td> <td style="text-align: center;"> F</td> <td style="text-align: center;"> P</td> <td style="text-align: center;"> D</td> <td style="text-align: center;"> X</td> <td style="text-align: center;"> B</td> </tr> </tbody> </table> <p> &nbsp;</p> <table align="center" border="1" cellpadding="3" cellspacing="1" style="width: 300px;"> <tbody> <tr> <td> <strong>RESTO</strong></td> <td style="text-align: center;"> <strong>12</strong></td> <td style="text-align: center;"> <strong>13</strong></td> <td style="text-align: center;"> <strong>14</strong></td> <td style="text-align: center;"> <strong>15</strong></td> <td style="text-align: center;"> <strong>16</strong></td> <td style="text-align: center;"> <strong>17</strong></td> <td style="text-align: center;"> <strong>18</strong></td> <td style="text-align: center;"> <strong>19</strong></td> <td style="text-align: center;"> <strong>20</strong></td> <td style="text-align: center;"> <strong>21</strong></td> <td style="text-align: center;"> <strong>22</strong></td> </tr> <tr> <td> <strong>LETRA</strong></td> <td style="text-align: center;"> N</td> <td style="text-align: center;"> J</td> <td style="text-align: center;"> Z</td> <td style="text-align: center;"> S</td> <td style="text-align: center;"> Q</td> <td style="text-align: center;"> V</td> <td style="text-align: center;"> H</td> <td style="text-align: center;"> L</td> <td style="text-align: center;"> C</td> <td style="text-align: center;"> K</td> <td style="text-align: center;"> E</td> </tr> </tbody> </table> <p> &nbsp;</p>
 
 <p> El número <?php echo $num;?>, dividido entre 23 tiene como resto resto <?php echo ($num%23);?>, por lo que la letra asignada es la <?php echo LetraNIF($num);?>: <strong><?php echo $num;?><?php echo LetraNIF($num);?></strong></p> <p> &nbsp;</p>


  </div>
    <!-- /.container -->

<?php include 'common/footer.php';?>




