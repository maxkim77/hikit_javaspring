package ch04;

class Point03{
	
	//x랑 y는 외부에 노출을 안시킴 접근한정자를 사용하여 캡슐화
	
	private int x;
	private int y;
	
	//맴버변수 이름과 파라미터 변수 이름이 같을 경우 this를 붙인다.
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x=x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y=y;
	}	
}


public class Ch0401Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point03 pt01 = new Point03();
		pt01.setX(10);
		pt01.setY(20);
		//pt01.x=0; 못씀 private을 쓰고 있기때문에
		System.out.println("("+pt01.getX() + ","+pt01.getY()+")");
		
		Point03 pt02 = new Point03();
		pt02.setX(60);
		pt02.setY(70);
		System.out.println("("+pt02.getX()+","+pt02.getY()+")");
	}

}
