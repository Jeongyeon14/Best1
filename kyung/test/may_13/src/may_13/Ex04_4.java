package may_13;

import java.util.Scanner;
public class Ex04_4 {
	
	//A��� 100~90 B��� 89~80 C��� 79~70 D��� 69~60 F��� 59~0
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���� �Է�");
//		int score = sc.nextInt();
//		
//		if(score>=90) {
//			System.out.println("������ 100~90���Դϴ�.");
//			System.out.println("����� A");
//		
//		}else if(score>=80) {
//			System.out.println("������ 80~89�� �Դϴ�.");
//			System.out.println("B");
//		}else if(score>=70) {
//			System.out.println("������ 70~79�� �Դϴ�.");
//			System.out.println("C");
//		}else if(score>=60) {
//			System.out.println("������ 60~69���Դϴ�.");
//			System.out.println("D");
//		}else {
//			System.out.println("������ 60�� �̸��Դϴ�.");
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

		System.out.printf("����� ������ %c�Դϴ�.",grd);
		}


}
