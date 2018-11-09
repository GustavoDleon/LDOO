<%-- 
    Document   : resultadosBD
    Created on : 8/11/2018, 08:03:49 PM
    Author     : ADMIN
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/resultados [gustavo on GUSTAVO]", "gustavo", "lsti");
            
            Statement stmt = con.createStatement();
            
            String sql;
            sql = "SELECT Nombre, Primero, Segundo, Fecha, Email, Password FROM resultados";
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                String primero = rs.getString("primero");
                String segundo = rs.getString("segundo");
                String nombre = rs.getString("nombre");
                String fecha = rs.getString("fecha");
                String password = rs.getString("Password");
                String email = rs.getString("email");
        %>
                <h1>Resultados</h1>
                <h2>Encontraste el numero :)</h2>
                <p>Tu numero de la suerte es: <%= valor %></p>
                Nombre <%=nombre %><br><br>
                Primer Apellido <%=primero%><br><br>
                Segundo Apellido <%=segundo%><br><br>
                Fecha Nacimiento <%=fecha %><br><br>
                Email <%=email%><br><br>
                Pasword <%=password%>
                <form action="cerrar.jsp" method="POST">
                    <input type="submit" value="Cerrar Sesion"/>   
                </form>
        <%  }   %>
    </body>
</html>
