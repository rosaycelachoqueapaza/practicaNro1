
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro de Productos</h1>
            <form action="servletProductos" method="post">
            <label>Producto:</label>
            <input type="text" name="producto" value="">
            <br>
            <label for="">Categoria</label>
            <select name="categoria" id="">
                <option>Lacteos</option>
                <option>Menestras</option>
                <option>Gaseosas</option>
                <option>Frutas</option>
                <option></option>
            </select>
            <br>
            <label>Existencia:</label>
            <input type="number" name="existencia" value="" />
            <br>
            <label>Precio:</label>
            <input type="numbers" name="precio" value="" />
            <br>
            <input type="submit" value="Enviar" />

    </body>
</html>
