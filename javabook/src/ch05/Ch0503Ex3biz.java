package ch05;

class BizException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public BizException() {
		super("BizException");
	}
	public BizException(String msg) {
		super(msg); 
	}
	
}


public class Ch0503Ex3biz {
	
	public static void throwException() throws Exception {
		System.out.println(">> throwException 함수 호출<<");
		//throw new BizException("id가 비었습니다");
		BizException be = new BizException("id가 비었습니다");
		throw be;
	}
	
	public static void main(String[] args) {
		System.out.println(">>main 함수에서 예외를 발생시키는 함수 호출<<");
		try {
			throwException();
		}catch(BizException e) {
			System.out.println("BizException 발생");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("Exception 발생");
			e.printStackTrace();
		}
		System.out.println(">>정상종료<<");
	
	}
}
