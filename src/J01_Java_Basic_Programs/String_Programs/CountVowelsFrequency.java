package J01_Java_Basic_Programs.String_Programs;

import java.util.Scanner;

public class CountVowelsFrequency {
    public static void main(String[] args) {

        int a = 0, e = 0, i = 0, o = 0, u = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a string: ");
        String str = sc.nextLine();

        str = str.toLowerCase();

        for (int k = 0; k < str.length(); k++) {
            char ch = str.charAt(k);

            switch (ch) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
            }
        }

        System.out.println();

        System.out.println("a: " + a);
        System.out.println("e: " + e);
        System.out.println("i: " + i);
        System.out.println("o: " + o);
        System.out.println("u: " + u);

    }
}