package may_18;

import java.util.Scanner;

public class ex8 {
	// ö�а����� �߰���� ������ ��ü ��� ������ ���Ͻÿ�. (�л��� �ο����� ��)
	// ���ѷ��� ���¿��� �߰���� ������ �Է¹޾� ��ü���� ���Ѵ�.
	// ���ѷ����� ���������� ���� �ǵ������� ������ ������ �Է��Ѵ�.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int score;
//		int cnt=0;
//		int sum=0;
//		
//		while(true) {
//			System.out.printf("%d�� �л����� >>>\n",cnt);
//			score =sc.nextInt();
//			
//			
//			if(score < 0)
//				break;
//			
//			sum += score; 
//			cnt++;
//		}	
//		
//		double avg = (double) sum / cnt;
//		System.out.printf("ö�а��� ��ü ��� ����: %.2f\n", avg);
		
		
		int i=0;
		int cnt=0;
		int sum=0;
		int score;

		while(true) {
			System.out.printf("%d�� �л����� >>>\n",cnt);
			score =sc.nextInt();
		
		
		if(score < 0)
			break;
		
		sum += score; 
		cnt++;
	}	
		
	double avg = (double) sum / cnt;
	System.out.printf("ö�а��� ��ü ��� ����: %.2f\n", avg);

	
	
	
	
	
	}
}