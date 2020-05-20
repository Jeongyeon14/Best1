package may_20;
//10개의 정수를 입력 받아 최댓값과 최솟값을 구하시오
//입력 1:90
//입력 2:30
//입력 3:-10
//입력 4:90
//입력 5:70
//입력 6:36
//입력 7:2
//입력 8:350
//입력 9:5
//입력 10:100

import java.util.Scanner;

//최소값: -10
//최값대:350
public class ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,min,max;
		
		System.out.printf("%d번 입력:",1);
		min = max = x = sc.nextInt();
		
		for(int i=2; i <=10; i++) {
			System.out.printf("%d번 입력:",i);
			x=sc.nextInt();
			if(max <x)
				max =x;
			if(min >x)
				min = x;
		}
		System.out.printf("최댓값:%d, 최솟값:%d", max ,min);
		
		
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int x;
//		
//		
//		int min=0;
//		int max=0;
//
//		for(int i=1; i<=10; i++) {
//		System.out.printf("%d번째 숫자 입력 : \n",i);
//		x=sc.nextInt();
//		
//		max = x>max? x:max;
//		max = max>i?max:i;
//		
//		min = x<min? x:min;
//		min = min<i? min:i;
//		
//		
//			
//	}
//		System.out.printf("최댓값%d\n",max);
//		System.out.printf("최솟값%d\n",min);
//		
//}
}
}
