package J01_Java_Basic_Programs.Number_Programs;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the Number : ");
        int num = sc.nextInt();
        int temp = 0;

        for (int i = 1; i <= (num / 2); i++) {
            if (num % i == 0) {
                temp += i;
            }

        }
        if (num == temp) {
            System.out.println("\n" + num + " : is a Perfect Number.");
        } else {
            System.out.println("\n" + num + ": is not a Perfect Number.");
        }

    }
}