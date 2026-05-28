package J01_Java_Basic_Programs.Number_Programs;

import java.util.Scanner;

public class PrimeNumberForLoop_2 {
    public static void main(String[] args) {

        int a = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the Number : ");
        int num = sc.nextInt();

        for (int i = 2; i <= (num - 1); i++) {
            if (num % i == 0) {
                a = a + 1;
                break;
            }
        }

        if (num <= 0) {
            System.out.println("\nInvalid Input. Entered number must be in Positive Integer");
        } else if (a == 0) {
            System.out.println("\n" + num + " is a Prime Number");
        } else {
            System.out.println("\n" + num + " is not a Prime Number");
        }

    }
}