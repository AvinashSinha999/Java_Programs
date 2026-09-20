package J01_Java_Basic_Programs.String_Programs;

import java.util.HashSet;

public class PangramWithCollectionSet {
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
        HashSet<Character> characterHashSet = new HashSet<Character>();
        char[] inputChar = input.toLowerCase().toCharArray();
        for (char c : inputChar) {
            if (Character.isLetter(c)) {
                characterHashSet.add(c);
            }
        }
        if (characterHashSet.size() == 26) {
            return true;
        }
        return false;
    }
}