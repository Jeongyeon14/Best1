package may_18;

import java.util.Scanner;
//����ڷκ��� �Է¹��� �� ���� �հ� ���� ���Ͽ� ����Ͽ� ����. �μ��� ���� ū ������ �������� �A������ �Ѵ�.
//������ �Է��Ͻÿ� : 10
//������ �Է��Ͻÿ� : 20
//�μ��� �� :  30
//�μ��� �� :  10

public class Ex1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int x=10;
//		int y=20;
//		System.out.println("������ �Է��Ͻÿ�:");
//		int num = sc.nextInt();
//		
//		
//		
//		if( x + y ) {
//			System.out.println("�հ�: 30 \n");
//			
//		}
//			
//		
//		
//		
//		
//		
//	}	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����1 �Է�:");
		int x = sc.nextInt();
		System.out.println("����2 �Է�:");
		int y = sc.nextInt();
		
		System.out.printf("�� ������ �� :d% \n", x+y);
		
		
		if(x>y)
			System.out.printf("�� ���� �� :%d \n");
		else
			System.out.printf("�� ���� �� :%d \n", y-x);
		
	}

}
