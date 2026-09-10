package J01_Java_Basic_Programs.Array_Programs;

import java.util.Arrays;

public class MoveAllZerosAtEnd {
    public static void main(String[] args) {

        int[] numbers = {1, 0, 2, 0, 3, 0};

        int putNonZerosValueHere = 0;
        int temp;

        for (int current = 0; current < numbers.length; current++) {
            if (numbers[current] != 0) {
                temp = numbers[putNonZerosValueHere];
                numbers[putNonZerosValueHere] = numbers[current];
                numbers[current] = temp;
                putNonZerosValueHere++;
            }
        }

        System.out.println("\nAll Zeros at End : " + Arrays.toString(numbers));

    }
}