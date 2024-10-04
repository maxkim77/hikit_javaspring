package ch03;

class PT{
	int x = 5;
	int y = 5;
	//메서드에 소속 안됨 메서드 국가
	//멤버변수 글로벌 변수 
	
	// 속성
	// 2차원좌표
	
	//메모리할당 정의
	// 메모리할당 x 선언
	
	//선언 설계도면 클래스 
	// 정의 집을지음  new pt
	
}


public class Ch0305TestRef {

	public static void main(String[] args) {
		int i = 5;
		// 메인메서드에 소속된 변수 : 지역변수
		PT pt = new PT(); // 참조자료형 클래스기때문
		System.out.println(i+","+pt.x +","+pt.y);
		test(i,pt); // 기본자료형, 참조자료형
		System.out.println(i+","+pt.x +","+pt.y);
	}
	
	public static void test(int i, PT pt) {
		i = 3;
		pt.x = 3;
		
	 	// pt가 가르키는 힙메모리에 저장된 x의 값 = 3
		// pt 객체의 x에 저장된 값
		pt.y = 3;
	}

}
