package test;

public class test21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int arr[][] = new int[3][3];
		int count = 1;
		
		

		for(i=0;i<3;i++) {
			for(j=0;j<3-i;j++) {
				arr[i][j]=count++;
			}
		}
		for(i=0;i<3;i++) {
			System.out.print("\t");
			for(j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}		
		

	}

}
