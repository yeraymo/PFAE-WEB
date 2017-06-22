<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php //include'header.php';?>
        <form method="post">
            nombre: <input type="text" name="texto" >
            <!--edad: <input type="text" name="palabra"-->
            <input type="submit" name="Puntos" value="Contar" >
        </form>

    <?php
        // 1 Comprobar que usuario a pulsado el botón
        if (isset ($_POST["Puntos"])){
           $texto= $_POST["texto"];
           include'funciones_1.php';
           puntuar($texto);    
        }     
    ?>
    </body>
</html>
