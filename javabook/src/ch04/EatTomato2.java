package ch04;

public class EatTomato2 implements EatFruit2 {
	
	public EatTomato2() {}
	
	@Override
	public void wash() {
		System.out.println("wash an Tomato");
	}
	
	@Override
	public void cut() {
	/*토마토에서는 cut() 메서드 제외*/
	}
	
	@Override
	public void eat() {
		System.out.println("eat an Tomato");
	}
	
	@Override
    public void finish() {  
        System.out.println("finish\n");
    }
}
