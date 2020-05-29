//		1.웹브라우저 주소창에
//		http://localhost:8000/exweb/Hello.do?id=001&pw=1234
//		를 입력하고 요청을 보내면 로그인성공이 출력되고
//		id 파라미터 값이 "a001"이 아니면 " 존재하지 않는 ID입니다."라고 출력
//		id 파라미터 값이 "a001"이고 pw 파라미터 값이 "1234"가 아니면 "로그인실패"라고 출력되도록 서블릿을 작성
//		
//		2. 
//		로그인 성공 링크를 클릭하면, "로그인 성공"이 출력되고	</div>
//		로그인 실패 링크를 클릭하면, "로그인 실패"가 출력되도록 링크를 작성
//		
//		3.
//		아이ㅏ디와 비밀번호를 입력 받아서 POST 방식으로 전송하는 폼을 작성
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

@WebServlet("/login.do")
public class loginServlet extends HttpServlet{
	
	private ServletResponse resp;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
			String id = req.getParameter("id");
			String pw = req.getParameter("pw");
			
			resp.setContentType("text/html");
			resp.setCharacterEncoding("UTF-8");
			PrintWriter out = resp.getWriter();  
			
			
			out.println("<!DOCTYPE html>                  ");
			out.println("<html>                           ");
			out.println("<head>                           ");
			out.println("<meta charset='UTF-8'>           ");
			out.println("<title>Insert title here</title> ");
			out.println("</head>                          ");
			out.println("<body>						    	");
			
			//문자열 내용 비교는 equals 메서드를 사용
			if (id.equals("a001")) {
				if(pw.equals("1234")) {
					out.println("<h1>로그인 성공</h1>");
			}
				else {
					out.println("<h1>로그인 실패</h1>");
				}
			}
				else {
					out.println("<h1>로그인 실패</h1>");
					
				}
			
			out.println("</body>					   ");
			out.print("</html>                         ");	
			}
	}

