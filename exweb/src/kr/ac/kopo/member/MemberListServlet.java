//회원목록 화면에 '회원 추가' 링크를 추가하고, 
//링크를 클릭하면 	http://localhost:8000/exweb/member/addform.do 로 이동
// 		
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


@WebServlet("/member/list.do")
public class MemberListServlet extends HttpServlet{
	
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
		
		
		
		resp.setContentType("text/html"); //응답내용이 text/html 임을 알리도록 설정  
		resp.setCharacterEncoding("UTF-8"); //응답내용의 문자 인코딩 설정
		
		PrintWriter out = resp.getWriter();
		out.print("<!DOCTYPE html>                  ");
		out.print("<html>                           ");
		out.print("<head>                           ");
		out.print("<meta charset='UTF-8'>           ");
		out.print("<title>회원관리</title> ");
		out.print("</head>                          ");
		out.print("<body>                           ");
		out.print("	<h1>회원 목록</h1>       			");
		
		out.print("<a href='"+ req.getContextPath() + "/member/addform.do'> <button>회원추가</button></a><br>");
		
		
		{	
			String sql = "SELECT mem_id, mem_pass, mem_name, mem_point FROM member";

			try(
					Connection conn = DriverManager.getConnection(url, user, password);
					PreparedStatement pstmt = conn.prepareStatement(sql);
					ResultSet rs = pstmt.executeQuery();  
				
			   ){

				while (rs.next()) { 

					
					String memId = rs.getString("mem_id");
					String mempass = rs.getString("mem_pass");
					String memName = rs.getString("mem_name");
					int memPoint = rs.getInt("mem_point");
					out.println(memId +" : "+ mempass +" : "+ memName +" : "+ memPoint );
					out.println("<a href='"+ req.getContextPath() + "/member/editform.do?memId=" + memId +"'><button>변경</button></a>");
					out.println("<a href='"+ req.getContextPath() + "/member/del.do?memId=" + memId +"'><button>삭제</button></a><br>");
				}
				
				
			} catch (SQLException e) {
				e.printStackTrace();
		}
		
		
		
		out.print("</body>                          ");
		out.print("</html>                          ");
		
	}

}
}
