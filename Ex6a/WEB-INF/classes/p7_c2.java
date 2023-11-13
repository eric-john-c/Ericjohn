/* TO RECEIVE COOKIES THAT IS ALREADY SET*/
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class p7_c2 extends HttpServlet {
   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
   {
     try{
        response.setContentType("text/html");
        PrintWriter pwriter = response.getWriter();
        Cookie[] ck=request.getCookies();
        int len=ck.length;
        String value;      
        pwriter.println("<h3>Hello - </h3>");
        for(int i=0;i<len;i++)
        {
            value=ck[i].getValue();
            pwriter.println(value);
        }
        pwriter.print("<h2>Car Brands</h3>");
        pwriter.print("<h4>Mercedes-Benz</h4>");
        pwriter.print("<h4>BMW</h4>");
        pwriter.print("<h4>Audi</h4>");
        pwriter.print("<h4>Lamborghini</h4>");
        pwriter.print("<h4>Porsche</h4>");
        pwriter.close();
    }
     catch(Exception exp){
       System.out.println(exp);
     }
  }
}