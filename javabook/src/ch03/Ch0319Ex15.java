package ch03;

public class Ch0319Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=20;
		int res;
		
		res = add(a,b);
		System.out.printf("result : %d\n",res);
		
		res = add(3,5);
		System.out.printf("result : %d\n",res);
	}
	static int add(int x, int y) {
		int temp;
		temp = x+y;
		return temp;
	}
	//return 하는 자료형은 한개만 가능
    // 메서드 타입은 같아야함
}
