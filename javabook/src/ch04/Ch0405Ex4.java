package ch04;

public class Ch0405Ex4 {

	public Ch0405Ex4() {
		System.out.println("객체생성 : HelloWorld");
	}
	//default 생성자 
// 프로그래머가 안만들었을때 자동으로 만들어줌
//	public Ch0405Ex4() {
//}
	public static void main(String[] args) {
		//Ch0405Ex4 exam = new Ch4Ex4(); // 생성자 메서드
		//new먼저 실행 메서드 호출
		Ch0405Ex4 exam = new Ch0405Ex4();
		System.out.println(exam);

	}

}
