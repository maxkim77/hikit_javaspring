
public class test23 {

	public static void main(String[] args) {
		
		int[] arr = {69,10,30,2,16,8,31,22};
		int i,j,k,minidx,temp;
		
		System.out.println("정렬할 원소 : ");
		
		for(k=0;k<8;k++) {
			System.out.print(arr[k]+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println("<<<<< 선택정렬 수행 >>>>>");
		System.out.println();
		System.out.println();
		for(i=0;i<7;i++) {
			minidx=i;
			for(j=i+1;j<8;j++) {
				if(arr[j]<arr[minidx]) {
					minidx=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[minidx];
			arr[minidx]=temp;
			System.out.printf("%d 단계:",i+1);
			for(k=0;k<8;k++) {
				System.out.print(arr[k]+" ");
			}
			System.out.println();
			
		}
	}
}
