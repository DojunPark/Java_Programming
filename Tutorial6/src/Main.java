
public class Main {
	
	final static int N = 30;

	public static void main(String[] args) {
		
		//조건문 if
		int score = 60;
		
		if (score >= 90) {
			System.out.println("A+입니다.");
		}
		else if (score >= 80) {
			System.out.println("B+입니다.");
		}
		else if (score >= 70) {
			System.out.println("C+입니다.");
		}
		else {
			System.out.println("F입니다.");
		}
		
		
		//String을 비교할 때는 equal() 메소드를 사용
		String a = "Man";
		int b = 0;
		
		if (a.equals("Man")) {
			System.out.println("a는 남자입니다");
		}
		else {
			System.out.println("a는 남자가 아닙니다");
		}
		
		if (b == 3) {
			System.out.println("b는 3입니다");
		}
		else {
			System.out.println("b는 3이 아닙니다");
		}
		
		//대소문자 구분 무시
		if (a.equalsIgnoreCase("man") && b == 0) {
			System.out.println("참입니다");
		}
		else {
			System.out.println("거짓입니다");
		}
		
		//반복문 while
//		int i = 1, sum = 0;
//		while (i <= 1000) {
//			sum += i++;
//		}
//		System.out.println("1부터 1000까지의 합은: " + sum + " 입니다");
		
		//이중 반복문 for
//		for (int i = N; i > 0; i--) {
//			for (int j = i; j > 0; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//원 그리기 x^2 + y^2 = r^2
//		for (int i = -N; i <= N; i++) {
//			for (int j = -N; j <= N; j++) {
//				if (i*i + j*j <= N*N) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		// 무한 루프
		int count = 0;
		
		for (;;) {
			System.out.println("출력");
			count++;
			
			if (count == 10) {
				break;
			}
			
		}
		
	}

}
