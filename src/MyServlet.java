import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends javax.servlet.http.HttpServlet {

protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
    response.setCharacterEncoding("UTF-8"); ///  киррилица
    String name = request.getParameter("firstName");
    String suName = request.getParameter("secondName");
    System.out.println(name = name  + " " + suName);

    response.setContentType("text/html");  /// Для того, что бы работала
    //response.setCharacterEncoding("UTF-8"); ///  киррилица
    PrintWriter out = response.getWriter();
    out.print("<h1> Darova pacan, " + name + " " + suName + " </h1><br>!");
    out.print("<form method= \"get\" action=\"CalsSalary\"> ");
    out.print("<input type=\"submit\" value=\"Отправить\"> </form>");
    out.close();
    }
}
