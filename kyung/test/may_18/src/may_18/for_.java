package may_18;

import java.util.Scanner;

public class for_ {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
//		for(int i=1; i<=5 ; i++)
//		 System.out.println("Hello~");
		
		
//	for(int i=1; i<=5; i++) {
//		System.out.printf("%d x %d = %d \n", 5, i, 5*i);
//		
//		}
		
		
//	int sum=0;
//	System.out.println("최종경계값>>");
//	int n = sc.nextInt();
//	
//	for(int i=1; i<=n; i++)
//		sum += i;
//	System.out.printf("전체합:%d \n",sum);
		
//		while (true) {
//		for(int i=1; i<=5; i++) {
//			System.out.printf("%d x %d = %d \n", 5, i, 5*i);
//			
//			}
		

		for(;;) {
			System.out.println("원하는 단>>");
			int n= sc.nextInt();
			
			if(n <0) {
				System.out.println("종료합니다.");
				break;
			}
			for(int i=1; i<=9; i++) {
				System.out.printf("%d x %d = %d \n", n, i, n*i);
				
			System.out.println();
		
	}
		}}}
