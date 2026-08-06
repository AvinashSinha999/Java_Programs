package J01_Java_Basic_Programs.Number_Programs;

import java.util.Scanner;

public class Factorial_1 {
    public static void main(String[] args) {

        int result = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the Number : ");
        int number = sc.nextInt();

        for (int i = number; i > 0; i--) {
            result *= i;
        }

        System.out.println("\nFactorial Number of " + number + " is " + result + ".");

    }
}