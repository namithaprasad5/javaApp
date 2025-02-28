package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class SumServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
        int sum = 0;

        if (num1 != null && num2 != null) {
            try {
                sum = Integer.parseInt(num1) + Integer.parseInt(num2);
            } catch (NumberFormatException e) {
                sum = 0;
            }
        }

        request.setAttribute("sum", sum);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/result.jsp");
        dispatcher.forward(request, response);
    }
}
