import java.lang.reflect.Array;
import java.util.ArrayList;

public class DivideArrayElements {
    public static void divideArrayElements(int[] array, int divisor) {
        try {
            int length = array.length;
            int[] result = new int[length];
            for (int i = 0; i < length; i++) {
                result[i] = array[i] / divisor;
                System.out.println(result[i]);
            }
        }
        catch (ArithmeticException e) {
            System.out.println("You can't divide by 0!");
        }
    }

    public static void main(String[] args) {
        divideArrayElements(new int[]{1, 2, 3}, 2);
    }
}
