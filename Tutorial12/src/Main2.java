
public class Main2 {

	//재귀함수로 피보나치수열 함수 만들기
	public static int fibonacci(int number) {
		
		if(number == 1)
		{
			return 1;
		}
		else if(number == 2)
		{
			return 1;
		}
		else 
		{
			return fibonacci(number-1) + fibonacci(number-2);
		}

	}
	
	public static void main(String[] args) {
		
		System.out.println("피보나치 수열의 10번째 원소는: " + fibonacci(10) + "입니다.");
		
	}

}
