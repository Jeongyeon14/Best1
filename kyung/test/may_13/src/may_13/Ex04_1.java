package may_13;

import java.util.Scanner;

public class Ex04_1 {
	//���� �ѱ�(korea)1 �ܱ�(ect)2 ������(male)3 ��(female)4

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//	
//		int KOREA = 1;
//		int ETC = 2;
//		int MALE = 3;
//		int FEMALE = 4;
//		
//
//	
//		System.out.println("����� ������(KOREA(1) / ETC(2)?");
//			int nat= sc.nextInt();
//		
//		
//		System.out.println("����� ������(MALE(3) / FEMALE(4)?");
//			int s = sc.nextInt();
//		
//		if(nat == 0) {
//					}
//		else { 
//			System.out.println("3");
//			System.out.println("4");
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int  KOR=1;
		final int  ETC=2;
		final int  MALE=3;
		final int  FEMALE=4;
	
		System.out.print("����� ������(KOREA(1) / ETC(2)? \n");
		int contry= sc.nextInt();
		
		System.out.print("����� ������(MALE(3) / FEMALE(4) \n?");
		int gender= sc.nextInt();
		
		if(contry == KOR)
			if(gender == MALE)
				System.out.println("����� �ѱ� �����Դϴ�.");
		
			else
				System.out.println("����� �ѱ� �����Դϴ�.");
		else
			if(gender == MALE)
				System.out.println("����� �ܱ� �����Դϴ�.");
			else
				System.out.println("����� �ܱ� ���� �Դϴ�.");
		
				
		
		
		
	}
			
			

		

}