<?php
while ($line = fgets(STDIN)) {
  $lines[] = trim($line);
}
foreach($lines as $array){
  echo "$array\n";
}
?>