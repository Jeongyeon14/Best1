package kr.ac.kopo.exapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Exdbcinnn {
	//클래스를 실행 하면,
	//회원 아이디, 비밀번호, 이름, 포인트를 입력받아서 .
	//데이터 베이스의 member 테이블에 저장하고,
	//전체목록을 조회하여 출력하는 프로그램을 작성하세요.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 :");
		String id = sc.nextLine();
		System.out.println("비밀번호 :");
		String pw = sc.nextLine();
		System.out.println("이름 :");
		String name = sc.nextLine();
		System.out.println("포인트 :");
		int point = Integer.parseInt(sc.nextLine());
		
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url= "jdbc:oracle:thin:scott/tiger@localhost:1521:xe";  //데이터 베이스 주소
		String user= "com"; //데이터베이스 계정 아이디
		String password = "com01"; //데이터베이스 계정 비밀번호
		
		{	//sql문에서 변화하는 값은?로 표시
			String sql = "INSERT INTO MEMBER (mem_id, mem_pass, mem_name, mem_point) VALUES (?,?,?,?)";
			//'" + id + "', '" + pw + "', '" + name + "', '" + point + "'
			try(					
				Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt = conn.prepareStatement(sql);
			) {
				//주입할 값의 타입에 따라서PreparedStatement 객체의 set타입명() 메서드를 사용
				pstmt.setString(1, id); //pstmt에 들어있는 sql문의 1번째 ?에 id 값을 주입
				pstmt.setString(2, pw); //pstmt에 들어있는 sql문의 2번째 ?에 pw 값을 주입
				pstmt.setString(3, name); //pstmt에 들어있는 sql문의 3번째 ?에 name 값을 주입
				pstmt.setInt(4, point); //pstmt에 들어있는 sql문의 4번째 ?에 point 값을 주입
				
				int num = pstmt.executeUpdate(); 
				System.out.println(num + "개의 레코드 추가");
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			}
		
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
				System.out.println(memId +" : "+ mempass +" : "+ memName +" : "+ memPoint);
			}
				
			
		} catch (SQLException e) {
			e.printStackTrace();
	}
	}
		
	}

