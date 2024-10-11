package ch04;

class Shape {
	public double res = 0;
	public double area() {
		System.out.println("상위 클래스입니다.");
		return res;
	}
	// area 가 없으면 오버라이딩이 안됨.
	
}


class Circle extends Shape {
	public int r = 5;
	public double area() {
		res = r * r * Math.PI;
		return res;
	}
}

class Rectangle extends Shape{
	public int w = 10;
	public int h = 10;
	public double area() {
		res = w*h;
		return res;
	}
}

class Triangle extends Shape {
	public int w = 10;
	public int h = 10;
	public double area() {
		res=w*h*0.5;
		return res;
	};
}


public class Ch0415Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape ref = null;
		ref = new Circle();
		prtArea(ref);
		prtArea(new Circle());
		System.out.println("도형의 면적은" + ref.area());
	
		ref = new Rectangle();
		prtArea(ref);
		System.out.println("도형의 면적은" + ref.area());
		ref = new Triangle();
		prtArea(ref);
		System.out.println("도형의 면적은" + ref.area());
		
		Circle cc = new Circle();
	 System.out.println("도형의 면적은" + cc.area());
		Rectangle rt = new Rectangle();
		System.out.println("도형의 면적은" + rt.area());
		Triangle tr = new Triangle();
		System.out.println("도형의 면적은" + tr.area());

		
	}
	
	public static void prtArea(Shape sp) {
		System.out.println("도형의 면적은" + sp.area());
	}


}
