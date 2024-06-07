package ch04;

class Point2D10{
	protected int x;
	protected int y;
	public Point2D10() {
		System.out.println("Point2d10 생성자");
	}
	public Point2D10(int x) {
		this.x = x;
		System.out.println("Point2D10 매개변수 생성자");
	}
	public Point2D10(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
}

class Point3D10 extends Point2D10 {
	protected int z=30;
	public Point3D10() {
		super(3);
		System.out.println("Point3D10 생성자");
	}
	public Point3D10(int z) {
		super(3);
		this.z=z;
		System.out.println("Point3D10 생성자1");
	}
	
}

public class Ch0414Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2D10 pt = new Point3D10(30);
		pt.x = 110;
		pt.y = 120;
		//pt.z = 130;
	}

}
