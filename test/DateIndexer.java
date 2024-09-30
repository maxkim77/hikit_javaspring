public class DateIndexer {

    private static int[] dataStore = new int[108];

    public static int calculateIndex(int date) {
        int section = date % 10;
        int month = (date / 10) % 100;
        int year = (date / 1000) % 10;

        int yearOffset = (year - 4) * 36;

        int index = yearOffset + (month - 1) * 3 + (section - 1);

        return index;
    }

    public static void storeData(int date, int data) {
        int index = calculateIndex(date);
        if (index < dataStore.length) {
            dataStore[index] = data;
        } else {
            System.out.println("Index out of bounds");
        }
    }

    public static int getData(int date) {
        int index = calculateIndex(date);
        if (index < dataStore.length) {
            return dataStore[index];
        } else {
            System.out.println("Index out of bounds");
            return -1;
        }
    }

    public static void main(String[] args) {
        int date1 = 2024011;
        int date2 = 2025012;
        int date3 = 2026013;
        int date4 = 2026123;

        storeData(date1, 100);
        storeData(date2, 200);
        storeData(date3, 300);
        storeData(date4, 400);

        System.out.println("Stored Data at 2024011: " + getData(date1));
        System.out.println("Stored Data at 2025012: " + getData(date2));
        System.out.println("Stored Data at 2026013: " + getData(date3));
        System.out.println("Stored Data at 2026123: " + getData(date4));

        System.out.println("Index for 2024011: " + calculateIndex(date1));
        System.out.println("Index for 2025012: " + calculateIndex(date2));
        System.out.println("Index for 2026013: " + calculateIndex(date3));
        System.out.println("Index for 2026123: " + calculateIndex(date4));
    }
}
