package may_18;

import java.util.Scanner;
//사용자로부터 입력받은 두 수의 합과 차를 구하여 출력하여 보자. 두수의 차는 큰 수에서 작은수를 뺸것으로 한다.
//정수를 입력하시오 : 10
//정수를 입력하시오 : 20
//두수의 합 :  30
//두수의 차 :  10

public class Ex1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int x=10;
//		int y=20;
//		System.out.println("정수를 입력하시오:");
//		int num = sc.nextInt();
//		
//		
//		
//		if( x + y ) {
//			System.out.println("합계: 30 \n");
//			
//		}
//			
//		
//		
//		
//		
//		
//	}	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수1 입력:");
		int x = sc.nextInt();
		System.out.println("정수2 입력:");
		int y = sc.nextInt();
		
		System.out.printf("두 정수의 합 :d% \n", x+y);
		
		
		if(x>y)
			System.out.printf("두 수의 차 :%d \n");
		else
			System.out.printf("두 수의 차 :%d \n", y-x);
		
	}

}
