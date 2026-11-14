package J01_Java_Basic_Programs.String_Programs;

public class Reverse_String_7 {
    public static void main(String[] args) {

        String input = "I Love Java";

        System.out.println("\nInput is : " + input);

        String[] words = input.split(" ");

        System.out.print("\nOutput is : ");

        for (int i = 0; i < words.length; i++) {
            char[] arr = words[i].toCharArray();
            for (int j = arr.length - 1; j >= 0; j--) {
                System.out.print(arr[j]);
            }
            System.out.print(" ");
        }
        System.out.println();
    }
}

/*

    ------------------------------ OUTPUT ------------------------------

    Input is : I Love Java

    Output is : I evoL avaJ

*/