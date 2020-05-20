package may_11;

public class Ex07 {

	public static void main(String[] args) {
		double var1 = 3.14;
		float var2 = 3.14F; 			//컴파이 ㄹ에러(type mism
		float var3 = 3.14F;
		
		
		//정밀도 테스트
		double var4 = 1.234566890123456689;
		float var5 = 1.234566890123456689F;
		
		System.out.println("var1:"+var1);
		System.out.println("var2:"+var2);
		System.out.println("var4:"+var4);
		System.out.println("var5:"+var5);
		
		//e사용하기
		int var6 = 3000000;
		double var7 = 3e6;
		float var8 = 3e6F;
		double var9 = 2e-3;
		System.out.println("var6:" +var6);
		System.out.println("var7:" +var7);
		System.out.println("var8:" +var8);
		System.out.println("var9:" +var9);
	}
	
}
