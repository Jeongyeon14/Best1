package may_20;

import java.util.Scanner;

public class dsdssdfdfs {
//	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	int x;
//	char z;
//	int n;
//	int i=1;
//	
//	while(true) {
//		x= 1;
//		System.out.println("������ ������ �Է��Ͻÿ� : \n");
//		n= sc.nextInt();
//		
//		System.out.println("=========================== \n");
//		System.out.println("n	1���� n������ �� \n");
//		System.out.println("=========================== \n");
//		
//		for(i=1; i <= n; i++ ) 
//			
//			System.out.printf("%d  \t %d\n",i,x = x*i);
//		System.out.println("��� �Ͻðڽ��ϱ�? (y/n)>>");
//				sc.nextLine();	
//				z = sc.nextLine().charAt(0);
//				
//			if(z =='n') {
//			System.out.println("�����մϴ�.\n");
//					break;
//		}
//		
//		
//		
//	
//}
//}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x;
	
	
	int min=0;
	int max=0;

	for(int i=1; i<=10; i++) {
	System.out.printf("%d��° ���� �Է� : \n",i);
	x=sc.nextInt();
	
	max = x>max? x:max;
	max = max>i?max:i;
	
	min = x<min? x:min;
	min = min<i? min:i;
	
	
		
}
	System.out.printf("�ִ�%d\n",max);
	System.out.printf("�ּڰ�%d\n",min);
	
}

}