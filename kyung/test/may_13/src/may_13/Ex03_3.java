package may_13;

import java.util.Scanner;

public class Ex03_3 {
//세자리로 이루어진 십진수 양의 정수 값을 입력 받은 후에
//각각의 자릿수를 분리하고 이 자릿수를 출력하는 프로그램을 작성하시오
//정수를 입력하시오 :378
//백의자리 :3
//십의자리 :7
//일의자리:8

	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.printf("정수를 입력하시오 :");
//		
//		int Int= 378;
//		
//		int A= 'a';
//		int B= 'b';
//		int C= 'c';
//		
//		System.out.printf("%d \n", Int);
//		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.printf("정수를 입력하시오 :");
			int phy= sc.nextInt();
			
			System.out.printf("백일의 자리수:%d \n", phy/100);
			System.out.printf("십일의 자리수:%d \n", phy%100/10);
			System.out.printf("일의 자리수:%d \n", phy%10);
		}

}
