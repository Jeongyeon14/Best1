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
//		System.out.println(" 1.����, 2.����, 3.��  \n");
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
		
		System.out.println("1����  2����  3�� �� ����");
		int me =sc.nextInt();
		String result;
	
		
		
		
		if(me == SCI)
			if(com == SCI)
				result = "���º�";
			else if(me == ROCK)
				result ="���ǽ�";
			else 
				result = "�Ľ�";
		
		else if(me == ROCK)
			if(com == SCI)
				result = "���� ��";
			else if(com == ROCK)
				result ="���º�";
			else
				result = "�Ľ�";
		
		else
			if(com == SCI)
				result = "�Ľ�";
			else if(com == ROCK)
				result ="����";
			else
				result = "���º�";

		System.out.println("������ �����" + result + "�Դϴ�");
		System.out.printf("��ǻ�ʹ� %s�� �½��ϴ�.\n", com==1?"����":com==2?"����":"��");

	}
	
	


}

