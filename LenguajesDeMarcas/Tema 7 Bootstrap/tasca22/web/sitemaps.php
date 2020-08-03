<?php
// Send the headers
header('Content-type: text/xml');
header('Pragma: public');
header('Cache-control: private');
header('Expires: -1');
echo "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
?>
   <sitemapindex xmlns="http://www.sitemaps.org/schemas/sitemap/0.9">
   <?for ($i = 1; $i <= 500; $i++) {
 
 ?>
   <sitemap>
      <loc>https://dnis.es/sitemap<?php echo $i?>.xml</loc>
      <lastmod>2018-01-05</lastmod>
   </sitemap>

 <?
}
?>

   </sitemapindex>