package J01_Java_Basic_Programs.Array_Programs;

public class Array_Sum_2 {
    public static void main(String[] args) {

        int[] numbers = {12, 55, 26, 86};
        int sum = 0;

        for (int number : numbers) {

            sum = sum + number;
        }

        System.out.println("\nSum of all elements are : " + sum);

    }
}