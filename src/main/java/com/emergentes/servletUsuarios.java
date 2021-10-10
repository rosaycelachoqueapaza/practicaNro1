
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "servletUsuarios", urlPatterns = {"/servletUsuarios"})
public class servletUsuarios extends HttpServlet {

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
           String correo = request.getParameter("correo");
           String password = request.getParameter("password");
       
        //Instanciar un objeto a partir de la clase Usuarios
        Usuarios usuario = new Usuarios();
       
        //Encapsular los datos recibidos en el objeto usuario
        usuario.setNombre(nombre);
        usuario.setApellidos(apellidos);
        usuario.setCorreo(correo);
        usuario.setPassword(password);
        
        //Colocar el id usuarios y el objeto usuario como atributo de request
        request.setAttribute("usuarios", usuario);
        
        //Derivamos el control a outUsuarios.jsp incluye al objeto request
        request.getRequestDispatcher("outUsuarios.jsp").forward(request, response);
    }


}
