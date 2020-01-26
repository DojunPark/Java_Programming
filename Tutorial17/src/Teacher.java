
public class Teacher extends Person {

	private String teacherID;
	private int monthSalary;
	private int workedYear;
	
	//getters and setters
	public String getTeacherID() {
		return teacherID;
	}
	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}
	public int getMonthSalary() {
		return monthSalary;
	}
	public void setMonthSalary(int monthSalary) {
		this.monthSalary = monthSalary;
	}
	public int getWorkedYear() {
		return workedYear;
	}
	public void setWorkedYear(int workedYear) {
		this.workedYear = workedYear;
	}
	
	//constructor
	public Teacher(String name, int age, int height, int weight, String teacherID, int monthSalary, int workedYear) {
		super(name, age, height, weight);
		this.teacherID = teacherID;
		this.monthSalary = monthSalary;
		this.workedYear = workedYear;
	}
	
	//����Լ�
	public void show() {
		System.out.println("------------------");
		System.out.println("���� �̸�: " + getName());
		System.out.println("���� ����: " + getAge());
		System.out.println("���� Ű: " + getHeight());
		System.out.println("���� ������: " + getWeight());
		System.out.println("����: " + getTeacherID());
		System.out.println("����: " + getMonthSalary());
		System.out.println("����: " + getWorkedYear());
	}
	
	
	
}
