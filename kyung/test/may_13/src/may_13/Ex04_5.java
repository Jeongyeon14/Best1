package may_13;

import java.util.Scanner;

public class Ex04_5 {
	//대문자, 소문자, 숫자, 나머지는 기타문자로 출력하기
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요.");
		char chr=sc.nextLine().charAt(0);
		
		if('A' <= chr && 'Z' >=chr)
			System.out.println("대문자입니다.");
		else if('a' <= chr && 'z' >= chr)
			System.out.println("소문자입니다.");
		else if('0' <= chr && '9' >= chr)
			System.out.println("숫자입니다.");
		else
			System.out.println("기타문자입니다");
		
		
	}

}
