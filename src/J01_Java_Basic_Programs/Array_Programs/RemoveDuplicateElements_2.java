package J01_Java_Basic_Programs.Array_Programs;

public class RemoveDuplicateElements_2 {
    public static void main(String[] args) {

        int[] input = {10, 30, 30, 50, 80, 40, 60, 10, 90, 75};
        int n = input.length;

        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            for (int k = 0; k < j; k++) {
                if (input[i] == temp[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[j] = input[i];
                j++;
            }
        }
        System.out.print("\nAfter Removing Duplicates : ");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
    }
}