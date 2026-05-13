package J01_Java_Basic_Programs.String_Programs;

import java.util.Arrays;

public class MinimumCharacterReplacementInAStringArray {
    public static void main(String[] args) {

        String[] data = {"ab", "aab", "abb", "abab", "abaaaba"};
        int[] result = new int[data.length];

        for (int i = 0; i < data.length; i++) {

            String input = data[i];
            int count = 0;
            int index = 1;

            while (index < input.length()) {
                if (input.charAt(index) == input.charAt(index - 1)) {
                    count++;                                            // Replacement Required
                    index = index + 2;
                } else {
                    index++;
                }
            }

            result[i] = count;

        }

        System.out.println(Arrays.toString(result));

    }
}