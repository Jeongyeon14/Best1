package kr.ac.kopo.member;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member/edit.do")
public class MemberEditServlet extends HttpServlet{
	
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
		String memId = req.getParameter("memId");  //파라미터 값 꺼내옴
//		String memPass = req.getParameter("memPass");
		String memName = req.getParameter("memName");
		int memPoint = Integer.parseInt(req.getParameter("memPoint"));


		String sql = "UPDATE MEMBER SET mem_name=?, mem_point=? WHERE mem_id=?";
		try(					
				Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				) {
			pstmt.setString(3, memId); //pstmt에 들어있는 sql문의 1번째 ?에 id 값을 주입
			pstmt.setString(1, memName); //pstmt에 들어있는 sql문의 3번째 ?에 name 값을 주입
			pstmt.setInt(2, memPoint); //pstmt에 들어있는 sql문의 4번째 ?에 point 값을 주입
		
			int num = pstmt.executeUpdate(); 
			System.out.println(num + "명의 회원 변경");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		resp.sendRedirect(req.getContextPath() + "/member/list.do");
		
		
	
	}

	
	
}
