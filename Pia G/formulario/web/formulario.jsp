<%-- 
    Document   : formulario
    Created on : 8/11/2018, 06:08:03 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario</title>
    </head>
    <body>
        <h1>Formulario</h1>
        <p>Completa el formulario para empezar a jugar</p>
        <form action="juego.jsp" method="POST">
        Nombre<input type="text" name="nombre"/><br>
        Primer Apellido<input type="text" name="primer"/><br>
        Segundo Apellido<input type="text" name="segundo"/><br>
        Fecha Nacimiento<input type="text" name="fecha"/><br>
        Email<input type="text" name="correo"/><br>
        Password<input type="password" name="password"/><br>
        <input type="submit" value="Enviar"/>   
        </form>
    </body>
</html>
