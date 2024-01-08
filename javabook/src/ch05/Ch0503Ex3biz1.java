package ch05;

class BizException1 extends Exception {
	private static final long serialVersionUID = 1L;
	
	public BizException1() {
		super("BizException");
	}
	public BizException1(String msg) {
		super(msg); 
	}
	
}


public class Ch0503Ex3biz1 {
	
//	public static void throwException(){
//		System.out.println(">> throwException 함수 호출<<");
//		BizException1 be = new BizException1("id가 비었습니다.");
//		try {
//			throw be;
////			throw new BizException1("id가 비었습니다.");
//		} catch(BizException1 e) {
//			e.printStackTrace();
//		}
//	
//	}
//	
//	public static void main(String[] args) {
//		System.out.println(">>main 함수에서 예외를 발생시키는 함수 호출<<");
//		throwException();
//		System.out.println(">>정상종료<<");
//	}
	public static void throwException() throws Exception{
		System.out.println(">> throwException 함수 호출<<");
		
		String id = "";
		System.out.println("정상 등록 처리");

	}
	
	public static void main(String[] args) {
		System.out.println(">>main 함수에서 예외를 발생시키는 함수 호출<<");
		try {
			try {
				throwException();
			}catch(Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(">>정상종료<<");
	}
}

