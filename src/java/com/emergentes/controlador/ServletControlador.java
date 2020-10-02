
package com.emergentes.controlador;

import com.emergentes.modelo.Encuesta;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ServletControlador", urlPatterns = {"/ServletControlador"})
public class ServletControlador extends HttpServlet {

   
    
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      String nombre =request.getParameter("nombre");
      String lenguaje[]=request.getParameterValues("lenguaje");
    
    Encuesta encu= new Encuesta();
    encu.setNombre(nombre);
    encu.setLenguaje(lenguaje);
    
    request.setAttribute("miencu",encu);
    request.getRequestDispatcher("salida.jsp").forward(request,response);
    }

   

}
