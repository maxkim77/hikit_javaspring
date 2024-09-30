public class test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int i = 1;
//		int sum = 0;
		
//		do {
//			if(i % 4 == 0) {
//				i++;  // i 값을 증가시켜 무한루프를 방지
//				continue;				
//			} else {
//				sum += i;
//			}
//			
//			if(sum >= 1000) {
//				break;
//			}
//			i++;
//			
//		} while(i < 101);
		
		int i, isum=0;
		for(i=1;i <=100;i++) {
			if(isum>=1000) {
				break;
			}else if(i%4==0) {
				continue;
			}
			isum+=i;
			
		}
		
		
		System.out.println(isum);

	}

}
