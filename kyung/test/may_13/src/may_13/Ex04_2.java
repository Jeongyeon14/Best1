package may_13;

import java.util.Scanner;

public class Ex04_2 {
	//������ 3���� ������ �޾Ƽ� �ִ��� ���϶�
	
	public static void main(String[] args) {
	System.out.println("������ �Է��ϼ���.");
		int x,y,z;
		
		Scanner sc = new Scanner(System.in);
		x= sc.nextInt();
		y= sc.nextInt();
		z= sc.nextInt();
		
		if(x>y)
			if(x>z)
				System.out.println(x);
			else
				System.out.println(z);
		else
			if(y>z)
				System.out.println(y);
			else
				System.out.println(z);
		
		
		
	}
}
