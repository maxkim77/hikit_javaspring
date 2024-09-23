import java.io.*;

class Main {
    public static void main(String[] args) {
        // 파일 경로 설정 (절대 경로로 변경)
        String fileName = "C:\\Users\\HKIT\\Documents\\ITEDUJAVA\\test\\grouby.txt";
        int total = 0;  // 전체 총점
        int sum = 0;    // 각 반의 총점
        int prevClass = 0;  // 이전 반 번호
        int classNumber, seq, score;  // 반, 시퀀스, 점수
        int flag = 1;   // 첫 번째 줄인지 여부 확인

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            // 파일을 끝까지 읽을 때까지 반복
            while ((line = reader.readLine()) != null) {
                // 데이터를 '|'로 분리하여 클래스, 시퀀스, 점수를 추출
                String[] fields = line.split("\\|");
                classNumber = Integer.parseInt(fields[0]);
                score = Integer.parseInt(fields[2]);

                // 첫 번째 줄 처리
                if (flag == 1) {
                    prevClass = classNumber;
                    sum = score;
                    flag = 0;
                } else {
                    // 현재 반 번호와 이전 반 번호 비교
                    if (prevClass == classNumber) {
                        // 반 번호가 같으면 계속 합산
                        sum += score;
                    } else {
                        // 반 번호가 다르면 이전 반의 총점 출력
                        System.out.println(prevClass + "반 총점: " + sum);
                        total += sum;  // 전체 총점에 반별 총점을 더함
                        sum = score;   // 새로운 반의 첫 점수로 sum 초기화
                        prevClass = classNumber;  // 새로운 반으로 변경
                    }
                }
            }

            // 마지막 반의 총점 처리
            if (flag == 1) {  // 파일이 비어있지 않았을 경우만 처리
   
                System.out.println("No Data");
            } else {
                             System.out.println(prevClass + "반 총점: " + sum);
                total += sum;

                // 전체 총점 출력
                System.out.println("전체 총점: " + total);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
