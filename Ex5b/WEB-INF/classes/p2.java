// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class p2 extends HttpServlet {
   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      // Set response content type
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      String title = "Car Info";
      String docType =
         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
         
      out.println(docType +
         "<html>\n" +
            "<head><title>" + title + "</title></head>\n" +
            "<body bgcolor = \"#f0f0f0\">\n" +
               "<h1 align = \"center\">" + title + "</h1>\n" +
               "<ul>\n" +
                  "  <li><b> Name</b>: "
                  + request.getParameter("name") + "\n" +
                  "  <li><b>Car Type</b>: "
                  + request.getParameter("type") + "\n" +
               "</ul>\n" +
            "</body>" +
         "</html>"
      );
      
      out.println(docType +
         "<html>\n" +
            "<body bgcolor = \"#f0f0f0\">\n" +
               "<ul>\n" +
                  "  <li><b>Diesel: </b>: "
                  + request.getParameter("Diesel") + "\n" +
                  "  <li><b>Petrol: </b>: "
                  + request.getParameter("Petrol") + "\n" +
                  "  <li><b>Electric: </b>: "
                  + request.getParameter("Electric") + "\n" +
               "</ul>\n" +
            "</body>" +
         "</html>"
      );

   }
}