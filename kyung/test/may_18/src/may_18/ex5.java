package may_18;

import java.util.Scanner;

public class ex5 {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���� �Է��ϼ��� >>");
//		int month =sc.nextInt();
//		int days;
//		
//		switch(month) {
//		case 2 : days = 28; break;
//		case 4: case 6: case 9: case 11: days= 30; break;
//		default:  days =31;
//		}
//		
//		System.out.printf( "�Է��� %d���� %d�ϱ��� �ֽ��ϴ�.\n", month, days);
//	
//	}
	
	//4�� ������ ��������, 100���� ������ �������� �ʰ� Ȥ�� 400���� ������ �������� ����
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("�������� �Է��ϼ��� >>");
		int year =sc.nextInt();
		System.out.println("���� �Է��ϼ��� >>");
		int month =sc.nextInt();
		int days;
		
		switch(month) {		
		case 2 : days = (year%4 ==0 && year%100 ==0 || year%400 ==0? 29:28);break;
		case 4: case 6: case 9: case 11: days= 30; break;
		default:  days =31;
		}		
		System.out.printf( "�Է��� %d���� %d���� %d�ϱ��� �ֽ��ϴ�.\n", year, month, days);
		
		
//		public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);
//			
//			
//			System.out.println("�������� �Է��ϼ��� >>");
//			
//			int year =sc.nextInt();
//			int month =sc.nextInt();
//			int days;
//			
//			boolean bool =(year%4 == 0) && (year%100 == 0) || (year%400 ==0);
//			
//			System.out.println("���� �Է��ϼ��� >>");
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
//			System.out.printf( "�Է��� %d���� %d���� %d�ϱ��� �ֽ��ϴ�.\n", year, month, days);
		
	}
	
}
