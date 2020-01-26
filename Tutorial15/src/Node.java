
public class Node {

	//변수 생성
	private int x;
	private int y;
	
	//변수를 가져올 때 사용되는 함수 정의
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	//생성자함수 생성
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Node getCenter(Node other) {
		return new Node((this.x + other.getX()) / 2, (this.y + other.getY()) / 2);
	}
	
	
}
