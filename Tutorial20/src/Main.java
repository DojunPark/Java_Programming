//interface ����� extends�� �ƴ϶� implements
public class Main implements Dog, Cat{

	public static void main(String[] args) {
		
		Main main = new Main();
		main.crying();
		main.show();
		main.one();
		main.two();
		
	}

	@Override
	public void crying() {
		
		System.out.println("��! ��!");
		
	}

	@Override
	public void show() {
		
		System.out.println("Hello world!");
		
	}

	@Override
	public void two() {
		System.out.println("two!");
		
	}

	@Override
	public void one() {
		System.out.println("one!");
	}

}
