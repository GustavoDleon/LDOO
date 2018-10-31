import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ADMIN
 */
public class FormCont extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
	
            throws ServletException, IOException {
				
        response.setContentType("text/html;charset=UTF-8");
		
        try (PrintWriter out = response.getWriter()) {

            String primer = request.getParameter("primer");
            String nombre = request.getParameter("nombre");
            String correo = request.getParameter("correo");
            String password = request.getParameter("password");
            
            FormularioModelo formulario = new FormularioModelo();
            
			formulario.setPrimer(primer);
			formulario.setNombre(nombre);
            formulario.setCorreo(correo);
            formulario.setPassword(password);
            

            
            boolean comparacion = formulario.comparar();
            
            if(comparacion == true){
                response.sendRedirect("FormularioResultados.jsp?nombre="+form.getNombre()+"&primer="+form.getPrimer()+"&correo="+formulario.getCorreo()+"&password="+formulario.getPassword());
            
			}else{
              
			  response.sendRedirect("FormError.jsp");
            } 
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
  
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
    }// </editor-fold>

}