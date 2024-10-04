import java.util.Scanner;

public class test13 {

    public static void main(String[] args) {
        String input;
        int answer = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("성인이나요(Y/N)");
        do {
            input = sc.next();
        } while (!input.equals("Y") && !input.equals("N"));
        
       
        if (input.equals("Y")) {
            answer = 2000;
        } else {
            answer = 1000;
        }
        
        System.out.println("입장료는 " + answer + "원 입니다.");
        sc.close();
    }
}
