package may_20;
//����ڰ� �Է��� ��� ���� ���鿡 ���Ͽ� 1���� �� ���������� ���� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//������ ������ �Է��Ͻÿ� : 5
//==================
// n    1���� n������ ��
//==================
// 1          1  
// 2          2  
// 3          6  
// 4          24  
// 5          120  
//��� �Ͻðڽ��ϱ�? (y/n) y

import java.util.Scanner;

//������ ������ �Է��Ͻÿ� : 6
//==================
// n    1���� n������ ��
//==================
// 1          1  
// 2          2  
// 3          6  
// 4          24  
// 5          120  
// 6          720  
//��� �Ͻðڽ��ϱ�? (y/n) n


public class ex5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int sum;


	while(true) {
		sum= 0;
		System.out.println("������ ������ �Է��Ͻÿ� : \n");
		int n= sc.nextInt();
		
		for(int i=1; i <= n; i++ ) {
			sum += i;
			
			System.out.printf("������ ���: %d\n",sum);
			sc.NextInt();
			char ans= sc.nextLine();
			
		}
		System.out.println("��� �Ͻðڽ��ϱ�? (y/n)>>");
		


}
}
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	int x;
//	int n;
//	int i=1;
//	char z;
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


}
