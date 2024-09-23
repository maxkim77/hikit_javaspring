import java.io.*;

public class merge {
    public static void main(String[] args) {
        String oldMstFile = "C:\\Users\\HKIT\\Documents\\ITEDUJAVA\\test\\oldMst.txt"; 
        String trsFile = "C:\\Users\\HKIT\\Documents\\ITEDUJAVA\\test\\trs.txt";       
        int flag = 0;  

        try (BufferedReader oldMstReader = new BufferedReader(new FileReader(oldMstFile));
             BufferedReader trsReader = new BufferedReader(new FileReader(trsFile))) {

            String oldLine = null;
            String trsLine = null;
            System.out.println("newMst");

            while (true) {
                if (flag == 0) {
                    oldLine = oldMstReader.readLine();
                    trsLine = trsReader.readLine();
                    flag = 1;  
                }

                if (oldLine == null && trsLine == null) {
                    break; 
                }

                if (oldLine != null && trsLine != null) {
                    int oldKey = Integer.parseInt(oldLine.split("\\|")[0].trim());
                    int trsKey = Integer.parseInt(trsLine.split("\\|")[0].trim());

                    if (oldKey < trsKey) {
                        System.out.println(oldLine);
                        oldLine = oldMstReader.readLine();
                    } else if (oldKey > trsKey) {
                        System.out.println(trsLine);
                        trsLine = trsReader.readLine();
                    } else {
                        int oldValue = Integer.parseInt(oldLine.split("\\|")[1].trim());
                        int trsValue = Integer.parseInt(trsLine.split("\\|")[1].trim());
                        int newValue = oldValue + trsValue;

                        System.out.println(oldKey + "|" + newValue);

                        oldLine = oldMstReader.readLine();
                        trsLine = trsReader.readLine();
                    }
                }
            }

            while (oldLine != null) {
                System.out.println(oldLine);
                oldLine = oldMstReader.readLine();
            }

            while (trsLine != null) {
                System.out.println(trsLine);
                trsLine = trsReader.readLine();
            }

        } catch (IOException e) {
            System.err.println("error " + e.getMessage());
        }
    }
}
