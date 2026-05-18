package J01_Java_Basic_Programs.Number_Programs;

import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the Number : ");
        int num = sc.nextInt();
        int sqr = num * num;
        int temp = 0;

        while (sqr > 0) {
            int rem = sqr % 10;
            temp = temp + rem;
            sqr /= 10;
        }
        if (temp == num) {
            System.out.println("\n" + num + " : is a Neon Number.");
        } else {
            System.out.println("\n" + num + " : is not a Neon Number.");
        }

    }
}