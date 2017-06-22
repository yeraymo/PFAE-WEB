<?php
    function puntuar($name){
        $puntos=0;
        $letras=array("a"=>1,"b"=>2,"c"=>3,"d"=>4,"e"=>5,"f"=>6,"g"=>7,"h"=>8,
                        "i"=>9,"j"=>10,"k"=>11,"l"=>12,"m"=>13,"n"=>14,"ñ"=>15,
                        "o"=>16,"p"=>17,"q"=>18, "r"=>19,"s"=>20,"t"=>21,"u"=>22
                        ,"v"=>23,"w"=>24,"x"=>25,"y"=>26,"z"=>27);
        $name=strtolower($name);
        for($i=0;$i<strlen($name);$i++){
            $puntos += $letras[$name[$i]];
        }
        echo "<h1> El nombre de ".$name." ha obtenido ".$puntos.".</h1>";
    }
    function fibo($num){
        $a=0;
        $b=1;
        $sum=0;
        echo $a." ".$b." ";
        while(($a+$b)<$num){
            //suma de los dos anteriores
            $sum=$a+$b;
            echo $sum." ";
            //actualizo
            $a=$b;
            $b=$sum;
        }
        
    }
