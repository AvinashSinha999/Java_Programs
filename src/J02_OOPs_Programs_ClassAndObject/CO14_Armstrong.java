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

public class CO14_Armstrong {

    int num;

    void findArmstrong() {

        int a = num;
        int num1 = num;
        int count = 0;
        int temp = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }

        if (count == 3) {

            while (num1 > 0) {
                int rem = num1 % 10;
                int out = rem * rem * rem;
                temp += out;
                num1 /= 10;
            }

        } else {

            while (num1 > 0) {
                int rem = num1 % 10;
                int out = rem * rem * rem * rem;
                temp += out;
                num1 /= 10;
            }
        }
        if (a == temp) {
            System.out.println("\n" + a + " : is an Armstrong Number");
        } else {
            System.out.println("\n" + a + " : is not an Armstrong Number");
        }
    }
}