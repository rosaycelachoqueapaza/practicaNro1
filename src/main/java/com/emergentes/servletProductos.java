
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "servletProductos", urlPatterns = {"/servletProductos"})
public class servletProductos extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Recibo datos del formulario
           String producto = request.getParameter("producto");
           String categoria = request.getParameter("categoria");
           String existencia = request.getParameter("existencia");
           String precio = request.getParameter("precio");
       
        //Instanciar un objeto a partir de la clase Productos
        Productos prod = new Productos();
       
        //Encapsular los datos recibidos en el objeto productos
        prod.setProducto(producto);
        prod.setCategoria(categoria);
        prod.setExistencia(existencia);
        prod.setPrecio(precio);
        
        //Colocar el id productos y el objeto prod como atributo de request
        request.setAttribute("productos", prod);
        
        //Derivamos el control a outProductos.jsp incluye al objeto request
        request.getRequestDispatcher("outProductos.jsp").forward(request, response);
    }

}
