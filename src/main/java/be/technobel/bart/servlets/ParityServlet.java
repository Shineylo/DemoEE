package be.technobel.bart.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/pair")
public class ParityServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            if ((Integer.parseInt(req.getParameter("number"))) % 2 == 0) {
                System.out.println("Je suis pair");
            } else {
                System.out.println("Je suis impair");
            }
        }catch(Exception e){
            resp.setStatus(400);
            resp.getWriter().print("<html><head><title>Oops an error happened!</title></head>");
            resp.getWriter().print("<body>UN NOMBRE DU CON</body>");
            resp.getWriter().println("</html>");
            }

    }
}
