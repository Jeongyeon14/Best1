package may_13;

import java.util.Scanner;

public class Ex02 {
//	public static void main(String[] args) {
		//4나누어 떨어지고 100으로 나누면 안떨어짐  혹은 400으로 떨어지는 연도
		//입력받는 연도가 윤년은 true  아니면 false

//		Scanner scan = new Scanner(System.in);
//		int year = scan.nextInt();
//		
//		boolean bool;
//		int x = 4;
//		int y = 100;
//		int z = 400;
//		
//		bool= year%x == 0 && year%y != 0 ||year%z ==0;
//		System.out.println("윤년"+bool);
//		
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("연도입력>>");
		int year = scan.nextInt();
		
		boolean bool =(year%4 == 0) && (year%100 == 0) || (year%400 ==0);
		System.out.println("윤년"+bool);
	}
	
//}	
	
}

