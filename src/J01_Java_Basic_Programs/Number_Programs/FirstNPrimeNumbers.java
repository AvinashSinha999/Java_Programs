package J01_Java_Basic_Programs.Number_Programs;

import java.util.Scanner;

public class FirstNPrimeNumbers {
    public static void main(String[] args) {

        int n = 2;
        int count = 0;
        int b = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter how many prime numbers to print : ");
        int d = sc.nextInt();

        System.out.print("\nFirst " + d + " Prime Numbers are : ");

        while (count < d) {

            for (int i = 2; i <= (n - 1); i++) {
                if (n % i == 0) {
                    b = b + 1;
                    break;
                }
            }

            if (b == 0) {
                System.out.print(n + " ");
                count++;
            }
                
            n++;
            b = 0;
        }

        System.out.println();

    }
}