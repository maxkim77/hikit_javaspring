package ch04;

abstract class Shape12 {
	public double res=0;
	public abstract double area();
	// 메서드 선언
	// 실체가 없음 바디부가 없음
	// 한개라도 추상메서드를 가지면 클래스는 추상클래스가 된다.
	// abstract 미완성이다.
	
	// 도형을 구하는 공식에 따라 면적이 다르기 때문에, 
	// 면적을 구하는 메서드를 확정지을 수없다. 껍데기를 만든다.
	// 추상클래스가됨
	public void printArea() {
		System.out.println("면적은" + res + "이다.");
	}
}

class Cirlce12 extends Shape12 {

	// 메서드가 구체화된다.
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}
//	public int r=5;
//	@Override
//	public double area() {
//		res = r*r*Math.PI;
//		return res;
//	}
}


class Rectangle12 extends Shape12 {
	public int w = 10;
	public int h = 10;
	@Override
	public double area() {
		res = w*h;
		return res;
	}
}




class Triangle12 extends Shape12 {
	public int w = 10;
	public int h = 10;
	@Override
	public double area() {
		res = w*h*0.5;
		return res;
	}  
	
}





public class Ch0416Ex12 {
	// 메서드 정의 중괄호
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//upcasting 추상클래스의 변수 사용 가능
		Shape12 ref = null;
		ref = new Cirlce12();
		ref.area();
		ref.printArea();
		ref = new Rectangle12();
		ref.area();
		ref.printArea();
		ref= new Triangle12();
		ref.area();
		ref.printArea();
		

	}

}
