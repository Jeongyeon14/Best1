package may_20;

import java.util.Scanner;

//���������� �ݺ�
public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ans;
		int n;
		
		while(true) {
			System.out.println(" \n [[���� ����]]");
			System.out.println(" 1. ���� ���� ��");
			System.out.println(" 2. ��Ʈ����");
			System.out.println(" \n ���� ����");
			n = sc.nextInt();
			
			
			System.out.print("\n������ ��� �Ͻðٽ��ϱ�(y/n)?");
			sc.nextLine();
			ans = sc.nextLine().charAt(0);
			
			if(ans == 'n') {
				System.out.println("������ �����մϴ�. \n");
				break;
			}
			
		}
		
	
	}
	
}
