package J01_Java_Basic_Programs.String_Programs;

import java.util.Scanner;

public class Reverse_String_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nInput the String : ");
        String name = sc.next();

        //=========================================== WITHOUT ARRAY ===========================================

        System.out.print("\nOutput String is : ");

        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }

        System.out.println();

        //=========================================== CHARACTER ARRAY ===========================================

/*

        char[] arr = name.toCharArray();

        System.out.print("\nOutput String is : ");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }

        System.out.println();

 */

        //=========================================== STRING BUILDER ===========================================

/*

        StringBuilder n1 = new StringBuilder(name);

        n1.reverse();

        System.out.println();

        System.out.println("Output String is : "+n1);

*/

        //=========================================== STRING BUFFER ===========================================

/*

        StringBuffer n2 = new StringBuffer(name);

        n2.reverse();

        System.out.println();

        System.out.println("Output String is : "+n2);

 */

    }
}

/*

    ------------------------------ OUTPUT ------------------------------

    Input the String : azam

    Output String is : maza

*/