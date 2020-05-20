package may_18;

import java.util.Scanner;

public class ex4 {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println(" [[ MENU]] ");
	System.out.println(" 1. 짬뽕 ");
 	System.out.println(" 2. 국밥 ");
 	System.out.println(" 3. 육회비빔밥 ");
 	System.out.println(" 4. 칼국수 ");
 	System.out.println(" 메뉴 선택>> ");
 	
 	
 	int menu=sc.nextInt();
 	int n= 1;
 	
 	
 	switch(menu) {
 	case 'A' : System.out.println("짬뽕선택"); break;
 	case 2: System.out.println("국밥선택"); break;
 	case 3: System.out.println("육회비빔선택"); break;
 	case 4: System.out.println("칼국수선택"); break;
 	default : System.out.println("존재하지 않는 항목입니다. 다시입력하세요");
 	}
 	
}
}