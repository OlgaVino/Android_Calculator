package com.olgavino.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

public class CalculationBackend extends HttpServlet {

    public CalculationBackend(){
        super();
    }

    String sign;
    double number1, number2, result;
    String message = "";
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        sign = request.getParameter("sign");
        number1 = Double.parseDouble(request.getParameter("number1"));
        number2 = Double.parseDouble(request.getParameter("number2"));

        Calculate();
        PrintWriter out = response.getWriter();
        out.print(result);

    }

    public void Calculate(){
        switch(sign)
        {
            case "plus":
                result = number1 + number2;
                break;
            case "minus":
                result = number1 - number2;
                break;
            case "multiply":
                result = number1 * number2;
                break;
            case "divide":
                result = number1 / number2;
                break;
        }
    }

}