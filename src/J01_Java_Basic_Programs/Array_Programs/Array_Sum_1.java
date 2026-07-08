package J01_Java_Basic_Programs.Array_Programs;

public class Array_Sum_1 {
    public static void main(String[] args) {

        int[] numbers = {12, 55, 26, 86};
        int sum = 0;

        for (int i = 0; i <= numbers.length - 1; i++) {
            sum += numbers[i];
        }

        System.out.println("\nSum of all elements are : " + sum);

    }
}