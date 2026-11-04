package J01_Java_Basic_Programs.String_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_String_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nUser Input the value : ");
        String str = sc.next();

        char[] charArray = str.toCharArray();

        System.out.println("\nCurrent Order of the String is : " + Arrays.toString(charArray));

        //=========================================== TWO POINTER APPROACH ===========================================

        int left = 0;
        int right = charArray.length - 1;
        char temp;

        while (left < right) {
            temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        System.out.println("\nReverse Order of the String is : " + Arrays.toString(charArray));

    }
}

/*

    ------------------------------ OUTPUT ------------------------------

    User Input the value : Hello

    Current Order of the String is : [H, e, l, l, o]

    Reverse Order of the String is : [o, l, l, e, H]

*/