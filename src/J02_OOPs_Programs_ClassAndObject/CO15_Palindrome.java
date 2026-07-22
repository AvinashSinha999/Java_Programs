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

public class CO15_Palindrome {

    int num;

    void findPalindrome() {

        int a = num;
        int temp = 0;

        while (num > 0) {
            int rem = num % 10;
            temp = temp * 10 + rem;
            num /= 10;
        }

        if (a == temp) {
            System.out.println("\n" + a + " : is a Palindrome Number.");
        } else {
            System.out.println("\n" + a + ": is not a Palindrome Number.");
        }
    }
}