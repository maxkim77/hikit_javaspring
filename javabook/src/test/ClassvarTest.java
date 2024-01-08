package test;

class Classvar {
	
	int a = 10;
	static int b = 0;
	
	
}


public class ClassvarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 20;
		
		Classvar.b = 10;
		System.out.println(Classvar.b);
		
		Classvar classvar = new Classvar();
		
		classvar.b=30;
		
		System.out.println(classvar.b);
		Classvar.b = 50;
		System.out.println(classvar.b);
		

	}

}
