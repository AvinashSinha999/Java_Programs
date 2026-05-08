package J01_Java_Basic_Programs.Number_Programs;

import java.util.Scanner;

public class HighestDigit_F_S {
    public static void main(String[] args) {

        int firstMax = Integer.MIN_VALUE;           // int firstMax = 0;
        int secondMax = Integer.MIN_VALUE;          // int secondMax = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the Number : ");
        int number = sc.nextInt();//46657
        int temp = number;

        while (number > 0) {
            int reminder = number % 10;
            if (reminder > firstMax) {
                secondMax = firstMax;
                firstMax = reminder;
            } else if ((reminder > secondMax) && (reminder != firstMax)) {
                secondMax = reminder;
            }
            number /= 10;
        }

        System.out.println("\nFirst Highest Digit of " + temp + " is : " + firstMax);

        System.out.println("\nSecond Highest Digit of " + temp + " is : " + secondMax);

    }
}