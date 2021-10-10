
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "servletInscripciones", urlPatterns = {"/servletInscripciones"})
public class servletInscripciones extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Recibo datos del formulario
           String nombre = request.getParameter("nombre");
           String apellidos = request.getParameter("apellidos");
           String curso = request.getParameter("curso");
       
        //Instanciar un objeto a partir de la clase Inscripciones
        Inscripciones Ins = new Inscripciones();
       
        //Encapsular los datos recibidos en el objeto Ins
        Ins.setNombre(nombre);
        Ins.setApellidos(apellidos);
        Ins.setCurso(curso);
        
        //Colocar al objeto Ins como atributo de request
        request.setAttribute("inscripciones", Ins);
        
        //Derivamos el control a outInscripciones.jsp incluye al objeto request
        request.getRequestDispatcher("outInscripciones.jsp").forward(request, response);
    }


}
