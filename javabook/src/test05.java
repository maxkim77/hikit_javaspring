import java.util.Scanner;

public class test05 {

	public static void main(String[] args) {
		int m;
		int hh;
		int mm;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("시간을 입력해주세요");
		m = sc.nextInt();
		
		hh = m/60;
		mm = m%60;

		System.out.println(hh+"시간"+mm+"분");
				
		sc.close();
	}

}
