package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class resultados_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Resultados</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 
            String valor = null;
            Cookie[] allCookies = request.getCookies(); 
            for(Cookie cookie: allCookies){
                if(cookie.getName().equals("aleatorio")){
                       valor = cookie.getValue();
                }
            }
        
      out.write("\n");
      out.write("        <h1>Resultados</h1>\n");
      out.write("        <h2>Encontraste el numero :)</h2>\n");
      out.write("        <p>Tu numero de la suerte es: ");
      out.print( valor );
      out.write("</p>\n");
      out.write("        Nombre ");
      out.print( request.getParameter("nombre") );
      out.write("<br>\n");
      out.write("        Primer Apellido ");
      out.print( request.getParameter("primerA") );
      out.write("<br>\n");
      out.write("        Segundo Apellido ");
      out.print( request.getParameter("segundoA") );
      out.write("<br>\n");
      out.write("        Fecha Nacimiento ");
      out.print( request.getParameter("fecha") );
      out.write("<br>\n");
      out.write("        Email ");
      out.print( request.getParameter("email") );
      out.write("<br>\n");
      out.write("        Password ");
      out.print( request.getParameter("password"));
      out.write("<br>\n");
      out.write("        <form action=\"cerrar.jsp\" method=\"POST\">\n");
      out.write("            <input type=\"submit\" value=\"Cerrar Sesion\"/>   \n");
      out.write("        </form>\n");
      out.write("        ");
            
            String inicio = null;
            Cookie sesion = new Cookie("inicio", inicio);
            sesion.setMaxAge(60*60*2); 
            response.addCookie(sesion);
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
