package ch04;

public class useCntObj {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		cntObj co1 = new cntObj();
		cntObj co2 = new cntObj();
		cntObj co3 = new cntObj();	

		
		System.out.println("co3 객체 인덱스 " + co3.getObjIndex());		
		System.out.println("co2 객체 인덱스 " + co2.getObjIndex());
		System.out.println("co1 객체 인덱스 " + co1.getObjIndex());
		System.out.println("총 객체 수" + cntObj.cnt);

	}

}
