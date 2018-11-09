<%-- 
    Document   : perdedor
    Created on : 27/10/2018, 12:54:25 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Perdedor</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>Mala suerte :( (Perdiste)</h1>

        <h1>El numero era: <%= request.getParameter("valor") %></h1>
    </body>
</html>