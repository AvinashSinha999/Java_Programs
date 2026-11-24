package J01_Java_Basic_Programs.String_Programs;

public class Reverse_String_8 {
    public static void main(String[] args) {

        String input = "Java";

        char[] charArray = input.toCharArray();

        System.out.println("\nInput String : " + new String(charArray));

        int left = 0;
        int right = charArray.length - 1;
        char temp;

        temp = charArray[left];
        charArray[left] = charArray[right];
        charArray[right] = temp;

        System.out.println("\nOriginal String : " + new String(charArray));

    }
}