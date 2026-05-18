package J01_Java_Basic_Programs.Number_Programs;

import java.util.Scanner;

public class OddAndEven_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number : ");
        int num = sc.nextInt();
        int temp = num;

        while (num > 1) {
            num = num - 2;
        }

        if (num == 0) {
            System.out.println("\n" + temp + " is an Even Number");
        } else {
            System.out.println("\n" + temp + " is an Odd Number");
        }

    }
}