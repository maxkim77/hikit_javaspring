package ch03;

public class Ch0305SubStr {

	public static void main(String[] args) {
		String str1 = "OK1234";
		System.out.println(str1.substring(1,4));
		String str2 = "20221124";
		System.out.println(str2.substring(0,4));
		System.out.println(str2.substring(4,8));
		System.out.println(str2.substring(4,str2.length()));
		
	}

}
