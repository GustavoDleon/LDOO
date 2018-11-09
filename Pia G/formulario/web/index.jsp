<%-- 
    Document   : index
    Created on : 8/11/2018, 06:25:55 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenido</title>
    </head>
    <body>
        <% 
            Cookie[] cookies = null;
            cookies = request.getCookies();
            
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("inicio")) {
                    response.sendRedirect("resultados.jsp");
                    break;    
                }  
            }
        %>
        <h1>Bienvenido</h1>
        <p>Disfruta de  mi nuevo juego</p>
        <form action="formulario.jsp" method="POST">
            <input type="submit" value="Jugar"/>   
        </form>
    </body>
</html>
