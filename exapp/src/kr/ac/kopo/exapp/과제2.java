package kr.ac.kopo.exapp;
//"1.학생목록  2.학생추가  3.학생삭제  4.종료 라고 출력
//번호를 입력받는다.
//"1"을 입력한 경우, 데이터베이스에 존재하는 모든 학생 목록을 출력
//"2"를 입력한 경우, 학번, 이름, 성적을 입력받아서 student 테이블에 저장
//"3"을 입력한 경우, "삭제할 학생의 학번 입력:" 라고 출력하고,해당 학생을 테이블에서 삭제
//"4"를 입력한 경우, 프로그램을 종료
//위 작업을 무한 반복
//5.성적변경  메뉴 추가
//"5"을 입력한 경우, "성적을 변경할 학생의 학번 입력하세요"라고 출력하고, 학번을 입력 받는다.
//입력받은 학번의 학생의 학번, 이름, 성적을 출력한다.
//"변경할 성적을 입력하세요."라고 출력하고, 성적을 입력 받는ㄷ.ㅏ
//해당 학생의 성적을 입력한 성적으로 테이블에서 변경


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class 과제2 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url= "jdbc:oracle:thin:scott/tiger@localhost:1521:xe";  //데이터 베이스 주소
		String user= "com"; //데이터베이스 계정 아이디
		String password = "com01"; //데이터베이스 계정 비밀번호
		{


			boolean flag=true;
			while (flag) {
				System.out.println("1.학생목록  2.학생추가  3.학생삭제  4.종료 5.성적변경 ");
				String menu = sc.nextLine();
				switch (menu) {

				case "1":
				{	
					String sql = "SELECT stu_no, stu_name, stu_score FROM student";

					try(
							Connection conn = DriverManager.getConnection(url, user, password);
							PreparedStatement pstmt = conn.prepareStatement(sql);
							ResultSet rs = pstmt.executeQuery();  

							){

						while (rs.next()) { 


							String stuNo = rs.getString("stu_no");
							String stuName = rs.getString("stu_name");
							int stuScore = rs.getInt("stu_score");
							System.out.println(stuNo +" : "+ stuName +" : " + stuScore);
						}


					} catch (SQLException e) {
						e.printStackTrace();
					}
				}

				break;

				case "2":

					System.out.println("학번 :");
					String id = sc.nextLine();
					System.out.println("이름 :");
					String name = sc.nextLine();
					System.out.println("성적 :");
					int point = Integer.parseInt(sc.nextLine());
					{
						String sql = "INSERT INTO student (stu_no, stu_name, stu_score) VALUES (?,?,?)";
						try(					
								Connection conn = DriverManager.getConnection(url, user, password);
								PreparedStatement pstmt = conn.prepareStatement(sql);
								) {
							//주입할 값의 타입에 따라서PreparedStatement 객체의 set타입명() 메서드를 사용
							pstmt.setString(1, id); //pstmt에 들어있는 sql문의 1번째 ?에 id 값을 주입
							pstmt.setString(2, name); //pstmt에 들어있는 sql문의 2번째 ?에 pw 값을 주입
							pstmt.setInt(3, point); //pstmt에 들어있는 sql문의 4번째 ?에 point 값을 주입

							int num = pstmt.executeUpdate(); 
							System.out.println(num + "명의 학생 추가");


						} catch (SQLException e) {
							e.printStackTrace();
						}
					}



					break;



				case "3":
					System.out.println("삭제할 학생의 학번을 입력하세요");
					String delId=sc.nextLine();
					{
						String sql = "DELETE FROM student WHERE stu_no = ?";
						try(
								Connection conn = DriverManager.getConnection(url, user, password);
								PreparedStatement pstmt = conn.prepareStatement(sql);
								) {
							pstmt.setString(1, delId);
							int num = pstmt.executeUpdate(); 
							System.out.println(num + "명의 학생 삭제");			
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}


					break;		

				case "4":
					flag = false;
				default:
					break;
					
				case "5":
					System.out.println("성적을 변경할 학생의 학번을 입력하세요");
					String no =sc.nextLine();
				{	
					String sql = "SELECT stu_no, stu_name, stu_score FROM student WHERE stu_no = ?";

					try(
							Connection conn = DriverManager.getConnection(url, user, password);
							PreparedStatement pstmt = conn.prepareStatement(sql);

							){
						pstmt.setString(1, no);
					try (ResultSet rs = pstmt.executeQuery();){
						if (rs.next()) { 
							String stuNo = rs.getString("stu_no");
							String stuName = rs.getString("stu_name");
							int stuScore = rs.getInt("stu_score");
							System.out.println(stuNo +" : "+ stuName +" : "  + stuScore);
							
							System.out.println("변경할 성적을 입력하세요.");
							int score = Integer.parseInt(sc.nextLine());
							

							String sql2 = "UPDATE student SET stu_score=?  WHERE stu_no = ?";
							try(
									Connection conn2 = DriverManager.getConnection(url, user, password);
									PreparedStatement pstmt2 = conn2.prepareStatement(sql2);
									) {
								pstmt2.setInt(1, score);
								pstmt2.setString(2, stuNo);
								int num = pstmt2.executeUpdate(); 
								System.out.println(num + "명의 학생 변경");			
							} catch (SQLException e) {
								e.printStackTrace();
							}
							
						}
		        	} 
				} catch (SQLException e) {
						e.printStackTrace();
					}
				}

				break;

				}
			}



		}

	}

}
