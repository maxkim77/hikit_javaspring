package ch03;

public class Ch0302Ex2 {
	public static void main(String[] args) {
		byte num1 = '0';
		int result;
		
		short char1 = '}';
		char char2  = 66;
		char char3 = '태';
		long num2 = 9876543210L;
		long num3 = 123123123;
		// int inum = num3;
		//int형이 long형으로 자동으로 형변환이 된다.
		System.out.printf("num1 숫자 : %d \n", num1);
		System.out.printf("num1 문자 : %c \n", num1);
		System.out.printf("char1 숫자 : %d \n", char1);
		System.out.printf("char2 문자 : %c \n", char2);
		System.out.printf("char3 문자 : %c \n", char3);
		System.out.printf("num2 숫자 : %d \n", num2);
		System.out.printf("num3 숫자 : %d \n", num3);
		
		result = num1+30;
		System.out.println("num1+30 = " + result);
		
	}

}
