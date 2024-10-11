package ch04;

class Point04 {
	int x;
	int y;
	
//	public Point04() {
//		System.out.println("매개변수가 없는 디폴트 생성자");
//	}
//	public Point04(int x) {
//		super();
//		this.x = x;
//	}
// 생성자도 오버로딩됨
	
	public Point04() {
	}
	
	public Point04(int x) {
		this.x = x;
	}
	
	public Point04(int x,int y) {
		this.x = x;
		this.x = y;
	}
	public void showPoint04() {
		System.out.println("("+x+", " + y +")");
	}
	
}

public class Ch0406Ex4parm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point04 pt01 = new Point04();
		pt01.x = 10; // pt01객체의 x라는 변수
		pt01.y = 20;
		System.out.println("("+pt01.x + ", "+pt01.y+")");
		pt01.showPoint04();
		
		Point04 pt02 = new Point04(100,200);
		System.out.println("("+pt02.x + ", "+pt02.y+")");
		
		Point04 pt03 = new Point04(300,400);
		System.out.println("("+pt03.x + ", "+pt03.y+")");
		
		Point04 pt04 = new Point04(700);
		pt04.y=70;
		System.out.println("("+pt04.x + ", "+pt04.y+")");
		

	}

}
