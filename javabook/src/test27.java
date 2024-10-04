
public class test27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -5, result;
		result = abs(a); //abs라는 메서드를 호출 
		//abs라는 곳에 a라는 저장공간에 저장된 값을 들고 
		System.out.println(a + "의 절댓값은 "+result+"이다.");
		System.out.println(10+"의 절댓값은"+abs(10)+"이다.");

	}
	static int abs(int x) {
		int y;
		if(x<0) {
			y=-x;
		}else {
			y=x;
		}
		return y; // y에 저장된 값을 들고 왔던 곳으로 가라
		//y에 저장된 값을 return int형을 return 한다고 abs 앞에 int
	}

}

//void는 return 반환값이 없음
// 