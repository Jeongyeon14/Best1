package may_11;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		
		int a, b;
		int result;
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		
		
		result = a + b;
		System.out.println(a + "+" + b +"=" + result);
		
		result = a - b;
		System.out.println(a + "-" + b +"=" + result);
		
		result = a * b;
		System.out.println(a + "*" + b +"=" + result);
		
		result = a / b;
		System.out.println(a + "/" + b +"=" + result);
		
	}

}
