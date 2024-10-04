

class Animal {
    void sound() {
        System.out.println("animal");
        smell();
    }
    void smell() {
    	System.out.println("abc");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("bark");
        super.sound(); // 부모 클래스의 sound() 호출
    }
    void smell() {
    	System.out.println("ree");
    }
}

public class test32 {
    public static void main(String[] args) {
        Dog a = new Dog();
        a.sound(); // Animal의 sound() 메서드 호출
    }
}

//public class test32 {
//    public static void main(String[] args) {
//        A b = new B();
//        b.paint();
//        b.draw();
//    }
//}
//
//class A {
//    public void paint() {
//        System.out.print("A");
//        draw();
//    }
//
//    public void draw() {
//        System.out.print("B");
//        draw();
//    }
//}
//
//class B extends A {
//    public void paint() {
//        super.draw();
//        System.out.print("C");
//        this.draw();
//    }
//
//    public void draw() {
//        System.out.print("D");
//    }
//}
//
