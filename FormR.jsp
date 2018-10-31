<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>practica 6</title>
      <head>
  <style>
    <%= .outer%> 
	{ 
      <%= position: relative;%>
      <%= width: 25%;%>
      <%= padding-bottom: 25%;%>
    }
    <%= .inner%> 
	{
      <%= position: absolute;%>
      <%= width: 100%;%>
      <%= height: 100%;%>
      <%= background-color: #00FF00;%> 
    }
  </style>
</head>
<body>
  <div class="outer">
    <div class="inner"></div>
  </div>
</body>
    </head>
    <body>
        <h1>practica 6</h1>
        Nombre: <%= request.getParameter("nombre") %>
        Apellido: <%= request.getParameter("apellido") %>
        Correo: <%= request.getParameter("correo") %>
        Contraseña: <%= request.getParameter("password") %>
    </body>
</html>