package J01_Java_Basic_Programs.Array_Programs;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElements_1 {
    public static void main(String[] args) {

        int[] input = {10, 30, 30, 50, 80, 40, 60, 10, 90, 75};

        System.out.println("\nOriginal Array : " + Arrays.toString(input));

        Set<Integer> seen = new LinkedHashSet<>();
        Set<Integer> duplicates = new LinkedHashSet<>();

        for (int number : input) {
            if (!seen.add(number)) {
                duplicates.add(number);
            }
        }
        System.out.println("\nDuplicates Elements : " + duplicates);
        System.out.println("\nAfter Removing Duplicates : " + seen);
    }
}