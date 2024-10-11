package test;

public class test29doubleNum {
	public static void main(String[] args) {
		int a = 16, b=4;
		if(doubleNum(a,b)) {
			System.out.printf("%d는 %d의 배수입니다. \n", a, b);
		}else {
			System.out.printf("%d는 %d의 배수가 아닙니다. \n", a, b);
		}
	}
	static boolean doubleNum(int a, int b) {
		boolean res;
		if(a%b==0) {
			res =true;
		}else {
			res = false;
		}
		return res;
	}

}
