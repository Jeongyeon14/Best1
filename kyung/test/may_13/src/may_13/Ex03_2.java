package may_13;

import java.util.Scanner;

public class Ex03_2 {
	public static void main(String[] args) {
		//����ڷκ��� ����, ����, ö�� ������ �Է¹޾� �� ������ 70�� �̻��̸�
		//'���', �׷��� ������ '������ȸ��' ��� ���ڿ��� ��µǴ� ���α׷��� �ۼ�
		//(��, ���ǿ����ڸ� �̿��Ͽ� ���Ѵ�.)
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�������Է��ϼ���. :");
//
//		String a= "����";
//		String b= "����";
//		String c= "ö��";
//		
//			
//		int x,y,z;
//		x = sc.nextInt();
//		y = sc.nextInt();
//		z = sc.nextInt();
//		
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.println("�������� ���� �Է�>>");
		int phy = sc.nextInt();
		System.out.println("������� ���� �Է�>>");
		int his = sc.nextInt();
		System.out.println("ö�а��� ���� �Է�>>");
		int pil = sc.nextInt();
		
		//boolean bool = (phy>=70 && his >=70 && pil>=70);
		//System.out.println(bool? "���":"������ȸ��");
		
		System.out.println(phy>=70 && his >=70 && pil>=70? "���":"������ȸ��");
		
		
		
		
	}
}
