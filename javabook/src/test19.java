import java.util.Scanner;

public class test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i,j;
//		int sum = 0;
//		double avg = 0;
//		int student[][] = new int[3][5];
//		
//		Scanner sc =  new Scanner(System.in);
//		
//		for(i=0;i<3;i++) {
//			System.out.println("학번입력");
//			student[i][0]=sc.nextInt();
//			System.out.println("성적입력");
//			for(j=1;j<5;j++) {
//				student[i][j]=sc.nextInt();
//			}
//		}
//		
//		for(i=0;i<3;i++) {
//			sum=0;
//			avg = 0;
//			
//			for(j=1;j<5;j++) {
//				sum=sum+student[i][j];
//				avg = sum * 0.25;
//
//			}
//
//			System.out.println("학번"+student[i][0]);
//			System.out.println("총점"+sum);
//			System.out.println("평균"+avg);
//			System.out.println();
//			
//		}
		
		int[][] score = new int[3][4];
		int tot=0;
		double avg;
		int i,j;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<3;i++) {
			System.out.printf("%d번째 학생의 4과목 점수(int) 입력 =>",i+1);
			for(j=0;j<score[i].length;j++)
			{
				score[i][j]=sc.nextInt();
			}
		}
		sc.close();
		for(i=0;i<3;i++) {
			tot=0;
			for(int data: score[i]) {
				tot +=data;
			}
			avg=(double) tot / score[i].length;
			System.out.printf("%d번째 학생의총점=%d 평균 = %.1f\n",i+1,tot,avg);
		}
		

	}

}
