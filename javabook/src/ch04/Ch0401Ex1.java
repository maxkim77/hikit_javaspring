package ch04;

class Point01 {
	int x;
	int y;
}

public class Ch0401Ex1 {

	public static void main(String[] args) {
		Point01 pt01 = new Point01();
		pt01.x = 10;
		pt01.y = 20;
		System.out.println("("+pt01.x + ", " +pt01.y+")");
		// 10 20
		Point01 pt02 = new Point01();
		pt02.x = 30;
		pt02.y = 50;
		
		System.out.println("("+pt02.x + ", " +pt02.y+")");
		
		// 30 50
		System.out.println("("+pt01.x + ", " +pt01.y+")");
		// 10 20
			
	}

}
