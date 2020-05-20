package may_20;

import java.util.Scanner;

//임의의 양의 정수를 반복 입력 받아 그 중에 전체 짝수의 개수를 출력하는 프로그램을 작성하시오.

//입력하시오.(나가기(음수입력)):10
//입력하시오.(나가기(음수입력)):11
//입력하시오.(나가기(음수입력)):14
//입력하시오.(나가기(음수입력)):12
//입력하시오.(나가기(음수입력)):1
//입력하시오.(나가기(음수입력)):12
//입력하시오.(나가기(음수입력)):20
//입력하시오.(나가기(음수입력)):26
//입력하시오.(나가기(음수입력)):-10

//개수 :6
public class ex4 {
//	public static void main(String[] args) {
//		Scanner	sc = new Scanner(System.in);
//		int i=0;
//		int x;
//		
//	
//		do {
//			System.out.println("입력하시오.(나가기(음수입력)): \n");
//			x =sc.nextInt();
//			
//			if(x < 0) {
//				break;
//			}
//
//			if(x%2 == 0)
//				i++;  // i= i +1
//			
//		} while(true);
//
//
//		System.out.printf("짝수의 갯수 : %d", i);
//		
//		
//	}
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		int n;
		int cnt=0;
		
		while(true) {
			System.out.println("양의 정수 입력(나가기(음수))>>");
			n=sc.nextInt();
			
			if(n <=0)
				break;
			if( n %2 ==0)
				cnt++;			
		}
		System.out.printf("전체 짝수의 개수 : %d \n", cnt);
		
		
}
}