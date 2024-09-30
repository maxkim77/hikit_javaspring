package ch03;

public class Ch0311Ex4if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20, b= 10;
//		if(a>10) {
//			if(b>=0) {
//				b=1;
//			}
//			else {
//				b=-1;
//			}
//		}
//    if(a<=10) {
//    	;
//	}else if(b>=0) {
//			b=1;
//	}
//	else {
//		b=-1; 
//	}

    
    if(a>10 && b>=0)
    {
    	b =1;
    }  
    else if(a>10 && b<0)    
    {
    	b=-1;
    }
    
    
    System.out.printf("a : %d, b: %d\n",a,b);
	}
	
}
