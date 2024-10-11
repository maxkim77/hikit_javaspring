package test;

public class test31power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long res;
		res = my_power(2,10);
		System.out.printf("%d\n",res);
	}
	static long my_power(int a, int b) {
		long pow = 1L;
		
		for(int i = 0;i<b;i++){
			pow *=a;			
		}
		return pow;
	}

}
