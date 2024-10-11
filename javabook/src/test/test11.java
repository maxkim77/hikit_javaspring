package test;
import java.util.Scanner;
public class test11 {

	public static void main(String[] args) {
		
		//0이 입력될때까지 합을 더함
		// 변수선언
		// 입력 while-do 문
		// 종료후 합산
		int sum=0;
		int input;
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		do {	
			input = sc.nextInt();
			sum+=input;
	     }while(input!=0);
		 
		 System.out.println(sum);
		 sc.close();
	}

}
