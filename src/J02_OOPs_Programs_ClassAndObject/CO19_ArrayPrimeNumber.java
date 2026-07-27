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

public class CO19_ArrayPrimeNumber {

    void printPrimeNum(int[] nums) {

        System.out.println();

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < nums.length; i++) {

            int a = 0;

            for (int j = 2; j <= nums[i] / 2; j++) {
                if (nums[i] % 2 == 0) {
                    a += 1;
                    break;
                }
            }
            if (a == 0) {
                System.out.print("\n" + nums[i] + " : is a Prime Number");
            }
        }
        System.out.println();
    }
}