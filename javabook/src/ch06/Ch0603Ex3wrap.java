package ch06;

public class Ch0603Ex3wrap {
	
	public static void main(String[] args) {
		//기본데이터형 > String.valueOf로 String 변환
		//String str = String.valueOf(i);
		// 기본데이터형 <= 랩퍼클래스.parse기본데이터형(String 객체) <= String
		// int Integer.parseInt(str)
		// double Double.parseDouble(string)
		
		int i = 3;
		int j=5;
		int k = -7;
		
		Integer intI = null;
		String str = null;
		String str33 = "33";
		String str55 = "55";
		
		intI = i; // wrapper 클래스 참조변수에 int i에 객체를 만들어서 주소값을 넣어라 // autoboxing
		
		// intI = new Integer(i);
		str = intI.toString();
		System.out.println(str);
		
//		str = new Integer(j).toString();
//		
//		System.out.println(str);
		
		//추천
		str = String.valueOf(k);
		System.out.println(str);
		i = Integer.valueOf(str33);
		System.out.println(i);
		
		j = Integer.parseInt(str55);
		System.out.println(j);
		
		
		
	}

}
