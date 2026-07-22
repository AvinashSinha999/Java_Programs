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

public class CO16_StrongNumber {

    int num;

    void findStrongNumber() {

        int temp = num;
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            int fact = 1;
            for (int i = 1; i <= rem; i++) {
                fact = fact * i;
            }
            sum += fact;
            num /= 10;
        }
        if (temp == sum) {
            System.out.println("\n" + temp + " : is a Strong Number.");
        } else {
            System.out.println("\n" + temp + " : is not a Strong Number.");
        }
    }
}