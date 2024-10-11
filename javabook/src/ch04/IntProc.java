package ch04;

public class IntProc {
	private int x = 0;
	private int y = 0;
	
	public IntProc() {
		this(0,0);
	}	
	public IntProc(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getMax() {
		return (x>y) ? x:y;
	}
	
}
