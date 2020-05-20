package may_18;

import java.util.Scanner;

public class ex6 {
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		for(int i=1; i<=5; i++)
//			System.out.println((int)(Math.random()*3)+1);
//	}

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println(" 1.가위, 2.바위, 3.보  \n");
//		int game = sc.nextInt();
//		int com =(int)(Math.random()*3)+1;
//		int user;
//		switch (game) {
//		case 1 : 
//		}
//		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int SCI =1;
		final int ROCK =2;
		final int PAPER =3;
		
		int com =(int)(Math.random()*3)+1;
		
		System.out.println("1가위  2바위  3보 중 선택");
		int me =sc.nextInt();
		String result;
	
		
		
		
		if(me == SCI)
			if(com == SCI)
				result = "무승부";
			else if(me == ROCK)
				result ="나의승";
			else 
				result = "컴승";
		
		else if(me == ROCK)
			if(com == SCI)
				result = "나의 승";
			else if(com == ROCK)
				result ="무승부";
			else
				result = "컴승";
		
		else
			if(com == SCI)
				result = "컴승";
			else if(com == ROCK)
				result ="나의";
			else
				result = "무승부";

		System.out.println("게임의 결과는" + result + "입니다");
		System.out.printf("컴퓨터는 %s를 냈습니다.\n", com==1?"가위":com==2?"바위":"보");

	}
	
	


}

