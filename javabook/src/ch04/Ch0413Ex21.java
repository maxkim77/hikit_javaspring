package ch04;

class Ch0411Point2D {
	protected int x=10;
	protected int y=20;
	public void showPoint() {
		System.out.println("x좌표:"+x);
		System.out.println("y좌표:"+y);
	}
}

class Ch0412Point3D extends Ch0411Point2D {
	protected int z=30;
	public void showPoint() {
		System.out.println("x 좌표 :"+x);
		System.out.println("y 좌표 :"+y);
		System.out.println("z 좌표 :"+z);
	}
}

public class Ch0413Ex21 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ch0411Point2D pt2 = new Ch0411Point2D();
		pt2.x = 100;
		pt2.y = 200;
		pt2.showPoint();
		
		Ch0412Point3D pt = new Ch0412Point3D();
		pt.showPoint();

	}

}
