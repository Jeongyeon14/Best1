package may_13;

import java.util.Scanner;

public class Ex03 {

//	public static void main(String[] args) {
//		int x =20;
//		int y =50;
//		int max;
//		
//		//���ǽ�? True_value:Flase_value;
//		
//		max = (x>y)? x: y;
//		
//		System.out.printf("�ִ�:%d\n",max);
//	}
	
	//������ 3���� ������ �޾Ƽ� �ִ��� ���϶�
	
	public static void main(String[] args) {
	int x,y,z;
	int max;
	Scanner sc = new Scanner(System.in);
	x= sc.nextInt();
	y= sc.nextInt();
	z= sc.nextInt();
	max = x>y? x:y;  //x��y�� ������� ���ϰ� �� ū���� max
	max = max>z?max:z; //x,y�� ū ���� max�� ���� �� max�� z�� ���ؼ� �� ū���� max�� �ȴ�.
						//max= x>= y &&  x >=z? x: y>=x && y >=z? y:z;   
	
	
	System.out.printf("�ִ�:%d\n",max);
		
	}
}
