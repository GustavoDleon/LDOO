<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>practica 4</title>
        <style>
            body{
                background-color:#21618c ;
                font-family:Lucida;
            }
            input[type=text], select, textarea {
                width: 50%;
                padding: 8px;
                resize: vertical;
            }
            input[type=password], select, textarea {
                width: 50%;
                padding: 8px;
                resize: vertical;
            }
            input[type=submit] {
                background-color: #a93226 ;
                color: white;
                padding: 12px 30px;
                cursor: pointer;
                float: left;
            }
        </style>
    </head>
    <body>
       
        <form action="jsp2.jsp" method="POST">
		
        Nombre:<input type="text" name="nombre"/><br>
		
        Primer Apellido:<input type="text" name="PA"/><br>
		
        Segundo Apellido:<input type="text" name="SA"/><br>
		
        Fecha de Nacimiento:<input type="text" name="date"/><br>
		
        Email:<input type="text" name="email"/><br>
		
        Contraseña:<input type="password" name="password"/><br>
		
        <input type="submit" value="Send"/>
		
        </form>
    </body>
</html>