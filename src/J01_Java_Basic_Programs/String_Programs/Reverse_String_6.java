package J01_Java_Basic_Programs.String_Programs;

public class Reverse_String_6 {
    public static void main(String[] args) {

        String input = "abc123";

        System.out.println("\nInput String : " + input);

        String letters = "";
        String digits = "";

        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {

                letters = ch + letters;

            } else if (Character.isDigit(ch)) {

                digits = ch + digits;
            }
        }

        System.out.println("\nOutput String : " + letters + digits);

    }
}

/*

    ------------------------------ OUTPUT ------------------------------

    Input String : abc123

    Output String : cba321

*/