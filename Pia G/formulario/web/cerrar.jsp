<%-- 
    Document   : cerrar
    Created on : 8/11/2018, 07:01:22 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sesion Cerrada</title>
    </head>
    <body>
        <% 
            Cookie cookie = null;
            Cookie[] cookies = null;
            cookies = request.getCookies();
            
            for (int i = 0; i < cookies.length; i++) {
                cookie = cookies[i];
                cookie.setMaxAge(0);
                response.addCookie(cookie);
            }
        %>
        <h1>Sesion Cerrada</h1>
    </head>
    </body>
</html>
