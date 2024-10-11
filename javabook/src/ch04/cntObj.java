package ch04;

public class cntObj {

	public static int cnt;
	
	private int index;
	
	public cntObj() {
		cnt++;
		this.index=cnt;
	}

	public int getObjIndex() {
		return index;
	}
	
	public static int getCnt() {
		return 	cnt;
	}

	
}
