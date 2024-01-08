package ch05;

public class Ch0502Ex2th {
	
//	public static void throwException() throws Exception{
//		
//		System.out.println(">> throwException 함수 호출 <<");
//		// 메서드 호출하는데서 예외처리 출력해라
//		// throw new Exception("사용자가 예외 발생시킴");
//		
//		// 예외가 발생한 구문과 예외처리를 실행할 구문을 분리해주는 것이 throws 구문이다.
//		System.out.println(0/0);
//	}
	
//	public static void main(String[] args) {

//		try {
//			System.out.println(">>main에서 예외를 발생시키는 함수 호출");
//			throwException();
//		}catch(Exception e) {
//			System.out.println(">> catch 구문: 예외를 처리한다. <<");
//			e.printStackTrace();
//		}System.out.println("종료");
//
//	}

	public static void throwException(){
		
		try {
		System.out.println(">> throwException 함수 호출 <<");
		// 메서드 호출하는데서 예외처리 출력해라
		// throw new Exception("사용자가 예외 발생시킴");
		
		// 예외가 발생한 구문과 예외처리를 실행할 구문을 분리해주는 것이 throws 구문이다.
		System.out.println(0/0);
		}catch(Exception e) {
			System.out.println(">> catch 구문: 예외를 처리한다. <<");
			e.printStackTrace();
		}

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     	System.out.println(">>main에서 예외를 발생시키는 함수 호출");
	   throwException();
	   System.out.println("종료");
	}

}
