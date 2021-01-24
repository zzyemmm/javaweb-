package day9;

import java.io.IOException;

@javax.servlet.annotation.WebServlet(name = "HellServlet")
public class HellServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //response.getWriter().append("Served at: ").append(request.getContextPath());

        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        request.getRequestDispatcher("test.html").forward(request,response);
    }
}
