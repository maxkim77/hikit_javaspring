package test;
public class test25 {
    public static void main(String[] args) {
        // 2차원 배열 (각 행은 반, 학생, 점수를 의미)
        int[][] scores = {
            {1, 1, 290},
            {1, 7, 280},
            {9, 7, 270},
            {9, 9, 260}
        };

        // 반별 총점을 저장할 배열
        int class1Total = 0;
        int class9Total = 0;
        int overallTotal = 0;

        // 배열 순회하여 반별 총점과 전체 총점을 계산
        for (int i = 0; i < scores.length; i++) {
            int classNumber = scores[i][0];
            int score = scores[i][2]; // 점수는 세 번째 열에 있음

            overallTotal += score; // 전체 총점 계산

            // 반별 총점 계산
            if (classNumber == 1) {
                class1Total += score;
            } else if (classNumber == 9) {
                class9Total += score;
            }
        }

        // 결과 출력
        System.out.println("반 1의 총점: " + class1Total);
        System.out.println("반 9의 총점: " + class9Total);
        System.out.println("전체 총점: " + overallTotal);
    }
}
