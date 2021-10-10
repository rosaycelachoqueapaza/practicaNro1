

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Inscripcion en curso</h1>
        <form action="servletInscripciones" method="post">
            <label>Nombre:</label>
            <input type="text" name="nombre" value="">
            <br>
            <label>Apellidos:</label>
            <input type="text" name="apellidos" value="" />
            <br>
            <label for="">Curso</label>
            <select name="curso" id="">
                <option>Emergentes</option>
                <option>Base de Datos</option>
                <option>Analisis y Diseño</option>
                <option>Redes</option>
                <option></option>
            </select>
            <br>
            <input type="submit" value="Enviar" />
    </body>
</html>
