package kr.ac.kopo.exapp;

import java.util.Scanner;

public class eaxapp02 {
//	"ID를 입력하세요" 라고 출력하고, ID를 입력받고,
//	"비밀번호를 입력하세요" 라고 출력하고, 비밀번호를 입력받고,
//	입력한 ID가 "a001"이 아니면, "존재하지 않는 ID입니다" 라고 출력
//	입력한 ID가 "a001"이고 비밀번호가 "1234"이면, "로그인 성공"이라고 출력
//	입력한 ID가 "a001"이고 비밀번호가 "1234"가 아니면, "로그인 실패" 라고 출력
	
	public static void main(String[] orgs) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ID를 입력하세요");
		String id = sc.nextLine();
		
		//문자열 내용 비교는 equals 메서드를 사용
		if(id.equals("a001")) {//입력받은 ID값이 "a001"인 경우
			
			System.out.println("비밀번호를 입력하세요");
			String pw = sc.nextLine();
			
			if (pw.contentEquals("1234")) {//입력받은 pw 값이 "1234"인 경우
				System.out.println("로그인 성공");
			}else {
				System.out.println("로그인 실패");	
			}
			
		}else { //입력받은 id값이 "a001"가 아닌 경우
			System.out.println("존재하지 않는 ID입니다");
			
		}
		
	}
}


