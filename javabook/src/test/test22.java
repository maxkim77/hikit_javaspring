package test;

public class test22 {

	public static void main(String[] args) {
		
		int[] arr = {69,10,30,2,16,8,31,22};
		
		System.out.print("정렬할 원소 : ");
		
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
		System.out.println();
		System.out.println("<<<<<<<< 버블정렬수행 >>>>>>>>");
		for(int i=0;i<arr.length-1;i++) {
			System.out.printf("%d 단계>> \n",i+1);
			System.out.print("\t");
			for(int k=0;k<arr.length;k++) {		
				System.out.printf("%3d",arr[k]);
			}
			System.out.println();
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				System.out.print("\t");
				for(int k=0;k<arr.length;k++) {		
					System.out.printf("%3d",arr[k]);
				}
				System.out.println();
			}
		}

	}
}
