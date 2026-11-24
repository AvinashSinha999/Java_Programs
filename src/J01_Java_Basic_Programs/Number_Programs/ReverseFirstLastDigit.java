package J01_Java_Basic_Programs.Number_Programs;

public class ReverseFirstLastDigit {
    public static void main(String[] args) {

        int number = 12345;

        System.out.println("\nOriginal Number: " + number);

        int original = number;

        int lastDigit = number % 10;
        int firstDigit = number;
        int divisor = 1;

        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
            divisor = divisor * 10;
        }

        int middle = (original % divisor) / 10;

        int result = (lastDigit * divisor) + (middle * 10) + firstDigit;

        System.out.println("\nReversed Number: " + result);

    }
}