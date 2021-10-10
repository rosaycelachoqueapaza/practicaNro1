
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="usuarios" scope="request" class="com.emergentes.Usuarios" />
        <h1>Registro de Usuarios</h1>
        <p>Nombre: <jsp:getProperty name="usuarios" property="nombre" /> </p>
        <p>Apellidos: <jsp:getProperty name="usuarios" property="apellidos" /> </p>
        <p>Correo Electronico: <jsp:getProperty name="usuarios" property="correo" /> </p>
        <p>Contraseña: <jsp:getProperty name="usuarios" property="password" /> </p>
        <a href="index.jsp">Volver</a>
    </body>
</html>
