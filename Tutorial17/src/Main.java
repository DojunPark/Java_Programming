import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Teacher teacher1 = new Teacher("John Doe", 28, 177, 70, "ABC14010",4000, 5);
		teacher1.show();
		
//		Student[] students = new Student[100];
//		for(int i=0; i<100; i++) {
//			students[i] = new Student("ȫ�浿", 20, 175, 70, i+"", 1, 4.5);
//			students[i].show();
//		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�� �� ���� �л��� �����մϱ�?");
		int number = scan.nextInt();
		Student[] students = new Student[number];
		
		for(int i=0; i<number; i++) {
			String name;
			int age; 
			int height; 
			int weight; 
			String studentID;
			int grade; 
			double gPA;
			
			System.out.print("�л��� �̸��� �Է��ϼ���: ");
			name = scan.next();
			System.out.print("�л��� ���̸� �Է��ϼ���: ");
			age = scan.nextInt();
			System.out.print("�л��� Ű�� �Է��ϼ���: ");
			height = scan.nextInt();
			System.out.print("�л��� �����Ը� �Է��ϼ���: ");
			weight = scan.nextInt();
			System.out.print("�л��� �й��� �Է��ϼ���: ");
			studentID = scan.next();
			System.out.print("�л��� �г��� �Է��ϼ���: ");
			grade = scan.nextInt();
			System.out.print("�л��� ������ �Է��ϼ���: ");
			gPA = scan.nextDouble();
			students[i] = new Student(name, age, height, weight, studentID, grade, gPA);
		}
		for(int i=0; i<number; i++) {
			students[i].show();
		}
		
	}

}
