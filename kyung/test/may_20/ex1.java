package may_20;

import java.util.Scanner;

public class ex1 {
//	public static void main(String[] args) {
//		int i=1;
//		
//		do {
//			
//			System.out.println("Hello~~");
//			i++;
//		}while(i<=5);
//		
//	}
	
	
//	public static void main(String[] args) {
//		int i=1;
//		int sum = 0;
//		
//		do {
//		sum += i;
//		i++;
//		}while(i<=10);
//		System.out.printf("전체 합: %d \n",sum);
//		
//	}
	
// 점수를 입력 받고 평균점수를 구하라. 더 이상 입력할 학생이 없으면 음수를 입력해 무한루프를 빠쪄 나와라.
//	public static void main(String[] args) {
//		int i = 0;
//		int cnt=0;
//		int sum=0;
//		int score;
//		double agv;
//		do {
//		System.out.printf("%d번 학색 점수 입력>>\n",cnt);
//		
//		if(score < 0)
//			break;
//		
//			sum += score; 
//			cnt++;
//		}while(ture);
//		
//		System.out.printlf("전체 평슌 점수 : %.2f \n");
//}

//	public static void main(String[] args) {
//		int i = 0;
//		int sum=0;
//		double agv;
//	Scanner sc = new Scanner(System.in);
//			
//
//	int menu;
//		do {
//			System.out.prinln("1. 파일열기");
//			System.out.prinln("2. 파일저장");
//			System.out.prinln("메뉴선택 >>");
//			int menu = sc.nextInt();
//			
//		}while(menu >=);
//		
//		
//	}
	
	
	// 특정 달을 입력을 받아서 몇일까지 있는지 값을 구하라. 
	// 입력을 받을떄 제대로된 값을 받지 않으면 "잘못 입력 하셨습니다." 
	// 로 출력 하고 다시 입력 받기
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int days;
	int month;
		do {
			System.out.println("달을 입력하세요>>");
			month = sc.nextInt();

			if(month < 1 || month > 12)
				System.out.println("잘못입력하셧습니다. 다시입력하세요(1~12월)");
			else break;
				}	while(true);
		
		switch(month) {
		case 2: days =28; break;
		case 4: case 6: case 9: case 11: days=30; break;
		default: days=31;
		}
				System.out.printf("%d월은 %d일 까지 있습니다.\n",month, days);
		
		
		
		
		
//			public static void main(String[] args) {
//				Scanner sc = new Scanner(System.in);
//				int month;
//				int days;
//				
//				do {
//					System.out.println("달을 입력하세요>>");
//					month = sc.nextInt();
//					
//					switch(month) {		
//					case 2 : days= 28; break;
//					
//					case 4: case 6: case 9: case 11: days= 30; break;
//					default:  days =31;
//					
//					}
//				}while(month > 12);
//				System.out.printf("%d월은 %d일 까지 있습니다.\n",month, days);
		
		
		
		
	}
	
}

