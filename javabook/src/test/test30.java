package test;

public class test30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.printf("%d\n",sum(1,10));
		System.out.printf("%d\n",sum(3,1)+sum(5,7));

	}
	static int sum(int a, int b) {
		int res=0;
		int min, max;
		
		if(a>b) {
			min = b;
			max = a;
		}else {
			min = a;
			max = b;
		}
		
		for(int i=min;i<max+1;i++) {
			res+=i;
		}		
		return res;
		
	}

}
