package may_20;

import java.util.Scanner;

public class ex1 {
//	public static void main(String[] args) {
//		int i=1;
//		
//		do {
//			
//			System.out.println("Hello~~");
//			i++;
//		}while(i<=5);
//		
//	}
	
	
//	public static void main(String[] args) {
//		int i=1;
//		int sum = 0;
//		
//		do {
//		sum += i;
//		i++;
//		}while(i<=10);
//		System.out.printf("��ü ��: %d \n",sum);
//		
//	}
	
// ������ �Է� �ް� ��������� ���϶�. �� �̻� �Է��� �л��� ������ ������ �Է��� ���ѷ����� ���� ���Ͷ�.
//	public static void main(String[] args) {
//		int i = 0;
//		int cnt=0;
//		int sum=0;
//		int score;
//		double agv;
//		do {
//		System.out.printf("%d�� �л� ���� �Է�>>\n",cnt);
//		
//		if(score < 0)
//			break;
//		
//			sum += score; 
//			cnt++;
//		}while(ture);
//		
//		System.out.printlf("��ü �� ���� : %.2f \n");
//}

//	public static void main(String[] args) {
//		int i = 0;
//		int sum=0;
//		double agv;
//	Scanner sc = new Scanner(System.in);
//			
//
//	int menu;
//		do {
//			System.out.prinln("1. ���Ͽ���");
//			System.out.prinln("2. ��������");
//			System.out.prinln("�޴����� >>");
//			int menu = sc.nextInt();
//			
//		}while(menu >=);
//		
//		
//	}
	
	
	// Ư�� ���� �Է��� �޾Ƽ� ���ϱ��� �ִ��� ���� ���϶�. 
	// �Է��� ������ ����ε� ���� ���� ������ "�߸� �Է� �ϼ̽��ϴ�." 
	// �� ��� �ϰ� �ٽ� �Է� �ޱ�
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int days;
	int month;
		do {
			System.out.println("���� �Է��ϼ���>>");
			month = sc.nextInt();

			if(month < 1 || month > 12)
				System.out.println("�߸��Է��ϼ˽��ϴ�. �ٽ��Է��ϼ���(1~12��)");
			else break;
				}	while(true);
		
		switch(month) {
		case 2: days =28; break;
		case 4: case 6: case 9: case 11: days=30; break;
		default: days=31;
		}
				System.out.printf("%d���� %d�� ���� �ֽ��ϴ�.\n",month, days);
		
		
		
		
		
//			public static void main(String[] args) {
//				Scanner sc = new Scanner(System.in);
//				int month;
//				int days;
//				
//				do {
//					System.out.println("���� �Է��ϼ���>>");
//					month = sc.nextInt();
//					
//					switch(month) {		
//					case 2 : days= 28; break;
//					
//					case 4: case 6: case 9: case 11: days= 30; break;
//					default:  days =31;
//					
//					}
//				}while(month > 12);
//				System.out.printf("%d���� %d�� ���� �ֽ��ϴ�.\n",month, days);
		
		
		
		
	}
	
}

