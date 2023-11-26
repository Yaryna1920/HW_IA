public class Month {
    public static void main(String[] args) {
        int monthNumber = 11;
        printNumberOfDays(monthNumber);
    }

    public static void printNumberOfDays(int monthNumber) {
        int year = 2023;
        int numberOfDays;
        switch (monthNumber) {
            case 1:
                numberOfDays = 31;
                break;
            case 2:
                numberOfDays = 28;
                break;
            case 3:
                numberOfDays = 31;
                break;
            case 4:
                numberOfDays = 30;
                break;
            case 5:
                numberOfDays = 31;
                break;
            case 6:
                numberOfDays = 30;
                break;
            case 7:
                numberOfDays = 31;
                break;
            case 8:
                numberOfDays = 31;
                break;
            case 9:
                numberOfDays = 30;
                break;
            case 10:
                numberOfDays = 31;
                break;
            case 11:
                numberOfDays = 30;
                break;
            case 12:
                numberOfDays = 31;
                break;
            default:
                System.out.println("Wrong month number!");
                return;
        }

        System.out.println("Number of days in current month: " + numberOfDays);
    }
}


