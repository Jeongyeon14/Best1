package may_13;

import java.util.Scanner;

public class Ex03 {

//	public static void main(String[] args) {
//		int x =20;
//		int y =50;
//		int max;
//		
//		//조건식? True_value:Flase_value;
//		
//		max = (x>y)? x: y;
//		
//		System.out.printf("최댓값:%d\n",max);
//	}
	
	//임의의 3개의 정수를 받아서 최댓값을 구하라
	
	public static void main(String[] args) {
	int x,y,z;
	int max;
	Scanner sc = new Scanner(System.in);
	x= sc.nextInt();
	y= sc.nextInt();
	z= sc.nextInt();
	max = x>y? x:y;  //x와y의 결과값을 비교하고 더 큰값이 max
	max = max>z?max:z; //x,y중 큰 값이 max로 들어가고 그 max와 z를 비교해서 더 큰값이 max가 된다.
						//max= x>= y &&  x >=z? x: y>=x && y >=z? y:z;   
	
	
	System.out.printf("최댓값:%d\n",max);
		
	}
}
