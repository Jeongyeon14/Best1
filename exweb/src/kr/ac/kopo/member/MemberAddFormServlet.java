package kr.ac.kopo.member;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//http://localhost:8000/exweb/member/addform.do
//를 입력하고 엔터키를 입력하면
//브라우저 화면에 회원 정보를 입력할 수 있는 입력 엘리먼트들이 출력 되도록


@WebServlet("/member/addform.do")
public class MemberAddFormServlet extends HttpServlet{

	
	{
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	String url= "jdbc:oracle:thin:scott/tiger@localhost:1521:xe"; 
	String user= "com"; 
	String password = "com01"; 
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html"); 
		resp.setCharacterEncoding("UTF-8"); 
		
		PrintWriter out = resp.getWriter();
		out.print("<!DOCTYPE html>                  ");
		out.print("<html>                           ");
		out.print("<head>                           ");
		out.print("<meta charset='UTF-8'>           ");
		out.print("<title>회원관리</title> ");
		out.print("</head>                          ");
		out.print("<body>                           ");
		out.print("	<h1>회원 추가</h1>       			");

		//ContextPath : 현재 웹애플리케이션(프로젝트)의 고유 경
		out.print("<form action=\"" + req.getContextPath() + "/member/add.do\" method=\"post\">    ");
		out.print("아이디 : <input type='text' name='memId' /> <br/>  ");
		out.print("비밀번호 : <input type='text' name='memPass'> <br/>   ");
		out.print("이름 : <input type='text' name='memName' /> <br/>    ");
		out.print("포인트 : <input type='text' name='memPoint'> <br/>    ");
		out.print("<input type= 'submit' value='저장' />         ");
		out.print("</from>                                         						     ");

		out.print("</body>                          ");
		out.print("</html>                          ");
	}

}
