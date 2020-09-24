import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
public class TestServ extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) 
		throws IOException, ServletException{
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		out.println("<head>");
		out.println("<title>servlet|first</title>");
		out.println("</head>");
		out.println("<body bgcolor=\"gray\">");
		out.println("<h1><center>The servlet Life Cycle</center><h1>");
		out.println("<center><img src=\"slf.jpg\" width=\"500\" height=\"430\"></center>");
		out.println("<p><center>The servlet is initialized by calling the init() method<br>The servlet calls service() method to process a client's request<br>The servlet is terminated by calling the destroy()method<br>Finally, servlet is garbage collected by the garbage collector of the JVM</center></p>");
		out.println("</body>");
		out.println("</html>");
       }
}
		