package kr.ac.kopo.member;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member/add.do")
public class MemberAddServlet extends HttpServlet{

	{
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	String url= "jdbc:oracle:thin:scott/tiger@localhost:1521:xe";  //데이터 베이스 주소
	String user= "com"; //데이터베이스 계정 아이디
	String password = "com01"; //데이터베이스 계정 비밀번호

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html"); 
		req.setCharacterEncoding("UTF-8");
		String memId = req.getParameter("memId");
		String memPass = req.getParameter("memPass");
		String memName = req.getParameter("memName");
		int memPoint = Integer.parseInt(req.getParameter("memPoint"));


		String sql = "INSERT INTO MEMBER (mem_id, mem_pass, mem_name, mem_point) VALUES (?,?,?,?)";
		try(					
				Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				) {
			pstmt.setString(1, memId); //pstmt에 들어있는 sql문의 1번째 ?에 id 값을 주입
			pstmt.setString(2, memPass); //pstmt에 들어있는 sql문의 2번째 ?에 pw 값을 주입
			pstmt.setString(3, memName); //pstmt에 들어있는 sql문의 3번째 ?에 name 값을 주입
			pstmt.setInt(4, memPoint); //pstmt에 들어있는 sql문의 4번째 ?에 point 값을 주입

			int num = pstmt.executeUpdate(); 
			System.out.println(num + "명의 회원 추가");


		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
//		resp.sendRedirect("URL주소 또는 경로")
//		:지정된 주소 또는 경로로 이동하라는 명령을 담은 응답을 브라우저에게 전송
		resp.sendRedirect(req.getContextPath() + "/member/list.do");
		
		
		
		
//		resp.setContentType("text/html"); 
//		resp.setCharacterEncoding("UTF-8"); 
//		
//		PrintWriter out = resp.getWriter();
//		out.print("<!DOCTYPE html>                  ");
//		out.print("<html>                           ");
//		out.print("<head>                           ");
//		out.print("<meta charset='UTF-8'>           ");
//		out.print("<title>회원관리</title> ");
//		out.print("</head>                          ");
//		out.print("<body>                           ");
//		out.print("	<a href='" + req.getContextPath() + "/member/list.do'>회원 목록으로 이동</a>       			");
//		out.print("</body>                          ");
//		out.print("</html>                          ");
		
		
		
		
		
		
		
		
		
		
	
		
		

	}
	
}
