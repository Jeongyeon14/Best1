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
//	System.out.println("������谪>>");
//	int n = sc.nextInt();
//	
//	for(int i=1; i<=n; i++)
//		sum += i;
//	System.out.printf("��ü��:%d \n",sum);
		
//		while (true) {
//		for(int i=1; i<=5; i++) {
//			System.out.printf("%d x %d = %d \n", 5, i, 5*i);
//			
//			}
		

		for(;;) {
			System.out.println("���ϴ� ��>>");
			int n= sc.nextInt();
			
			if(n <0) {
				System.out.println("�����մϴ�.");
				break;
			}
			for(int i=1; i<=9; i++) {
				System.out.printf("%d x %d = %d \n", n, i, n*i);
				
			System.out.println();
		
	}
		}}}
