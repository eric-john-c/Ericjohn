
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class p1 extends HttpServlet {
   private String message;
   public void init() throws ServletException {
      
      message = "Welcome to Car Info";
   }
   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      response.setContentType("text/html");

      PrintWriter out = response.getWriter();
      out.println("<h1>" + message + "</h1>");
      out.println("<h3>Here you get information about the Cars</h3>");
   }
   public void destroy() {
      // do nothing.
   }
}