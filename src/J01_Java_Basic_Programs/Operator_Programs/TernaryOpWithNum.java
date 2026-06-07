/*
  Ternary Operator : A shorter way to write an if/else. It takes a condition, and if the condition is true
                     it returns the first value, otherwise it returns the second value.
                     Commonly used to assign a value based on a condition in a single line.
*/

package J01_Java_Basic_Programs.Operator_Programs;

public class TernaryOpWithNum {
    public static void main(String[] args) {
        byte i = 45;
        byte j = (byte) (i >= 55 ? 45 : 55);
        System.out.println(j);//55
    }
}