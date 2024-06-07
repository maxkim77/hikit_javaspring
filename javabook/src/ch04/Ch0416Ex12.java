package ch04;

/*
 * 	메서드 선언
	실체가 없음 바디부가 없음
	한개라도 추상메서드를 가지면 클래스는 추상클래스가 된다.
	abstract 미완성이다.
	
	도형을 구하는 공식에 따라 면적이 다르기 때문에, 
	면적을 구하는 메서드를 확정지을 수없다. 껍데기를 만든다.
	추상클래스가됨
1. 공통된 속성과 메서드를 공유하기 위해
Shape12 클래스는 모든 도형이 가지는 공통적인 속성(res)과 메서드(printArea())를 정의하고 있습니다. 추상 클래스는 이러한 공통된 부분을 자식 클래스들에게 상속할 수 있도록 하고, 각 자식 클래스가 공통된 메서드를 재사용할 수 있게 합니다. 이를 통해 코드의 중복을 줄일 수 있습니다.
2. 구체적인 구현을 서브 클래스에서 강제하기 위해

 * */
abstract class Shape12 {
	public double res;
	abstract public double area();
	public void printArea(){
		System.out.println("면적은"+res+"입니다.");
	}
}

class Circle12 extends Shape12{

	public int r=10;
	@Override
	public double area() {
		res = r*r*Math.PI;
		return res;
	}
	
}

class Rectangle12 extends Shape12 {
	public int w=10;
	public int h=15;
	@Override
	public double area() {
		// TODO Auto-generated method stub
		res = w*h;
		return res;

	}
}


class Triangle12 extends Shape12 {
	public int w=10;
	public int h=15;
	@Override
	public double area() {
		// TODO Auto-generated method stub
		res = w*h * 0.5;
		return res;
	}
}

public class Ch0416Ex12 {
	// 메서드 정의 중괄호
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//upcasting 추상클래스의 변수 사용 가능
		Shape12 ref = null;
		ref = new Circle12();
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
