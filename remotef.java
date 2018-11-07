import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class remotef extends HttpServlet {

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

			<html lang="es">");

out.println("<head>");
	out.println("<meta charset="UTF-8">");
	out.println("<title>Factory library</title>");
	out.println("<script>");

	out.println("function Libro(nombre)");
	{
			out.println("this.nombre = nombre;");
		}
		out.println("function fabricaLibro()");
		{
			out.println("this.crear = function(nombre){");
				out.println("return new Libro(nombre);");
			};
		}
		out.println("function Revista(nombre)");
		{
			out.println("this.nombre = nombre;");
		}
		out.println("function fabricaRevista()");
		{
			out.println("this.crear = function(nombre)
			");{
				out.println("return new Revista(nombre);");
			};
		}

		out.println("var biblioteca = [];");
		out.println("var fabriquitaLibro = new fabricaLibro();");
		out.println("var fabriquitaRevista = new fabricaRevista();");
		out.println("var temp = '';");

		out.println("biblioteca.push(fabriquitaLibro.crear('señor de los anillos'));");
		out.println("biblioteca.push(fabriquitaLibro.crear('bajo la misma luna'));");
		out.println("biblioteca.push(fabriquitaRevista.crear('50 sombras de grey'));");
		out.println("biblioteca.push(fabriquitaRevista.crear('love rose'));");

		out.println("for (var i = 0; i < biblioteca.length; i++) {");
			out.println("temp += i + '.-' + biblioteca[i].nombre + '\n';");
		}

		out.println("alert(temp);");
	out.println("</script>");
out.println("</head>");
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