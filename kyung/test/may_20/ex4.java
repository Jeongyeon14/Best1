package may_20;

import java.util.Scanner;

//������ ���� ������ �ݺ� �Է� �޾� �� �߿� ��ü ¦���� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

//�Է��Ͻÿ�.(������(�����Է�)):10
//�Է��Ͻÿ�.(������(�����Է�)):11
//�Է��Ͻÿ�.(������(�����Է�)):14
//�Է��Ͻÿ�.(������(�����Է�)):12
//�Է��Ͻÿ�.(������(�����Է�)):1
//�Է��Ͻÿ�.(������(�����Է�)):12
//�Է��Ͻÿ�.(������(�����Է�)):20
//�Է��Ͻÿ�.(������(�����Է�)):26
//�Է��Ͻÿ�.(������(�����Է�)):-10

//���� :6
public class ex4 {
//	public static void main(String[] args) {
//		Scanner	sc = new Scanner(System.in);
//		int i=0;
//		int x;
//		
//	
//		do {
//			System.out.println("�Է��Ͻÿ�.(������(�����Է�)): \n");
//			x =sc.nextInt();
//			
//			if(x < 0) {
//				break;
//			}
//
//			if(x%2 == 0)
//				i++;  // i= i +1
//			
//		} while(true);
//
//
//		System.out.printf("¦���� ���� : %d", i);
//		
//		
//	}
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		int n;
		int cnt=0;
		
		while(true) {
			System.out.println("���� ���� �Է�(������(����))>>");
			n=sc.nextInt();
			
			if(n <=0)
				break;
			if( n %2 ==0)
				cnt++;			
		}
		System.out.printf("��ü ¦���� ���� : %d \n", cnt);
		
		
}
}