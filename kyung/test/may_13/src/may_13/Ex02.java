package may_13;

import java.util.Scanner;

public class Ex02 {
//	public static void main(String[] args) {
		//4������ �������� 100���� ������ �ȶ�����  Ȥ�� 400���� �������� ����
		//�Է¹޴� ������ ������ true  �ƴϸ� false

//		Scanner scan = new Scanner(System.in);
//		int year = scan.nextInt();
//		
//		boolean bool;
//		int x = 4;
//		int y = 100;
//		int z = 400;
//		
//		bool= year%x == 0 && year%y != 0 ||year%z ==0;
//		System.out.println("����"+bool);
//		
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�����Է�>>");
		int year = scan.nextInt();
		
		boolean bool =(year%4 == 0) && (year%100 == 0) || (year%400 ==0);
		System.out.println("����"+bool);
	}
	
//}	
	
}

