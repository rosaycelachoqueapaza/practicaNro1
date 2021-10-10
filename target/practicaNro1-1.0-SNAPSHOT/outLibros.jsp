

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="libros" scope="request" class="com.emergentes.Libros" />
        <h1>Registro de Libros</h1>
        <p>Titulo: <jsp:getProperty name="libros" property="titulo" /> </p>
        <p>Autor: <jsp:getProperty name="libros" property="autor" /> </p>
        <p>Resumen: <jsp:getProperty name="libros" property="resumen" /> </p>
        <p>Medio: <jsp:getProperty name="libros" property="medio" /> </p>
        <a href="index.jsp">Volver</a>
    </body>
</html>

</head>
