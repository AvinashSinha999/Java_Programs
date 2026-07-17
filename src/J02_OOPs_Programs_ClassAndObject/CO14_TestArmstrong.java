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

public class CO14_TestArmstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CO14_Armstrong arm = new CO14_Armstrong();

        System.out.print("\nEnter the number : ");
        arm.num = sc.nextInt();

        arm.findArmstrong();

    }
}