/*
    Class:  A class is a blueprint or template used for creating objects.
            It defines the structure, including the variables (attributes) and methods (behaviors).
    Object: An object is the real-world entity which is created from that blueprint using the new keyword.
            It has actual values and can perform actions.
                                                      OR
            An object which are accesses and the uses of instance variables and methods
            which are defined by its class.
*/

package J02_OOPs_Programs_ClassAndObject;

import java.util.Scanner;

public class CO16_TestStrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CO16_StrongNumber str = new CO16_StrongNumber();

        System.out.print("\nEnter the Number : ");
        str.num = sc.nextInt();

        str.findStrongNumber();
    }
}