package J01_Java_Basic_Programs.Array_Programs;

public class MissingNumber_3 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 4, 5, 6};
        int missingNumber = 0;

        for (int number : numbers) {
            missingNumber = missingNumber ^ number;
        }

        for (int i = 0; i <= 6; i++) {
            missingNumber = missingNumber ^ i;
        }

        System.out.println("\nThe Missing Number is : " + missingNumber);

    }
}