package may_20;

import java.util.Scanner;

public class dsdssdfdfs {
//	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	int x;
//	char z;
//	int n;
//	int i=1;
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
//}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x;
	
	
	int min=0;
	int max=0;

	for(int i=1; i<=10; i++) {
	System.out.printf("%d번째 숫자 입력 : \n",i);
	x=sc.nextInt();
	
	max = x>max? x:max;
	max = max>i?max:i;
	
	min = x<min? x:min;
	min = min<i? min:i;
	
	
		
}
	System.out.printf("최댓값%d\n",max);
	System.out.printf("최솟값%d\n",min);
	
}

}