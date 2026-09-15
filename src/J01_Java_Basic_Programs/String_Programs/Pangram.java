package J01_Java_Basic_Programs.String_Programs;

public class Pangram {
    public static void main(String[] args) {

        String input = "The quick brown fox jumps over the lazy dog";

        input = input.toLowerCase();

        System.out.println("\nInput String is : " + input);

        boolean result = checkPangram(input);

        if (result) {
            System.out.println("\nIt's a Pangram");
        } else {
            System.out.println("\nIt's not a Pangram");
        }
    }

    private static boolean checkPangram(String input) {
        if (input.length() < 26) {
            return false;
        }
        for (int i = 'a'; i <= 'z'; i++) {
            if (input.indexOf(i) < 0) {
                return false;
            }
        }
        return true;
    }
}
