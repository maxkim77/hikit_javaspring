package ch04;

public class IntProcRun {
    public static void main(String[] args) {
        IntProc intProc = new IntProc(5, 8);
        System.out.printf("두 숫자의 최댓값은 %d입니다.%n", intProc.getMax());

        IntProc3 intProc1 = new IntProc3(1, 3, 6);
        System.out.printf("세 숫자의 최댓값은 %d입니다.%n", intProc1.getMax());

        IntProc intProc2 = new IntProc3(1, 2, 7);
        System.out.printf("세 숫자의 최댓값은 %d입니다.%n", intProc2.getMax());
    }
}
