import java.io.IOException;
import java.io.PrintWriter;

@javax.servlet.annotation.WebServlet(name = "converterServlet", urlPatterns = "/convert")
public class converterServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        float rate = Float.parseFloat(request.getParameter("rate"));
        float usd = Float.parseFloat(request.getParameter("usd"));

        float vnd = rate * usd;

        PrintWriter pw = response.getWriter();
        pw.println("<html>");
        pw.println("<h1>Rate: " + rate+ "</h1>");
        pw.println("<h1>USD: " + usd+ "</h1>");
        pw.println("<h1>VND: " + vnd+ "</h1>");
        pw.println("</html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
