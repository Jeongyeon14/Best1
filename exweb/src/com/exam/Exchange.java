package com.exam;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Exchange.do")
public class Exchange extends HttpServlet{
	
	private ServletResponse resp;
	@Override
	protected void service (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String money = req.getParameter("dollar");
		//숫자 문자열을 숫자로 변환
		//Integer.parseInt("123") == 123
		//Float.parseIntFloat("123.45") == 123.45
		//Double.parseIntDouble("123.45") == 123.45
		
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out =resp.getWriter();
		
		
		out.println("<!DOCTYPE html>                  ");
		out.println("<html>                           ");
		out.println("<head>                           ");
		out.println("<meta charset='UTF-8'>           ");
		out.println("<title>Insert title here</title> ");
		out.println("</head>                          ");
		out.println("<body>						    	");
		double num = Double.parseDouble(money);   //실수로 변환
		double result = num * 1216.90;  
		out.println(money + "달러 =" + result + "원<br>");
		out.println("현찰 사실 때" + (num * 1238.19) + "원<br>");
		out.println( "현찰 파실 때" + (num * 1195.61) + "원 <br>");
		out.println("송금 보내실 때" + (num * 1228.80) + "원<br>");
		out.println("송금 받으실 때 " + (num * 1205.00) + "원 <br>");
                                                                  
		System.out.printf("%.2f", result);
	
		out.println("</body>					   ");
		out.print("</html>                         ");

		
		
		
}

}

	


	

	

