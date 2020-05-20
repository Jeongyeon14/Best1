package may_18;

import java.util.Scanner;

public class ex8 {
	// 철학과목의 중간고사 점수의 전체 평균 점수를 구하시오. (학생의 인원수는 모름)
	// 무한루프 상태에서 중간고사 점수를 입력받아 전체합을 구한다.
	// 무한루프를 빠져나오기 위해 의도적으로 점수를 음수로 입력한다.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int score;
//		int cnt=0;
//		int sum=0;
//		
//		while(true) {
//			System.out.printf("%d번 학생점수 >>>\n",cnt);
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
//		System.out.printf("철학과목 전체 평균 점수: %.2f\n", avg);
		
		
		int i=0;
		int cnt=0;
		int sum=0;
		int score;

		while(true) {
			System.out.printf("%d번 학생점수 >>>\n",cnt);
			score =sc.nextInt();
		
		
		if(score < 0)
			break;
		
		sum += score; 
		cnt++;
	}	
		
	double avg = (double) sum / cnt;
	System.out.printf("철학과목 전체 평균 점수: %.2f\n", avg);

	
	
	
	
	
	}
}