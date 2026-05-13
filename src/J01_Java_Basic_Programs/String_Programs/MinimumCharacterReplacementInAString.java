package J01_Java_Basic_Programs.String_Programs;

public class MinimumCharacterReplacementInAString {
    public static void main(String[] args) {

        String input = "abbbba";
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

        System.out.println("\n" + count + " time" + (count > 1 ? "s " : " ") + "Character Replacement Required");

    }
}