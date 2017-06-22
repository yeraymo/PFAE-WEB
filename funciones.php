<?php
    function puntuar($name){
        $puntos=0;
        $char = array("a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z");
        for($i=0;$i<strlen($name);$i++){
            for($j=0;$j<count($char);$j++){
                if($name[$i]==$char[$j]){
                    $puntos=$puntos + $j + 1;
                    break; 
                }
            }
        }
        echo "<h1> El nombre de ".$name." ha obtenido ".$puntos.".</h1>";
    }
