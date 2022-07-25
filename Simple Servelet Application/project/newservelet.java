package com.example.demo2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "newservelet",value = "/newservelet")
public class newservelet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String name = "Check";
        PrintWriter out = resp.getWriter();
       out.println(name);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String un = "User";
        String pw = "User@123";

        String uname = req.getParameter("uname");
        String password = req.getParameter("password");
        PrintWriter out = resp.getWriter();

        if (un.equals(uname) && pw.equals(password)){
            out.println("Successfully logged in");
        }else{
            out.println("Logging failed");
        }
    }
}
