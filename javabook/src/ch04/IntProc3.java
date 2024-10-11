package ch04;

public class IntProc3 extends IntProc {

	private int z;
	
	public IntProc3() {
		this(0,0,0);
	}	
	public IntProc3(int x, int y, int z) {

		super(x,y);
		this.z=z;
	}

	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public int getMax() {
		int maxXY=super.getMax();
		return (maxXY>z) ? maxXY : z;
	}
	

}
