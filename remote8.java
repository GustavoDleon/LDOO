import java.io.IOException;  
import javax.servlet.ServletException;  
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  






public class remote8 extends HttpServlet {  

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
	
            throws ServletException, IOException {
				
        response.setContentType("text/html;charset=UTF-8");
		
        try (java.io.PrintWriter out = response.getWriter()) {
			
            Cookie[] cookie;
			
            cookie = request.getCookies();
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<body background=\"cookies.jpg\">");
            out.println("<h1>COOKIES</h1>");
            for(int i=0;i<cookie.length;i++)
			{
                out.println("<p><b> Cookie's name: </b> "+cookie[i+1].getNombre()+"</p>");
                out.println("<p><b> Cookie's value: </b> "+cookie[i+1].getValue()+"</p>");
                
            }
          
            out.println("</body>");
            out.println("</html>");
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