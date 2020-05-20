package may_20;

import java.util.Scanner;

//가위바위보 반복
public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ans;
		int n;
		
		while(true) {
			System.out.println(" \n [[게임 종류]]");
			System.out.println(" 1. 가위 바위 보");
			System.out.println(" 2. 테트리스");
			System.out.println(" \n 게임 선택");
			n = sc.nextInt();
			
			
			System.out.print("\n게임을 계속 하시겟습니까(y/n)?");
			sc.nextLine();
			ans = sc.nextLine().charAt(0);
			
			if(ans == 'n') {
				System.out.println("게임을 종료합니다. \n");
				break;
			}
			
		}
		
	
	}
	
}
