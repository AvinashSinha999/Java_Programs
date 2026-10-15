package J01_Java_Basic_Programs.String_Programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacters_1 {
    public static void main(String[] args) {

        String input = "programming";

        System.out.println("\nOriginal String : " + input);

        Set<Character> seen = new LinkedHashSet<>();
        Set<Character> duplicates = new LinkedHashSet<>();

        for (char ch : input.toCharArray()) {
            if (!seen.add(ch)) {
                duplicates.add(ch);
            }
        }

        StringBuilder uniqueString = new StringBuilder();
        for (char ch : seen) {
            uniqueString.append(ch);
        }

        System.out.println("\nDuplicate Characters : " + duplicates);
        System.out.println("\nAfter Removing Duplicates : " + uniqueString);
    }
}