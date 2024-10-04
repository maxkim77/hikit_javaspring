
public class test28 {
	public static void main(String[] args) {
		double d;
		
		d=calc(10,'+',2);
		System.out.printf("%.2f %c %.2f = %.2f\n",(double)10, '+',(double)2,d);
		d = calc(10.5,'-',2.1);
		System.out.printf("%.2f %c %.2f = %.2f\n",10.5, '+',2.1,d);
	}
	
	static double calc(double x, char op, double z) {
		double dValue;
	
		if(op=='+') {
			dValue = x+z;
		}else if(op=='-') {
			dValue = x-z;
		}else {
			dValue = 0.;
		}
		return dValue;
	}
}
