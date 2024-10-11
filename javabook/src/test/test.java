package test;
import java.util.*;

public class test {

	private static final Boolean True = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {1,2,3};
		int[] a2 = {1,2,3};
		Boolean a3 = True;
		Boolean a4 = True;
		
		if(a1==a2) {
			System.out.println("true");
		}else {
			System.out.println("false");			
		}
		
		if(a1[0]==a2[0]) {
			
			System.out.println("true");
		}else {
			
			System.out.println("false");			
		}
		
		if(Arrays.equals(a2,a1)) {
			System.out.println("true");		
		}else {
			
			System.out.println("false");			
		}
		
		if(a3==a4) {
			
			System.out.println("true");		
		}

	}

}
