
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PhoneNumberValidator {

    public boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "(\\+380)\\d{9}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);

        return matcher.matches();
    }

    public static void main(String[] args) {
        PhoneNumberValidator validator = new PhoneNumberValidator();

        String validPhoneNumber1 = "+380971234567";
        String validPhoneNumber2 = "+380661112233";
        String invalidPhoneNumber1 = "0971234567";
        String invalidPhoneNumber2 = "+3809123456789";

        System.out.println("Number is valid " + validPhoneNumber1 + ": " + validator.isValidPhoneNumber(validPhoneNumber1));
        System.out.println("Number is valid " + validPhoneNumber2 + ": " + validator.isValidPhoneNumber(validPhoneNumber2));
        System.out.println("Number is valid " + invalidPhoneNumber1 + ": " + validator.isValidPhoneNumber(invalidPhoneNumber1));
        System.out.println("Number is valid " + invalidPhoneNumber2 + ": " + validator.isValidPhoneNumber(invalidPhoneNumber2));
    }
}