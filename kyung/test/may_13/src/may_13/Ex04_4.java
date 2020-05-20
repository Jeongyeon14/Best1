package may_13;

import java.util.Scanner;
public class Ex04_4 {
	
	//A등급 100~90 B등급 89~80 C등급 79~70 D등급 69~60 F등급 59~0
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("점수 입력");
//		int score = sc.nextInt();
//		
//		if(score>=90) {
//			System.out.println("점수가 100~90점입니다.");
//			System.out.println("등급은 A");
//		
//		}else if(score>=80) {
//			System.out.println("점수가 80~89점 입니다.");
//			System.out.println("B");
//		}else if(score>=70) {
//			System.out.println("점수가 70~79점 입니다.");
//			System.out.println("C");
//		}else if(score>=60) {
//			System.out.println("점수가 60~69점입니다.");
//			System.out.println("D");
//		}else {
//			System.out.println("점수가 60점 미만입니다.");
//			System.out.println("F");
//		}
//		
//		
//	}		
//		
//	}
	
	public static void main(String[] args) {
		
	
		Scanner sc= new Scanner(System.in);
	
		int score = sc.nextInt();
		char grd;

		if(score >= 90)
		 grd ='A';
		else if(score >=80)
		 grd ='B';
		else if(score >=70)
		 grd ='C';
		else if(score >=60 && score < 70)
		 grd ='D';
		else
		grd='F';

		System.out.printf("당신의 학점은 %c입니다.",grd);
		}


}
