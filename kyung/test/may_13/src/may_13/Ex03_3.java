package may_13;

import java.util.Scanner;

public class Ex03_3 {
//���ڸ��� �̷���� ������ ���� ���� ���� �Է� ���� �Ŀ�
//������ �ڸ����� �и��ϰ� �� �ڸ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
//������ �Է��Ͻÿ� :378
//�����ڸ� :3
//�����ڸ� :7
//�����ڸ�:8

	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.printf("������ �Է��Ͻÿ� :");
//		
//		int Int= 378;
//		
//		int A= 'a';
//		int B= 'b';
//		int C= 'c';
//		
//		System.out.printf("%d \n", Int);
//		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.printf("������ �Է��Ͻÿ� :");
			int phy= sc.nextInt();
			
			System.out.printf("������ �ڸ���:%d \n", phy/100);
			System.out.printf("������ �ڸ���:%d \n", phy%100/10);
			System.out.printf("���� �ڸ���:%d \n", phy%10);
		}

}
