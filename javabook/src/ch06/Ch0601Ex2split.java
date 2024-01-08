package ch06;

public class Ch0601Ex2split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sData = "123|홍길동|hong@gmail.com|1234-1234|";
	    String[] sArr = sData.split("\\|",-1);
	    
	    for(int i=0;i<sArr.length;i++) {
	    	System.out.println(i+"=> ["+sArr[i]+"]");
	    }
	}

}

