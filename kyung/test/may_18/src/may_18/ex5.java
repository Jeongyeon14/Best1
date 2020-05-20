package may_18;

import java.util.Scanner;

public class ex5 {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("월을 입력하세요 >>");
//		int month =sc.nextInt();
//		int days;
//		
//		switch(month) {
//		case 2 : days = 28; break;
//		case 4: case 6: case 9: case 11: days= 30; break;
//		default:  days =31;
//		}
//		
//		System.out.printf( "입력한 %d달은 %d일까지 있습니다.\n", month, days);
//	
//	}
	
	//4로 나누어 떨어지고, 100으로 나누어 떨어지지 않고 혹은 400으로 나누어 떨어지는 연도
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("ㅇ연도를 입력하세요 >>");
		int year =sc.nextInt();
		System.out.println("월을 입력하세요 >>");
		int month =sc.nextInt();
		int days;
		
		switch(month) {		
		case 2 : days = (year%4 ==0 && year%100 ==0 || year%400 ==0? 29:28);break;
		case 4: case 6: case 9: case 11: days= 30; break;
		default:  days =31;
		}		
		System.out.printf( "입력한 %d년은 %d월은 %d일까지 있습니다.\n", year, month, days);
		
		
//		public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);
//			
//			
//			System.out.println("ㅇ연도를 입력하세요 >>");
//			
//			int year =sc.nextInt();
//			int month =sc.nextInt();
//			int days;
//			
//			boolean bool =(year%4 == 0) && (year%100 == 0) || (year%400 ==0);
//			
//			System.out.println("월을 입력하세요 >>");
//			
//			switch(month) {
//			
//			case 2 : days =28;
//			if(bool ) {
//				days=29;
//			}
//			break;
//			
//			
//			case 4: case 6: case 9: case 11: days= 30; break;
//			default:  days =31;
//			}
//			
//			System.out.printf( "입력한 %d년은 %d월은 %d일까지 있습니다.\n", year, month, days);
		
	}
	
}
