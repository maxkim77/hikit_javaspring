package ch04;

public class Ch0403Ex6 {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ch0403Ex6 exam = new Ch0403Ex6();
		System.out.println(exam.sum(3,5));
		System.out.println(exam.sum(3,5,8));
		
		

	}
	
	// 가독성을 위해서 메인이 
	 public int sum(int num1, int num2) {
		 return num1 + num2;
	 }
	
	 public int sum(int num1, int num2, int num3) {
		 return num1 + num2 + num3;
	 }
	

}
