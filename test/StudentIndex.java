public class StudentIndex {
    public static int findIndex(int studentNumber) {
        int grade = studentNumber / 1000;  
        int classNum = (studentNumber % 1000) / 100; 
        int number = studentNumber % 100; 

        int index = (grade - 1)* 200 + ((classNum - 1) % 5) * 5 + ((number - 1) % 40);

        return index;
    }

    public static void main(String[] args) {
        int studentNumber = 3101;
        int index = findIndex(studentNumber);
        
        System.out.println( studentNumber + " : " + index);
    }
}
