package may_20;
//���ڸ� �Է��Ͻÿ� : 6
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� : \n ");
		int x =sc.nextInt();
		
		for(int j= 1; j<=x; j++) {
			for(int i=1; i<=x; i++)
				if(i <= j) {
					System.out.printf("%d",i);
				}
			System.out.println();
}
}
}
