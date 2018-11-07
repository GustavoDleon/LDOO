import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

    public class remote7 extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
	
            throws ServletException, IOException {
			
        response.setContentType("text/html;charset=UTF-8");
		
        try (PrintWriter out = response.getWriter()) {
            
           Cookie[] co;
		   
            co = request.getCookies();
			
            for (Cookie co1 : co) {
				               
                out.println("cookie nombre" + cook1.getNombre());
                out.println("cookie value" + cook1.getValue());
            }
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