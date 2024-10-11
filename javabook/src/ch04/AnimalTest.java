package ch04;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Animal(true,3,"코뿔소");
		if(a1.getLive()) {			
			System.out.printf("%s가 생존했습니다.\n", a1.getName());
		}else {
			System.out.printf("%s가 사망했습니다.\n", a1.getName());
			
		}
		
		a1.setName("펭귄");
		
		if(a1.getLive()) {			
			System.out.printf("%s이 생존했습니다.\n", a1.getName());
		}else {
			System.out.printf("%s이 사망했습니다.\n", a1.getName());
			
		}

	}

}
