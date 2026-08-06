package J01_Java_Basic_Programs.String_Programs;

import java.util.LinkedHashMap;

public class FrequencyOfCharacterInString {
    public static void main(String[] args) {

        String input = "Madam";
        input = input.toLowerCase();

        LinkedHashMap<Character, Integer> frequencyMap = new LinkedHashMap<Character, Integer>();

        char[] charArrayInput = input.toCharArray();

        for (char character : charArrayInput) {
            frequencyMap.put(character, frequencyMap.getOrDefault(character, 0) + 1);
        }

        for (char singleCharacter : frequencyMap.keySet()) {
            System.out.println(singleCharacter + " = " + frequencyMap.get(singleCharacter));
        }

    }
}