
public class Main {

	//�ݺ��Լ�
	public static int factorial1(int number) {
		
		int sum = 1;
		for(int i =2; i <= number; i++) 
		{
			sum *= i;
			
		}
		return sum;
	}
	
	//����Լ�
	public static int factorial2(int number) {
		
		if(number == 1)
			return 1;
		else 
			return number * factorial2(number - 1);
		
	} 
	
	
	public static void main(String[] args) {
	
		System.out.println("10 ���丮�� " + factorial1(10));
		System.out.println("10 ���丮�� " + factorial2(10));
	}

}
