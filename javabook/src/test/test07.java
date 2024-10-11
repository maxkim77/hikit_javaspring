package test;
import java.util.Scanner;

public class test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int year;
		System.out.println("연도를 입력하세요");
		year = sc.nextInt();
		
		if((year%4==0 && year%100!=0) || year%400==0) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}
		sc.close();
		
		
//		int n4;
//		int n100;
//		int n400;
//		
//		n4 = nYear %4;
//		n100=nYear %100;
//		n400 = nYear %400;
		
	}

}
