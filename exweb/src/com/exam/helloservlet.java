package com.exam;

import java.awt.print.Printable;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//웹애플리케이션 서버를 통해서 실행되는 클래스는 Servlet 규칙을 따라서 만들어야 한다.
//일반적으로 HttpServelt 클래스를 상솟하여 작성

@WebServlet("/Hello.do") //"/hello.do"주소로 요청이 오면 이 서블릿을 실행
public class helloservlet extends HttpServlet {
	
	
	//이 서블릿클래스를 실행시키는 요청이 올 때마다 한 번씩 실행되는 메서드
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Hello Servlet");
		
		//post방식으로 전송된 파라미터 값의 인코딩 설정
		req.setCharacterEncoding("UTF-8");
		
		
		//"a"이라는 이름의 파라미터 값을 가져와서 변수 n에 저장
		String n = req.getParameter("a");
		String n2 = req.getParameter("b");
		
		//요청으로 보낸 웹브라우저에게 출력하기 위해서는
		//인자로 받은 응답객체에 출력해야 한다.
		resp.setContentType("text/html"); //응답내용이 text/html 임을 알리도록 설정  
		resp.setCharacterEncoding("UTF-8"); //응답내용의 문자 인코딩 설정
		
		PrintWriter out = resp.getWriter(); //응답객체에 출력할 수 있는 스트림(파이프) 가져오기
		//out.println("Hello Servlet!!!");
		out.print("<!DOCTYPE html>                  ");
		out.print("<html>                           ");
		out.print("<head>                           ");
		out.print("<meta charset='UTF-8'>           ");
		out.print("<title>Insert title here</title> ");
		out.print("</head>                          ");
		out.print("<body>                           ");
		out.print("	<h1>Hello,"+ n + "</h1>         ");
		out.print("	<h1>안녕," + n2 +"</h1>              ");
		out.print("</body>                          ");
		out.print("</html>                          ");
	}
}
