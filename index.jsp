<%-- 
    Document   : Calculadora
    Created on : 19-abr-2017, 10:57:44
    Author     : YERAY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora</title>
    </head>
    <body>
        <h1>CALCULADORA DE YERAY MORENO</h1>
        <form action="Calcular" method="get">
            <input   name="operando1"   type="text"></br></br>
            <select name="operacion">
                <option value="1"> Suma </option>
                <option value="2"> Resta </option>
                <option value="3"> Multiplicación </option>
                <option value="4"> División </option>
            </select></br></br>
            <input   name="operando2"   type="text"></br></br>
            <input   name="Calcular"   value="Calcular"   type="submit">
        </form>
    </body>
</html>
 

 


<!--<input   name="limpiar"   value="Limpiar"   type="reset">-->
