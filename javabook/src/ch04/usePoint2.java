package ch04;

public class usePoint2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2 p1 = new Point2(10,20);
		
		
		System.out.println(p1.getX() + " "+p1.getY());
		
		p1.swap();
		
		System.out.println(p1.getX() + " "+p1.getY());
		
		
		Point2 p2 = new Point2();
		p2.setX(30);
		p2.setY(10);
		
		System.out.println(p2.getX() + " "+p2.getY());
		
		p2.swap();

		System.out.println(p2.getX() + " "+p2.getY());
	}

}
