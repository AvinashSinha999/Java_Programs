package J01_Java_Basic_Programs.String_Programs;

public class RemoveDuplicateCharacters_2 {
    public static void main(String[] args) {

        String input = "programming";
        char[] chars = input.toCharArray();
        int n = chars.length;

        char[] temp = new char[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            for (int k = 0; k < j; k++) {
                if (chars[i] == temp[k]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[j] = chars[i];
                j++;
            }
        }

        System.out.print("\nAfter Removing Duplicate Characters : ");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i]);
        }
        System.out.println();
    }
}