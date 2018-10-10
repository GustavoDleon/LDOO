
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class practica5 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String nombre = request.getParameter("name");
            String primer = request.getParameter("first");
            String correo = request.getParameter("email");
            String password = request.getParameter("password");
                    
            out.println("<html>");
            out.println("<body>");
            out.println("<h2>FORM WEB</h2>"); 
            out.println("<p>nombre: "+name+"</p>");
            out.println("<p>primer apellido:"+first+"</p>");
            out.println("<p>correo electronico: "+email+"</p>");
            out.println("<p>contraseña: "+password+"</p>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");}
		}

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response); }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response); }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}