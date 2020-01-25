
public class Main {

	final static int SECOND = 1000;
	
	public static void main(String[] args) {
		
		//연산자
//		int minite = SECOND / 60;
//		int second = SECOND	% 60;
//		System.out.println(minite + "분 " + second + "초");
		
		//증감연산자
//		int a = 10;
//		System.out.println("현재의 a는 " + a + "입니다");
//		a++;
//		System.out.println("현재의 a는 " + a + "입니다");
//		System.out.println("현재의 a는 " + ++a + "입니다");  //증가 후 출력
//		System.out.println("현재의 a는 " + a++ + "입니다");  //출력 후 증가
//		System.out.println("현재의 a는 " + a + "입니다");
		
		//%연산자 (moduler operator)
//		System.out.println(1 % 3);
//		System.out.println(2 % 3);
//		System.out.println(3 % 3);

		//비교 연산자
//		int a = 50;
//		int b = 50;
//		System.out.println("a와 b가 같은가요? " + (a == b));
//		System.out.println("a가 b보다 큰가요? " + (a > b));
//		System.out.println("a가 b보다 작은가요? " + (a < b));
//		System.out.println("a가 b와 같으면서 30보다 큰가요? " + ((a == b) && (a > 30)));
//		System.out.println("a가 50이 아닌가요? " + !(a == 50));
//		System.out.println("a가 50이 아닌가요? " + (a != 50));  //위와 동일
		
		//함수 실행
//		int x = 50;
//		int y = 60;
//		System.out.println("최대값은 " + max(x, y) + "입니다");
		
		//pow()함수
		double a = Math.pow(3.0, 20.0);
		System.out.println("3의 20제곱: " + (int) a + "입니다");
	}
	
	//함수 생성 (반환형, 함수이름, 매개 변수)
	static int max(int a, int b) {
		int result = (a > b) ? a : b;
		return result;
	}

}
