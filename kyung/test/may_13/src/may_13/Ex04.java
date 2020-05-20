package may_13;

import java.util.Scanner;

public class Ex04 {
	
//	public static void main(String[] args) {
//		//입력받은 수가 짝수이면 : 짝수 홀수면 홀수
//		Scanner sc = new Scanner(System.in);
//		int x= sc.nextInt();
//		
//		
//		if(x%2 == 0)
//			System.out.println("짝수");
//		System.out.printf("입력받은 수는 %d입니다",x);
//	}
	
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
//		if(x%2 == 0)
//			System.out.println("짝수");
//		else
//			System.out.println("홀수");
//		System.out.printf("입력받은 수는 %d입니다.",x);
//	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		int y= sc.nextInt();
		int result;
		
		
		if(y == 0) {
			System.out.println("입력오류");
			System.out.println("0은 분모 사용 불가");
		}else {
			result = x/y;
			System.out.printf("Result:%d \n", result);
		
		}
	
	
	
	}
}
