package may_18;

import java.util.Scanner;

public class ex4 {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println(" [[ MENU]] ");
	System.out.println(" 1. «�� ");
 	System.out.println(" 2. ���� ");
 	System.out.println(" 3. ��ȸ����� ");
 	System.out.println(" 4. Į���� ");
 	System.out.println(" �޴� ����>> ");
 	
 	
 	int menu=sc.nextInt();
 	int n= 1;
 	
 	
 	switch(menu) {
 	case 'A' : System.out.println("«�ͼ���"); break;
 	case 2: System.out.println("���伱��"); break;
 	case 3: System.out.println("��ȸ�������"); break;
 	case 4: System.out.println("Į��������"); break;
 	default : System.out.println("�������� �ʴ� �׸��Դϴ�. �ٽ��Է��ϼ���");
 	}
 	
}
}