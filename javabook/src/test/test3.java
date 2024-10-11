package test;
import java.util.Scanner;

public class test3 {
	
	public static void main(String[] args) {
		int h, w;
		double answer;
		
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		
		answer = h * w / 2.;
		
		System.out.println(answer);
		sc.close(); // Good practice to close the scanner
	}
}
