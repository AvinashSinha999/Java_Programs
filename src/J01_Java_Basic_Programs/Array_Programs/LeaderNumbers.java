package J01_Java_Basic_Programs.Array_Programs;

public class LeaderNumbers {
    public static void main(String[] args) {

        int[] numbers = {16, 17, 4, 3, 5, 2};

        int length = numbers.length;

        int maxRight = numbers[length - 1];

        System.out.print(maxRight + " ");

        for (int i = numbers.length - 2; i >= 0; i--) {
            if (numbers[i] > maxRight) {
                maxRight = numbers[i];
                System.out.print(maxRight + " ");
            }
        }
    }
}