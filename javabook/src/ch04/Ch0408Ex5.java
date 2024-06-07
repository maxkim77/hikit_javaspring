package ch04;

public class Ch0408Ex5 {
	static int num1 = 10;
	int num2 = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ch0408Ex5.num1=70;
		System.out.println("Ch4Ex5.num1="+Ch0408Ex5.num1);
		// 70
		
		Ch0408Ex5 ex1 = new Ch0408Ex5();
		Ch0408Ex5 ex2 = new Ch0408Ex5();
		
		Ch0408Ex5.num1=20;
		Ch0408Ex5.num1=30;		
		
		System.out.println("Ch4Ex5.num1="+Ch0408Ex5.num1);
		System.out.println("Ch4Ex5.num1="+Ch0408Ex5.num1);
		// 30
		// 30
		ex1.num2=30;
		ex2.num2=50;
		
		Ch0408Ex5.num1 =100;
		
		System.out.println("ex1.num2="+ex1.num2);
		//30
		
		System.out.println("ex2.num2="+ex2.num2);
		//50
		System.out.println("ex1.num2="+Ch0408Ex5.num1);
		System.out.println("Ch4Ex5.num1="+Ch0408Ex5.num1);
	}

}
