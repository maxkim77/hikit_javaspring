package ch05;

public class Ch0501Exlerr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String c= null;
			System.out.println(c.toString());
			System.out.println(0/0);
			System.out.println("Ok");
		}catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("NullPointer");
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Arithmetic");
		}catch(Exception e) {
			/*상위 throuable 클래스는 밑으로 구현
			 * 서브클래스 먼저적고 슈퍼클래스를 뒤에 적어야 동작한다.*/
			e.printStackTrace();
			System.out.println("Exception");
		}finally {
			System.out.println("finally연습");
			System.out.println("예외 발생여부와 상관없이 반드시 수행");
		}

		System.out.println("종료");
	}

}
