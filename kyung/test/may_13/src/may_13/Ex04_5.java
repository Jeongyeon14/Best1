package may_13;

import java.util.Scanner;

public class Ex04_5 {
	//�빮��, �ҹ���, ����, �������� ��Ÿ���ڷ� ����ϱ�
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		char chr=sc.nextLine().charAt(0);
		
		if('A' <= chr && 'Z' >=chr)
			System.out.println("�빮���Դϴ�.");
		else if('a' <= chr && 'z' >= chr)
			System.out.println("�ҹ����Դϴ�.");
		else if('0' <= chr && '9' >= chr)
			System.out.println("�����Դϴ�.");
		else
			System.out.println("��Ÿ�����Դϴ�");
		
		
	}

}
