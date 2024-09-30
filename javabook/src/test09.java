import java.util.Scanner;
public class test09 {
	public static void main(String[] args) {
		int a,b;
		int min, max;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("두 숫자를 입력해주세요");
		a = sc.nextInt();
		b = sc.nextInt();
		
		sc.close();
		if(a>b) {
			min = b;
			max = a;
		}else {
			min = a;
			max = b;
		}
		
		for(int i=min;i<=max;i++) {
			if(i%3==0) {
				sum+=i;
			}
		}
		System.out.println("3의배수의합 : "+ sum);
		
	}
}
