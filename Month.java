public class Month {
    public static void main(String[] args) {
        int monthNumber = 12;
        printNumberOfDays(monthNumber);
    }

    public static void printNumberOfDays(int monthNumber) {
        int year = 2023;
        int numberOfDays;
        switch (monthNumber) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numberOfDays = 31;
                break;
            case 2:
                numberOfDays = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numberOfDays = 30;
                break;
            default:
                System.out.println("Wrong month number!");
                return;
        }
        System.out.println("Number of days in current month: " + numberOfDays);
    }
}


