/*
  switch Statement: Matches a value against multiple cases and runs the matching block.
                    Cleaner than ladder if else is when checking one variable against many values.
*/

package J01_Java_Basic_Programs;

import java.util.Scanner;

public class JBP06_SwitchBasics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the Day Number : ");
        int day = sc.nextInt();

        if (day<=0 || day>=8) {
            System.out.println("It is invalid Input. Entering number must be in between 1 to 7");
        }
            switch (day) {
                case 1 :
                    System.out.println("Monday");
                    break;

                case 2 :
                    System.out.println("Tuesday");
                    break;

                case 3 :
                    System.out.println("Wednesday");
                    break;

                case 4 :
                    System.out.println("Thurday");
                    break;

                case 5 :
                    System.out.println("Friday");
                    break;

                case 6 :
                    System.out.println("Saturday");
                    break;

                case 7 :
                    System.out.println("Sunday");
                    break;
            }

        }
    }