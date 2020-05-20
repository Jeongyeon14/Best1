package may_13;

import java.util.Scanner;

public class Ex03_2 {
	public static void main(String[] args) {
		//사용자로부터 물리, 역사, 철학 점수를 입력받아 세 점수가 70점 이상이면
		//'통과', 그렇지 않으면 '다음기회에' 라는 문자열이 출력되는 프로그램을 작성
		//(단, 조건연산자를 이용하여 구한다.)
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수를입력하세요. :");
//
//		String a= "물리";
//		String b= "역사";
//		String c= "철학";
//		
//			
//		int x,y,z;
//		x = sc.nextInt();
//		y = sc.nextInt();
//		z = sc.nextInt();
//		
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.println("물리과목 점수 입력>>");
		int phy = sc.nextInt();
		System.out.println("역사과목 점수 입력>>");
		int his = sc.nextInt();
		System.out.println("철학과목 점수 입력>>");
		int pil = sc.nextInt();
		
		//boolean bool = (phy>=70 && his >=70 && pil>=70);
		//System.out.println(bool? "통과":"다음기회에");
		
		System.out.println(phy>=70 && his >=70 && pil>=70? "통과":"다음기회에");
		
		
		
		
	}
}
