package ch04;

public class useSubject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject s1= new Subject(90,95,100);
		
		s1.cmpSum();
		s1.cmpAvg();
		System.out.println("총합"+s1.getSum());
		System.out.println("평균"+s1.getAvg());
		
		Subject s2= new Subject(100,100,100);
		
		s2.cmpSum();
		s2.cmpAvg();
		System.out.println("총합"+s2.getSum());
		System.out.println("평균"+s2.getAvg());

	}

}
