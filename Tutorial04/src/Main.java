
public class Main {

	final static int SECOND = 1000;
	
	public static void main(String[] args) {
		
		//������
//		int minite = SECOND / 60;
//		int second = SECOND	% 60;
//		System.out.println(minite + "�� " + second + "��");
		
		//����������
//		int a = 10;
//		System.out.println("������ a�� " + a + "�Դϴ�");
//		a++;
//		System.out.println("������ a�� " + a + "�Դϴ�");
//		System.out.println("������ a�� " + ++a + "�Դϴ�");  //���� �� ���
//		System.out.println("������ a�� " + a++ + "�Դϴ�");  //��� �� ����
//		System.out.println("������ a�� " + a + "�Դϴ�");
		
		//%������ (moduler operator)
//		System.out.println(1 % 3);
//		System.out.println(2 % 3);
//		System.out.println(3 % 3);

		//�� ������
//		int a = 50;
//		int b = 50;
//		System.out.println("a�� b�� ��������? " + (a == b));
//		System.out.println("a�� b���� ū����? " + (a > b));
//		System.out.println("a�� b���� ��������? " + (a < b));
//		System.out.println("a�� b�� �����鼭 30���� ū����? " + ((a == b) && (a > 30)));
//		System.out.println("a�� 50�� �ƴѰ���? " + !(a == 50));
//		System.out.println("a�� 50�� �ƴѰ���? " + (a != 50));  //���� ����
		
		//�Լ� ����
//		int x = 50;
//		int y = 60;
//		System.out.println("�ִ밪�� " + max(x, y) + "�Դϴ�");
		
		//pow()�Լ�
		double a = Math.pow(3.0, 20.0);
		System.out.println("3�� 20����: " + (int) a + "�Դϴ�");
	}
	
	//�Լ� ���� (��ȯ��, �Լ��̸�, �Ű� ����)
	static int max(int a, int b) {
		int result = (a > b) ? a : b;
		return result;
	}

}