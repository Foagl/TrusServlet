import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends javax.servlet.http.HttpServlet {

protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
    response.setCharacterEncoding("UTF-8"); ///  киррилица

    String name = request.getParameter("firstName");
    String suName = request.getParameter("secondName");
    String job = request.getParameter("job");
    //String [] jobs = request.getParameterValues("job"); Если нам необходимо принять из поля несколько значений

    String gender = request.getParameter("gender");
    String remember = request.getParameter("remember");

    System.out.println(name = name  + " " + suName);

    response.setContentType("text/html");  /// Для того, что бы работала
    //response.setCharacterEncoding("UTF-8"); ///  киррилица
    PrintWriter out = response.getWriter();
    out.print("<title>Здравствуй," + name + "</title> ");
    out.print("<h1> Ваша введенная информация:, " + job + " " + gender + " </h1><br>!");
    out.print("<form method= \"get\" action=\"CalsSalary\"> ");
    out.print("<input type=\"submit\" value=\"Отправить\"> </form>");
    out.close();
    }
}
