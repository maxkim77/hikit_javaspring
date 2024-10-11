package test;
import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {
		int k;
		int e;
		int m;
		int sum;
		double avg;
		System.out.println("국영수를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		
		k = sc.nextInt();
		e = sc.nextInt();
		m = sc.nextInt();
		
		sum = k+e+m;
		avg = sum /3.;
		
		System.out.printf("%d %.2f", sum,avg);		
		sc.close();
	}

}
