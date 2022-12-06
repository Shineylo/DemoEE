package be.technobel.bart.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Hello World!</h1>");

        out.println("</body>");
        out.println("</html>");

        resp.setStatus(200);

        resp.setHeader("content-type","text/html");
    }
}
