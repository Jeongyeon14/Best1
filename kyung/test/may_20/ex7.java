package may_20;
//10���� ������ �Է� �޾� �ִ񰪰� �ּڰ��� ���Ͻÿ�
//�Է� 1:90
//�Է� 2:30
//�Է� 3:-10
//�Է� 4:90
//�Է� 5:70
//�Է� 6:36
//�Է� 7:2
//�Է� 8:350
//�Է� 9:5
//�Է� 10:100

import java.util.Scanner;

//�ּҰ�: -10
//�ְ���:350
public class ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,min,max;
		
		System.out.printf("%d�� �Է�:",1);
		min = max = x = sc.nextInt();
		
		for(int i=2; i <=10; i++) {
			System.out.printf("%d�� �Է�:",i);
			x=sc.nextInt();
			if(max <x)
				max =x;
			if(min >x)
				min = x;
		}
		System.out.printf("�ִ�:%d, �ּڰ�:%d", max ,min);
		
		
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int x;
//		
//		
//		int min=0;
//		int max=0;
//
//		for(int i=1; i<=10; i++) {
//		System.out.printf("%d��° ���� �Է� : \n",i);
//		x=sc.nextInt();
//		
//		max = x>max? x:max;
//		max = max>i?max:i;
//		
//		min = x<min? x:min;
//		min = min<i? min:i;
//		
//		
//			
//	}
//		System.out.printf("�ִ�%d\n",max);
//		System.out.printf("�ּڰ�%d\n",min);
//		
//}
}
}
