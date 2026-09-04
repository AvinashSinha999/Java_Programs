package J01_Java_Basic_Programs.Array_Programs;

public class MissingNumber_1 {
    public static void main(String[] args) {

        int[] arr = new int[99];
        int index = 0;

        for (int i = 1; i <= 100; i++) {
            if (i != 57) {
                arr[index++] = i;
            }
        }

        int expectedSum = 100 * 101 / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        int missing = expectedSum - actualSum;

        System.out.println("\nMissing Numbers : " + missing);

    }
}