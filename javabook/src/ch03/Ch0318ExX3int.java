package ch03;

public class Ch0318ExX3int {

	public static void main(String[] args) {
		int[] a = {85, 90, 75, 100, 95};
		int tot = 0;
		double avg;
		int i;
		
		for(i=0;i<a.length;i++) {
			tot+=a[i];
		}
		avg = (double) tot / a.length;
		
		System.out.println("총합 = " + tot);
		System.out.println("평균 = " + avg);
		
	}

}
