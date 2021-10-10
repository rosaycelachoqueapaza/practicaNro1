
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "servletLibros", urlPatterns = {"/servletLibros"})
public class servletLibros extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         //Recibo datos del formulario
           String titulo = request.getParameter("titulo");
           String autor = request.getParameter("autor");
           String resumen = request.getParameter("resumen");
           String medio = request.getParameter("medio");
       
        //Instanciar un objeto a partir de la clase Libros
        Libros libro = new Libros();
       
        //Encapsular los datos recibidos en el objeto libro
       libro.setTitulo(titulo);
       libro.setAutor(autor);
       libro.setResumen(resumen);
       libro.setMedio(medio);
        
        //Colocar el id libros y el objeto libro como atributo de request
        request.setAttribute("libros", libro);
        
        //Derivamos el control a outLibros.jsp incluye al objeto request
        request.getRequestDispatcher("outLibros.jsp").forward(request, response);
    }


}
