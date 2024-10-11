package ch04;

public class Ch0404Ex6abs {
	public static void main(String[] args) {
		float f = -2.5f;
		System.out.println(f + "의 절대값은" + Math.abs(f));
		
		double d = -3.4f;
		System.out.println(d + "의 절대값은" + Math.abs(d));
		
		int i = -100;
		System.out.println(i + "의 절댓값은" + Math.abs(i));
		
		long l = -200L;
		System.out.println(l + "의 절댓값은" + Math.abs(l));
	}
}
// abs 오버로딩 지원됨