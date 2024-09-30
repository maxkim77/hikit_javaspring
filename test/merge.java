import java.io.*;

public class merge {
    public static void main(String[] args) {
        String oldMstFile = "C:\\Users\\HKIT\\Documents\\ITEDUJAVA\\test\\oldMst.txt"; 
        String trsFile = "C:\\Users\\HKIT\\Documents\\ITEDUJAVA\\test\\trs.txt";       

        try (BufferedReader oldMstReader = new BufferedReader(new FileReader(oldMstFile));
             BufferedReader trsReader = new BufferedReader(new FileReader(trsFile))) {

            String oldLine = null;
            String trsLine = null;
            System.out.println("newMst");

            oldLine = oldMstReader.readLine();
            trsLine = trsReader.readLine();

            while (true) {
                if (oldLine == null || trsLine == null) {
                    break; 
                }

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

            while (true) {
                if (oldLine == null) {
                    break;
                }
                System.out.println(oldLine);
                oldLine = oldMstReader.readLine();
            }

            while (true) {
                if (trsLine == null) {
                    break;
                }
                System.out.println(trsLine);
                trsLine = trsReader.readLine();
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
