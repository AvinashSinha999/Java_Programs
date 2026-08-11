package J01_Java_Basic_Programs.String_Programs;

import java.util.LinkedHashMap;

public class FrequencyOfSpecialCharacter {
    public static void main(String[] args) {

        String input = "abc#@#^@";

        LinkedHashMap<Character, Integer> frequencyMap = new LinkedHashMap<Character, Integer>();

        char[] charArray = input.toCharArray();

        for (char specialChar : charArray) {
            if (!((specialChar >= 'a' && specialChar <= 'z') ||
                    (specialChar >= 'A' && specialChar <= 'Z') ||
                    (specialChar >= '0' && specialChar <= '9') ||
                    (specialChar == ' '))) {
                if (frequencyMap.containsKey(specialChar)) {
                    frequencyMap.put(specialChar, frequencyMap.get(specialChar) + 1);
                } else {
                    frequencyMap.put(specialChar, 1);
                }
            }
        }
        for (char specialChar : frequencyMap.keySet()) {
            System.out.println(specialChar + " = " + frequencyMap.get(specialChar));
        }
    }
}