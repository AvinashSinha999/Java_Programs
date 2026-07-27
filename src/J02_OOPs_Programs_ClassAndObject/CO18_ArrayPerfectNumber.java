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

public class CO18_ArrayPerfectNumber {

    void printPerfect(int[] nums) {

        System.out.println();

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < nums.length; i++) {

            int sum = 0;

            for (int j = 1; j <= nums[i] / 2; j++) {
                if (nums[i] % j == 0) {
                    sum += j;
                }
            }
            if (sum == nums[i]) {
                System.out.print("\n" + nums[i] + " : is a Perfect Number.");
            }
        }
        System.out.println();
    }
}