
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="inscripciones" scope="request" class="com.emergentes.Inscripciones" />
        <h1>Inscripciones en curso</h1>
        <p>Nombre: <jsp:getProperty name="inscripciones" property="nombre" /> </p>
        <p>Apellidos: <jsp:getProperty name="inscripciones" property="apellidos" /> </p>
        <p>Curso: <jsp:getProperty name="inscripciones" property="curso" /> </p>
        <a href="index.jsp">Volver</a>
    </body>
</html>
