package ch04;

class Point2D07 {
	protected int x=10;
	protected int y=20;
	public void showPoint() {
		System.out.println(" x 좌표 : " + x);
		System.out.println(" y 좌표 : " + y);
	}
}

class Point3D07 extends Point2D07 {
	protected int z = 30;
	public void showPoint() {
		super.showPoint();
		System.out.println(" z 좌표: " + z);
	}
	
}

public class Ch0410Ex7rid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2D07 pt2 = new Point2D07();
		pt2.x = 100;
		pt2.y = 200;
		pt2.showPoint();
		
		Point3D07 pt = new Point3D07();
		pt.showPoint();

	}

}
