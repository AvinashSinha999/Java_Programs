/*
  Ternary Operator : A shorter way to write an if/else. It takes a condition, and if the condition is true
                     it returns the first value, otherwise it returns the second value.
                     Commonly used to assign a value based on a condition in a single line.
*/

package J01_Java_Basic_Programs.Operator_Programs;

public class TernaryOpWithChar {
    public static void main(String[] args) {
        System.out.println();
        byte i = 45;
        String j = i >= 55 ? "i is Greater than j" : "j is Greater than i";
        System.out.println("Which Number is Greater : " + j);
    }
}