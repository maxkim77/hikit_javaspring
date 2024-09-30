package ch03;

public class Ch0301Ex1 {

	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 20;
		int result = num1 + num2;
		
		System.out.println(num1+" + " + num2 + " = " + result);
		System.out.printf("%d + %d = %d", num1, num2, result);
		
		System.out.println();
		// 이름을 출력한 후 줄이 바뀌지 않는다.
		System.out.print("이름 : ");
		// 이름 뒤에 연속해서 홍길동을 출력한 후 줄이 바뀐다.
		System.out.println("홍길동");
		// 직업을 출력한 %s 위치에 교수를 출력한 후 줄이 바뀌지 않는다.
		System.out.printf("직업 : %s ", "교수");
		
		short sh = 32767;
		int in0 = -2147483648;
		int in9 = 2147483647;
		long ln = 123451234512345L;
		
		System.out.printf("short형 최댓값 출력 : %d\n",sh);
		System.out.printf("int형 최솟값 출력 : %d\n",in0);
		System.out.printf("int형 최댓값 출력 : %d\n",in9);
		System.out.printf("long형 최댓값 출력 : %d\n",ln);
		System.out.printf("short형 최댓값 출력 : %d\n",++sh);
		System.out.printf("int형 최솟값 출력 : %d\n",--in0);
		System.out.printf("int형 최댓값 출력 : %d\n",++in9);	
		
	}

}
