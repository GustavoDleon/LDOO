package CONTROLADOR;

import Mod.USUARIO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class practica7 extends HttpServlet {

    private String pass;


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {       
       String us = request.getParameter("nombre");
       String pa =request.getParameter("password");
      
       
       Cookie co1 = new Cookie("nombre",us);
       Cookie co2 = new Cookie("password",pa);
       
       response.addCookie(co1);
       response.addCookie(co2);
       
    
       
       if(us.equals("") ||  pa.equals("")){
           request.getRequestDispatcher("logindown.jsp").forward(request,response);
       }
       else if(user.equals("Gustavo") && pass.equals("gdl8080")){
           USUARIO  I;
           I = new USUARIO(us,pa);
           request.getSession().setAttribute("USUARIO1",I);
           request.getRequestDispatcher("loginup.jsp").forward(request,response);
        
       }
     
       else{
           request.getRequestDispatcher("logindown.jsp").forward(request,response);
       }
       
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}