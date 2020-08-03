<?php
// Send the headers
header('Content-type: text/xml');
header('Pragma: public');
header('Cache-control: private');
header('Expires: -1');
echo "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
?>
<urlset xmlns="http://www.sitemaps.org/schemas/sitemap/0.9"> 
<?
$num=$_GET[num];
$inicio=50000*($num - 1)+1;
$fin= 50000*$num;
for ($i = $inicio; $i <= $fin; $i++) {
 
 ?>
  <url>
    <loc>https://dnis.es/<?php echo $i; ?></loc>
    <lastmod>2018-01-05</lastmod>
  </url>

 <?
}
?>
</urlset>

