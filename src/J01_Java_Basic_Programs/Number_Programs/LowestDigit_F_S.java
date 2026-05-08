package J01_Java_Basic_Programs.Number_Programs;

import java.util.Scanner;

public class LowestDigit_F_S {
    public static void main(String[] args) {

        int firstMin = Integer.MAX_VALUE;           // int firstMin = 10;
        int secondMin = Integer.MAX_VALUE;          // int secondMin = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the Number : ");
        int number = sc.nextInt();
        int temp = number;

        while (number > 0) {
            int reminder = number % 10;
            if (reminder < firstMin) {
                secondMin = firstMin;
                firstMin = reminder;
            } else if ((reminder < secondMin) && (reminder != firstMin)) {
                secondMin = reminder;
            }
            number /= 10;
        }

        System.out.println("\nFirst Lowest Digit of " + temp + " is : " + firstMin);

        System.out.println("\nSecond Lowest Digit of " + temp + " is : " + secondMin);

    }
}