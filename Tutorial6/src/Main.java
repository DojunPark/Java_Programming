
public class Main {
	
	final static int N = 30;

	public static void main(String[] args) {
		
		//���ǹ� if
		int score = 60;
		
		if (score >= 90) {
			System.out.println("A+�Դϴ�.");
		}
		else if (score >= 80) {
			System.out.println("B+�Դϴ�.");
		}
		else if (score >= 70) {
			System.out.println("C+�Դϴ�.");
		}
		else {
			System.out.println("F�Դϴ�.");
		}
		
		
		//String�� ���� ���� equal() �޼ҵ带 ���
		String a = "Man";
		int b = 0;
		
		if (a.equals("Man")) {
			System.out.println("a�� �����Դϴ�");
		}
		else {
			System.out.println("a�� ���ڰ� �ƴմϴ�");
		}
		
		if (b == 3) {
			System.out.println("b�� 3�Դϴ�");
		}
		else {
			System.out.println("b�� 3�� �ƴմϴ�");
		}
		
		//��ҹ��� ���� ����
		if (a.equalsIgnoreCase("man") && b == 0) {
			System.out.println("���Դϴ�");
		}
		else {
			System.out.println("�����Դϴ�");
		}
		
		//�ݺ��� while
//		int i = 1, sum = 0;
//		while (i <= 1000) {
//			sum += i++;
//		}
//		System.out.println("1���� 1000������ ����: " + sum + " �Դϴ�");
		
		//���� �ݺ��� for
//		for (int i = N; i > 0; i--) {
//			for (int j = i; j > 0; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//�� �׸��� x^2 + y^2 = r^2
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
		
		// ���� ����
		int count = 0;
		
		for (;;) {
			System.out.println("���");
			count++;
			
			if (count == 10) {
				break;
			}
			
		}
		
	}

}
