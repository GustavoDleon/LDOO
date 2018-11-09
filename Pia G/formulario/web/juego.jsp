<%-- 
    Document   : juego
    Created on : 8/11/2018, 07:11:28 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Juego</title>
    </head>
        <body> 
        <h1>Acierta</h1>
        <p>Introduce un numero y veremos si esta en el rango aleatorio</p>
        <form action="juegoControlador" method="POST">
            <input type="text" name="numero"/>
            <input type="submit" value="Enviar"/>   
        </form>
    </body>
</html>
