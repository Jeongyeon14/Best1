package may_11;

public class Ex17 {

	public static void main(String[] args) {
		System.out.printf("100+100");
		System.out.printf("\n");
		System.out.printf("%d", 100+100);
		System.out.printf("\n");
	
		
		System.out.printf("%d", 100);
		System.out.printf("\n");
		System.out.printf("%d %d", 100,200);
		System.out.printf("\n");
		
		
		System.out.printf("%d / %d = %.2f\n", 100, 200, (double)100/200.0);
		System.out.printf("%s\t%s","Hello", "Java\n");
		
		
		System.out.printf("%d\n",123);    //공백없이
		System.out.printf("%5d\n",123);		//5만큼 할당, 빈자리는 공백 넣어서
		System.out.printf("%05d\n",123);	//5만큼 할당, 공백에 0을 넣어라
		
		System.out.printf("%f\n",123.45);	//뒤에 0이 그대로 나옴
		System.out.printf("%7.1f\n",123.45);	//소숫점 한자리까지 그 뒤로는 반올림
		System.out.printf("%7.3f\n",123.45);	//소숫점 셋째자리까지 

		System.out.printf("%s\n","Hi~Java");	// %s >문자열
		System.out.printf("%10s\n","Hi~Java");	//오른쪽 기준10s> 10칸만큼 할당 남은여백 공백처리 왼쪽은 -10s 
		System.out.printf("%-10s\n","Hi~Java");	//왼쪽은 -10s > 10칸만큼 할당 남은여백 공백처리 
		
		
		System.out.printf("\n줄바꿈\n연습\n");	//
		System.out.printf("\t탭키\t연습\n");	//
		System.out.printf("글자가\"강조\"되는 효과\n");	//
		System.out.printf("\\\\\\ 역슬래시 세개 출력 \n");	//
		
		
	
	
	}
	

 
	}

