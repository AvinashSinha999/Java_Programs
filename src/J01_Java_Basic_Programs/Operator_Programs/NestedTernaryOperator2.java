/*
  Ternary Operator : A shorter way to write an if/else. It takes a condition, and if the condition is true
                     it returns the first value, otherwise it returns the second value.
                     Commonly used to assign a value based on a condition in a single line.
*/

package J01_Java_Basic_Programs.Operator_Programs;

public class NestedTernaryOperator2 {
    public static void main(String[] args) {
        int age = 2;

      /*
        Minor, Adult, Senior
        Minor < 18
        Adult > 18
        Senior > 65
      */

        String result = age < 18 ? "Minor" : ((age < 65) ? "Adult" : "Senior");
        System.out.println("Age is : " + result);
    }
}