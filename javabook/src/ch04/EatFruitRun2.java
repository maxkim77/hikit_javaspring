package ch04;

public class EatFruitRun2 {

	public static void main(String[] args) {
	     /*메서드만 잇기때문에 문맥적으로 인터페이스*/
		/*다형성을 활용한 코드입니다.*/
		/*설계 사상을 구현하기 위해서*/
		/*낮은 결합도를 유지하기위해서*/
        EatFruit2 eatFruit = new EatApple2();
        eatFruit.wash();
        eatFruit.cut();  
        eatFruit.eat();
        eatFruit.finish();

        EatFruit2 eatFruit1 = new EatTomato2();
        eatFruit1.wash();
        eatFruit1.eat();
        eatFruit1.finish();
	}
}
