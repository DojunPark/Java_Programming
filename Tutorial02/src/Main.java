
public class Main {

	//상수 선언
	final static double PI = 3.141592;
	final static int INT_MAX = 2147483647;
	
	//메인 메소드
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//자료형
		int intType = 100;
		double doubleType = 150.5;
		String stringType = "박도준";
//		System.out.println(intType);
//		System.out.println(doubleType);
//		System.out.println(stringType);
		
		//상수를 이용한 연산
		int r = 30;
//		System.out.println(r * r * PI);
		
		//최대값 출력
//		int a = INT_MAX;
//		System.out.println(a);
//		System.out.println(a+1);
		
		//사칙연산
//		int a = 1;
//		int b = 2;
//		System.out.println("a + b = " + (a + b));
//		System.out.println("a - b = " + (a - b));
//		System.out.println("a * b = " + (a * b));
//		System.out.println("a / b = " + (a / b));
		
		//형변환
		double b = 0.5;
		int a = (int) (0.5 + b);
		System.out.println(a);

	}

}
