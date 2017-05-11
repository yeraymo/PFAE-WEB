<%--moreno YERAY--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Calificaciones</h1>
        <form action="puntuacion" method="post">
            <table border="1" style="width:100%;text-align: center">
                <tr>
                    <th colspan="3"><h3><strong>MORENO GIL, YERAY</strong></h3></th>
                </tr>
                <tr>
                    <td>Nota 1: <input type="text" name="n1"></td>
                    <td>Nota 1: <input type="text" name="n4"></td>		
                    <td>Nota 1: <input type="text" name="n7"></td>
                </tr>
                <tr>
                    <td>Nota 2: <input type="text" name="n2"></td>
                    <td>Nota 2: <input type="text" name="n5"></td>		
                    <td>Nota 2: <input type="text" name="n8"></td>
                </tr>
                <tr>
                    <td>Nota 3: <input type="text" name="n3"></td>
                    <td>Nota 3: <input type="text" name="n6"></td>		
                    <td>Nota 3: <input type="text" name="n9"></td>
                </tr>
                
                <tr>
                     <th colspan="3"><input type="submit" value="CALCULAR" ></th>
                </tr>
            </table>  
        </form>
    </body>
</html>
