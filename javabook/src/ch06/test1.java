package ch06;

public class test1 {

	/* 123, 123.3을 String 으로 변환하여 출력후 다시 원래 자료형으로 복귀한 다음
	 * 각각 1을 더하여 출력하기
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 123;
		double i1 = 12.3;
		
		String str;
		String str1;
		
		str = String.valueOf(i);
		str1 = String.valueOf(i1);
		
		System.out.println(str);
		System.out.println(str1);
		
		int i2;
		double i3;
	
		i2 = Integer.parseInt(str)+1;
		i3 = Double.parseDouble(str1)+1;
		
		System.out.println(i2);
		System.out.println(i3);
		
		Integer i12 = 127;
		Integer i13 = 127;

		if (i12 == i13) {
		    System.out.println("같음");
		} else {
		    System.out.println("다름");
		}
		Integer i10 = 128;
		Integer i11 = 128;

		if (i10.equals(i11)) {
		    System.out.println("값이 같음");
		} else {
		    System.out.println("값이 다름");
		}

		double d1 = 0.1 + 0.2;
		double d2 = 0.3;

		if (d1 == d2) {
		    System.out.println("값이 같음");
		} else {
		    System.out.println("값이 다름");
		}
		Double d3= 10 + 0.5;
		Double d4 =10.5;

		if (d3.equals(d4)) {
		    System.out.println("값이 같음");
		} else {
		    System.out.println("값이 다름");
		}
		
		Boolean b1 = true;
		Boolean b2 = true;
		if (b1 == b2) {
		    System.out.println("값이 같음");
		} else {
		    System.out.println("값이 다름");
		}
		
		Boolean b3 = new Boolean(true);
		Boolean b4 = new Boolean(true);

		if (b1 == b2) {
		    System.out.println("같음");
		} else {
		    System.out.println("다름");
		}

		if (b1.equals(b2)) {
		    System.out.println("값이 같음");
		} else {
		    System.out.println("값이 다름");
		}
		
		Character c1 = 'A';
		Character c2 = 'A';

		if (c1 == c2) {
		    System.out.println("참조가 같음");
		} else {
		    System.out.println("참조가 다름");
		}

		if (c1.equals(c2)) {
		    System.out.println("값이 같음");
		} else {
		    System.out.println("값이 다름");
		}
		Character c3 = 128;
		Character c4 = 128;

		if (c3 == c4) {
		    System.out.println("참조가 같음");
		} else {
		    System.out.println("참조가 다름");
		}



	}

}
