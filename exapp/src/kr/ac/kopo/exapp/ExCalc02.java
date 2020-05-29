package kr.ac.kopo.exapp;

import java.util.Scanner;

public class ExCalc02 {
	//+,-,*,/사 아닌 연산자를 입력할 경우,
	//"알 수 없는 연산자"를 출력하도록 프로그램을 작성하세요.
	

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("첫번째 숫자를 입력하세요");
			String n1 = sc.nextLine();
	
			System.out.println("두번쨰 숫자를 입력하세요");
			String n2 =  sc.nextLine();
			
			System.out.println("연산자를 입력하세요");
			String op = sc.nextLine();
			
			double num1 = Double.parseDouble(n1);
			double num2 = Double.parseDouble(n2);
			
			double result = 0;
			
			switch (op) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				result = num1 / num2;
				break;
			default: System.out.println("알 수 없는 연산자");
			//이 이후 할일이 없으므로 프로그램(&현재 메서드) 종료하고 돌아가라
			return;
//			break;
			}
			
			System.out.println( n1 + op + n2 + " = " + result);
			
	} 	
}



