package may_20;
//사용자가 입력한 모든 정수 값들에 대하여 1부터 그 정수까지의 누적 승을 출력하는 프로그램을 작성하시오.
//임의의 정수를 입력하시오 : 5
//==================
// n    1부터 n까지의 곱
//==================
// 1          1  
// 2          2  
// 3          6  
// 4          24  
// 5          120  
//계속 하시겠습니까? (y/n) y

import java.util.Scanner;

//임의의 정수를 입력하시오 : 6
//==================
// n    1부터 n까지의 곱
//==================
// 1          1  
// 2          2  
// 3          6  
// 4          24  
// 5          120  
// 6          720  
//계속 하시겠습니까? (y/n) n


public class ex5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int sum;


	while(true) {
		sum= 0;
		System.out.println("임의의 정수를 입력하시오 : \n");
		int n= sc.nextInt();
		
		for(int i=1; i <= n; i++ ) {
			sum += i;
			
			System.out.printf("누적합 결과: %d\n",sum);
			sc.NextInt();
			char ans= sc.nextLine();
			
		}
		System.out.println("계속 하시겠습니까? (y/n)>>");
		


}
}
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	int x;
//	int n;
//	int i=1;
//	char z;
//	
//	while(true) {
//		x= 1;
//		System.out.println("임의의 정수를 입력하시오 : \n");
//		n= sc.nextInt();
//		
//		System.out.println("=========================== \n");
//		System.out.println("n	1부터 n까지의 곱 \n");
//		System.out.println("=========================== \n");
//		
//		for(i=1; i <= n; i++ ) 
//			
//			System.out.printf("%d  \t %d\n",i,x = x*i);
//		System.out.println("계속 하시겠습니까? (y/n)>>");
//				sc.nextLine();	
//				z = sc.nextLine().charAt(0);
//				
//			if(z =='n') {
//			System.out.println("종료합니다.\n");
//					break;
//		}
//		
//		
//		
//	
//}


}
