import java.util.Scanner;

public class test13 {

	public static void main(String[] args) {
		char input;
		int answer = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("성인이나요(y/n)");
		do {
			input = sc.next().charAt(0);
		}while(input!='y'&&input!='n');
		if(input=='y') {
			answer=2000;
		}else {
			answer=1000;
		}
		System.out.println("입장료는 "+answer+"원 입니다.");
		sc.close();
	}

}
