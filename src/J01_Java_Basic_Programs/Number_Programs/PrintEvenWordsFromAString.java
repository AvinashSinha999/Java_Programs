package J01_Java_Basic_Programs.Number_Programs;

public class PrintEvenWordsFromAString {
    public static void main(String[] args) {

        String input = "Sky is Blue and Vast";

        System.out.println("\nInput String : " + input);

        String[] dataArray = input.split(" ");

        for (String word : dataArray) {
            if (word.length() % 2 == 0) {
                System.out.print("\nEven Word is : " + word);
            }
        }
        System.out.println();
    }
}