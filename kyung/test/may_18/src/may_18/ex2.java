package may_18;

import java.util.Scanner;

public class ex2 {
//근로소득세를 계산하는 프로그램 작성
// 과세표준  세율
//1000만원 이하  8%
//1000만원 초과 4000만원 이하  17%
//4000만원 초과 8000만원 이하  26%
//8000만원 초과  35%
//사용자가 자신으 과세 표준 금액을 입력하면 근로 소득세를 계싼하여 주는 프로그램을 작성하라
	// 과세표준 1600 소득세는 272만원
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("과세표준을 입력하세요 :");
//		
//		int x= sc.nextInt();
//		
//		if(x <= 1000) {
//			System.out.println("소득세 : %f \n");
//		} else if(x > 1000 && x <= 4000) {
//			System.out.println("소득세 : %f \n");
//		} else if(x > 4000 && x <=8000) {
//			System.out.println("소득세 : %f \n");
//		} else if(x > 8000)
//			System.out.println("소득세 : %f \n");
//		
//	}	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과세표준: ");
		int income = sc.nextInt();
		double tax;
		
		if(income <=1000)
			tax =income * 0.08;
		else if(income <=4000)
			tax =income * 0.17;
		else if(income <=8000)
			tax =income * 0.26;
		else
			tax =income * 0.35;
		
		System.out.printf("소득세:%.0f%", tax);
		
		 
		 
	}
	
	
}
