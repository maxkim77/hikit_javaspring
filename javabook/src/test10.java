import java.util.Scanner;
public class test10 {
	public static void main(String[] args) {
		int a,b,i;
		int sum = 0;
		int min,max;
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("양의 두 정수를 입력하세요");
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a<b) {
			min = a;
			max = b;
		}else {
			min = b;
			max = a;
		}
		
		for(i=1;i<=min;i++) {
			sum=sum+max;
		}
		
		System.out.println(sum);
		
	}

}
