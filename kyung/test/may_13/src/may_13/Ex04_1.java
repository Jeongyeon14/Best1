package may_13;

import java.util.Scanner;

public class Ex04_1 {
	//국적 한국(korea)1 외국(ect)2 성별남(male)3 여(female)4

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
//		System.out.println("당신의 국적은(KOREA(1) / ETC(2)?");
//			int nat= sc.nextInt();
//		
//		
//		System.out.println("당신의 성별은(MALE(3) / FEMALE(4)?");
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
	
		System.out.print("당신의 국적은(KOREA(1) / ETC(2)? \n");
		int contry= sc.nextInt();
		
		System.out.print("당신의 성별은(MALE(3) / FEMALE(4) \n?");
		int gender= sc.nextInt();
		
		if(contry == KOR)
			if(gender == MALE)
				System.out.println("당신은 한국 남성입니다.");
		
			else
				System.out.println("당신은 한국 여성입니다.");
		else
			if(gender == MALE)
				System.out.println("당신은 외국 남성입니다.");
			else
				System.out.println("당신은 외국 여성 입니다.");
		
				
		
		
		
	}
			
			

		

}