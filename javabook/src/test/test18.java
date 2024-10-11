package test;
import java.util.Scanner;
public class test18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score[] = new int[4];
		int sum = 0;
		double avg = 0;
		int i;
		
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("4과목의 점수입력");
		for(i=0;i<score.length;i++) {
			score[i] = sc.nextInt();
		}
		sc.close();
		for(int data: score)
		{
			sum+= data;
		}	
		avg = (double) sum/score.length;
		System.out.println(sum);
		System.out.print(avg);
	}

}
