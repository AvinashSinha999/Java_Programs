/*
  Ternary Operator : A shorter way to write an if/else. It takes a condition, and if the condition is true
                     it returns the first value, otherwise it returns the second value.
                     Commonly used to assign a value based on a condition in a single line.
*/

package J01_Java_Basic_Programs.Operator_Programs;

public class NestedTernaryOperator1 {
    public static void main(String[] args) {
        int x = 100, y = 90, z = 70;
        int largest = x >= y ? ((x >= z) ? x : z) : ((y >= z) ? y : z);
        System.out.println("Largest Number : " + largest);
    }
}