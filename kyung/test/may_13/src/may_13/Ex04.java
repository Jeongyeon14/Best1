package may_13;

import java.util.Scanner;

public class Ex04 {
	
//	public static void main(String[] args) {
//		//�Է¹��� ���� ¦���̸� : ¦�� Ȧ���� Ȧ��
//		Scanner sc = new Scanner(System.in);
//		int x= sc.nextInt();
//		
//		
//		if(x%2 == 0)
//			System.out.println("¦��");
//		System.out.printf("�Է¹��� ���� %d�Դϴ�",x);
//	}
	
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
//		if(x%2 == 0)
//			System.out.println("¦��");
//		else
//			System.out.println("Ȧ��");
//		System.out.printf("�Է¹��� ���� %d�Դϴ�.",x);
//	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		int y= sc.nextInt();
		int result;
		
		
		if(y == 0) {
			System.out.println("�Է¿���");
			System.out.println("0�� �и� ��� �Ұ�");
		}else {
			result = x/y;
			System.out.printf("Result:%d \n", result);
		
		}
	
	
	
	}
}
