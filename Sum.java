public class Sum {
    static int calculateSum(int number) {
        int sum = 0;
        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }

    static int calculateSum(String word1, String word2) {
        int sum = word1.length() + word2.length();
        return sum;
    }

    static boolean checkNumber(int inputNumber) {
        if (inputNumber > 0) {
            System.out.println("Number is more than 0");
            return true;
        } else {
            System.out.println("Number is NOT more than 0");
            return false;
        }
    }

    public static void main(String args[]) {
        int number = 123;
        System.out.println("The sum of digits: " + calculateSum(number));
        String word1 = "Java's";
        String word2 = "fun";
        System.out.println("The sum of word length of " + word1 + " and " + word2 + ": " + calculateSum(word1, word2));
        int inputNumber = 5;
        System.out.println("The result of input number checkup " + inputNumber + ": " + checkNumber(inputNumber));
    }
}