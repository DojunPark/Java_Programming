
public class Main {

	//¹Ýº¹ÇÔ¼ö
	public static int factorial1(int number) {
		
		int sum = 1;
		for(int i =2; i <= number; i++) 
		{
			sum *= i;
			
		}
		return sum;
	}
	
	//Àç±ÍÇÔ¼ö
	public static int factorial2(int number) {
		
		if(number == 1)
			return 1;
		else 
			return number * factorial2(number - 1);
		
	} 
	
	
	public static void main(String[] args) {
	
		System.out.println("10 ÆÑÅä¸®¾ó " + factorial1(10));
		System.out.println("10 ÆÑÅä¸®¾ó " + factorial2(10));
	}

}
