package may_13;

import java.util.Scanner;

public class Ex04_2 {
	//임의의 3개의 정수를 받아서 최댓값을 구하라
	
	public static void main(String[] args) {
	System.out.println("정수를 입력하세요.");
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
