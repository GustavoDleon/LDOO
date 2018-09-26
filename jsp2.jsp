<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>pracica 4</title>
		
        <style>
		
            body{
                background-color: #d4ac0d ;
                font-family:Lucida;
            }
			
        </style>
		
    </head>
	
    <body>
        <%--
        String nombre = request.getParameter("nombre");
        String primer = request.getParameter("PA");
        String segundo = request.getParameter("SA");
        String fecha = request.getParameter("date");
        String correo = request.getParameter("email");
        String password = request.getParameter("password");
        --%>
		
        <p>Nombre:  <%= request.getParameter("nombre")%></p>
        <p>Primer Apellido: <%= request.getParameter("PA")%></p>
        <p>Segundo Apellido:  <%= request.getParameter("SA")%></p>
        <p>Fecha de Nacimiento: <%= request.getParameter("date")%></p>
        <p>Email:  <%= request.getParameter("email")%></p>
        <p>Contraseña:  <%= request.getParameter("password")%></p>
    </body>
</html>