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
                <h1>Calificaciones</h1>
        <form action="puntuacion" method="post">
            <table border="1" style="width:100%;text-align: center">
                <tr>
                    <th colspan="3"><h3><strong>MORENO GIL, YERAY</strong></h3></th>
                </tr>
                <tr>
                    <td>Nota 1: <?php echo $_POST["n1"];?></td>
                    <td>Nota 1: <?php echo $_POST["n4"];?></td>		
                    <td>Nota 1: <?php echo $_POST["n7"];?></td>
                </tr>
                <tr>
                    <td>Nota 2: <?php echo $_POST["n2"];?></td>
                    <td>Nota 2: <?php echo $_POST["n5"];?></td>		
                    <td>Nota 2: <?php echo $_POST["n8"];?></td>
                </tr>
                <tr>
                    <td>Nota 3: <?php echo $_POST["n3"];?></td>
                    <td>Nota 3: <?php echo $_POST["n6"];?></td>		
                    <td>Nota 3: <?php echo $_POST["n9"];?></td>
                </tr>
                <tr>
                     <th colspan="3"> La Nota Media es <?php 
                                        echo ($_POST["n1"]+$_POST["n2"]+$_POST["n3"]+$_POST["n4"]+$_POST["n5"]+$_POST["n6"]+$_POST["n7"]+$_POST["n8"]+$_POST["n9"])/9.0;
                                    ?></th>
                </tr>
            </table>  
        </form>
    </body>
</html>
