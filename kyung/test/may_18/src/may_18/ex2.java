package may_18;

import java.util.Scanner;

public class ex2 {
//�ٷμҵ漼�� ����ϴ� ���α׷� �ۼ�
// ����ǥ��  ����
//1000���� ����  8%
//1000���� �ʰ� 4000���� ����  17%
//4000���� �ʰ� 8000���� ����  26%
//8000���� �ʰ�  35%
//����ڰ� �ڽ��� ���� ǥ�� �ݾ��� �Է��ϸ� �ٷ� �ҵ漼�� ����Ͽ� �ִ� ���α׷��� �ۼ��϶�
	// ����ǥ�� 1600 �ҵ漼�� 272����
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("����ǥ���� �Է��ϼ��� :");
//		
//		int x= sc.nextInt();
//		
//		if(x <= 1000) {
//			System.out.println("�ҵ漼 : %f \n");
//		} else if(x > 1000 && x <= 4000) {
//			System.out.println("�ҵ漼 : %f \n");
//		} else if(x > 4000 && x <=8000) {
//			System.out.println("�ҵ漼 : %f \n");
//		} else if(x > 8000)
//			System.out.println("�ҵ漼 : %f \n");
//		
//	}	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����ǥ��: ");
		int income = sc.nextInt();
		double tax;
		
		if(income <=1000)
			tax =income * 0.08;
		else if(income <=4000)
			tax =income * 0.17;
		else if(income <=8000)
			tax =income * 0.26;
		else
			tax =income * 0.35;
		
		System.out.printf("�ҵ漼:%.0f%", tax);
		
		 
		 
	}
	
	
}
