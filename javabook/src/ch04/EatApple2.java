package ch04;

public class EatApple2 implements EatFruit2 {
	
	public EatApple2() {}
	
	@Override
	public void wash() {
		System.out.println("wash an Apple");
	}
	
	@Override
	public void cut() {
		System.out.println("cut an Apple");
	}
	
	@Override
	public void eat() {
		System.out.println("eat an Apple");
	}
	
	@Override
    public void finish() {  
        System.out.println("finish\n");
    }
}
