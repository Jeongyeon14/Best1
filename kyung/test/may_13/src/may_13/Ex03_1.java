package may_13;

import java.util.Scanner;

public class Ex03_1 {
	public static void main(String[] args) {
		//1부터 5까지의 정수에 대하여 제곱값과 세제곱 값을 화면에 출력하는 프로그램 작성하기
		//(정수 값의 증가는 증감 연산자를 활용)
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
