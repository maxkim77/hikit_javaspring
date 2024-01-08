package ch04;

public class Stringans {

    public static void main(String[] args) {
        String ans;
        ans = "y";
        check(ans);
        ans = "n";
        check(ans);
        ans = "a";
        check(ans);
        ans = null;
        check(ans);
    }

    public static void check(String ans) {
        if ("y".equals(ans)) {
            System.out.println("OK");
        } else if ("n".equals(ans)) {
            System.out.println("good");
        } else {
            System.out.println("다시 입력하세요");
        }
    }
}
