package ch03;
import java.util.Scanner;

public class Ch0308Ex5Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		sc = new Scanner(System.in);
		
		int nYear = sc.nextInt();
		String str = sc.next();
		System.out.println("int 입력값 = " + nYear + " 스트링 입력값 = " + str);
		sc.close();
		
	}

}
