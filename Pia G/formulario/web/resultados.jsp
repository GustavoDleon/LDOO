<%-- 
    Document   : resultados
    Created on : 8/11/2018, 06:19:56 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultados</title>
    </head>
    <body>
        <% 
            String valor = null;
            Cookie[] allCookies = request.getCookies(); 
            for(Cookie cookie: allCookies){
                if(cookie.getName().equals("aleatorio")){
                       valor = cookie.getValue();
                }
            }
        %>
        <h1>Resultados</h1>
        <h2>Encontraste el numero :)</h2>
        <p>Tu numero de la suerte es: <%= valor %></p>
        Nombre <%= request.getParameter("nombre") %><br>
        Primer Apellido <%= request.getParameter("primerA") %><br>
        Segundo Apellido <%= request.getParameter("segundoA") %><br>
        Fecha Nacimiento <%= request.getParameter("fecha") %><br>
        Email <%= request.getParameter("email") %><br>
        Password <%= request.getParameter("password")%><br>
        <form action="cerrar.jsp" method="POST">
            <input type="submit" value="Cerrar Sesion"/>   
        </form>
        <%            
            String inicio = null;
            Cookie sesion = new Cookie("inicio", inicio);
            sesion.setMaxAge(60*60*2); 
            response.addCookie(sesion);
        %>
    </body>
</html>
