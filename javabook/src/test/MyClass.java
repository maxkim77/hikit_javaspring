package test;
class ClassA {  
    public void prtData() {
        System.out.println("ClassA의 메서드입니다.");

    }
}

public class MyClass extends ClassA {  

   public int num1; 

   public MyClass() {  
       num1 = 10;
   }

   public void prtNum1() {
       System.out.println(num1);
   }

   public static void main(String[] args) { 
       MyClass mc = new MyClass();
       mc.prtNum1();
       mc.prtData();
  } 

}