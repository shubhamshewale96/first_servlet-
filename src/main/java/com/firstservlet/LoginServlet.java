package com.firstservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        description="Login Servlet testing",
        urlPatterns={"/LoginServlet"},
        initParams = {
                @WebInitParam(name = "user",value = "shubham"),
                @WebInitParam(name = "pass",value = "shewale")
                }
        ) /*(name = "LoginServlet", value = "/LoginServlet")*/

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String user= request.getParameter("user");
    String pass= request.getParameter("pass");

    String userId = getServletConfig().getInitParameter("user");
    String password= getServletConfig().getInitParameter("pass");
    if (userId.equals(user) && password.equals(pass)){
        request.setAttribute("user",user);
        request.getRequestDispatcher("LoginSuccess.jsp").forward(request,response);
    }else {
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/login..html");
        PrintWriter out = response.getWriter();
        out.println("<font color=red>enter user id and password wrong.</font>");
        rd.include(request,response);
    }
    }
}
