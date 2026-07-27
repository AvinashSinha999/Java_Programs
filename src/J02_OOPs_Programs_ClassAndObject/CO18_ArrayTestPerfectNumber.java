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

public class CO18_ArrayTestPerfectNumber {
    public static void main(String[] args) {

        CO18_ArrayPerfectNumber apr = new CO18_ArrayPerfectNumber();

        int[] nums = {6, 25, 48, 100, 28, 496, 4899, 8128};

        apr.printPerfect(nums);
    }
}