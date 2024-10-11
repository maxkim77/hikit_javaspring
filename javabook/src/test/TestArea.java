package test;
public class TestArea {

    public static void main(String[] args) {
        Triangle tri01 = new Triangle();

        tri01.setBase(4);
        tri01.setHeight(5);
        tri01.calcArea();
//        System.out.println("밑변 : " + tri01.getBase() + " 높이 : " + tri01.getHeight() + " 넓이 : " + tri01.area());
        System.out.printf("밑변 : %d 높이 : %d 넓이 : %.1f\n", tri01.getBase(), tri01.getHeight(), tri01.getArea());

        Triangle tri02 = new Triangle();
        tri02.setBase(3);
        tri02.setHeight(9);
        tri02.calcArea();
        System.out.printf("밑변 : %d 높이 : %d 넓이 : %.1f\n", tri02.getBase(), tri02.getHeight(), tri02.getArea());
        
        Rectangule rec03 = new Rectangule();
        rec03.setBase(3);
        rec03.setHeight(9);
        rec03.calcArea();
        System.out.printf("밑변 : %d 높이 : %d 넓이 : %.1f\n", rec03.getBase(), rec03.getHeight(), rec03.getArea());
        /*
         * switch(i){
         * 
         * 
         * }
         * 
         * */
    }

}

