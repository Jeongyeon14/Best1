package may_13;

import java.util.Scanner;

public class Ex03_1 {
	public static void main(String[] args) {
		//1���� 5������ ������ ���Ͽ� �������� ������ ���� ȭ�鿡 ����ϴ� ���α׷� �ۼ��ϱ�
		//(���� ���� ������ ���� �����ڸ� Ȱ��)
	Scanner sc = new Scanner(System.in);
		int x=1;
		
		System.out.printf("%10s%10s%10s\n","int", "Square","Cube");
		
		System.out.printf("%10d%10d%10d\n", x, x*x, x*x*x);
		x++;            
		System.out.printf("%10d%10d%10d\n", x, x*x, x*x*x);
		x++;
		System.out.printf("%10d%10d%10d\n", x, x*x, x*x*x);
		x++;
		System.out.printf("%10d%10d%10d\n", x, x*x, x*x*x);
		x++;
		System.out.printf("%10d%10d%10d\n", x, x*x, x*x*x);
		                
		
	}
	
}
