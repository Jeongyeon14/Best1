package com.exam;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cal.do")
public class cal extends HttpServlet{
		private ServletResponse resp;
//http://localhost:8000/exweb/cal.do?x=6&y=2&op=plu		
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
			
			
			
			String n1 =req.getParameter("x");
			String n2 =req.getParameter("y");
			String op =req.getParameter("op");

			
			double num1 = Double.parseDouble(n1);
			double num2 = Double.parseDouble(n2);
			
			double result = 0;
			String op0ut= "";
			
			
			switch (op) {
			case "plu":
				result = num1 + num2;
				op0ut ="+";
				break;
			case "min":
				result = num1 - num2;
				op0ut ="-";
				break;
			case "mul":
				result = num1 * num2;
				op0ut ="*";
				break;
			case "div":
				result = num1 / num2;
				op0ut ="/";
				break;
			default:
				break;
			
			}
			PrintWriter out =resp.getWriter();
			out.println( n1 + op0ut + n2 + " = " + result);
		}
	}

	

