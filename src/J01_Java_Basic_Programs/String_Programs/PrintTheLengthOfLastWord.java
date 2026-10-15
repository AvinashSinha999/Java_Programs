package J01_Java_Basic_Programs.String_Programs;

public class PrintTheLengthOfLastWord {
    public static void main(String[] args) {

        int count = 0;
        String word = "     Hello     World     moon      ";

        System.out.println("\nBefore Trim the Word : " + word);

        //word = word.trim();

        System.out.println("\nAfter Trim the Word : " + word);

        char[] charArray = word.toCharArray();

        for (int i = charArray.length - 1; i >= 0; i--) {
            if (charArray[i] != ' ') {
                count++;
            } else {
                if (count > 0) {
                    System.out.println("\nLength of Last Word : " + count);
                    break;
                }
            }
        }
    }
}