package J01_Java_Basic_Programs.Number_Programs;

import java.util.Scanner;

public class Swap_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n------INPUT VALUES-------");

        System.out.print("\nInput of 'a' value is : ");
        int a = sc.nextInt();

        System.out.print("\nInput of 'b' value is : ");
        int b = sc.nextInt();

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("\n------OUTPUT VALUES------");

        System.out.println("\nOutput of 'a' value is : " + a);

        System.out.println("\nOutput of 'b' value is : " + b);

    }
}