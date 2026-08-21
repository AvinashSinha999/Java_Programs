/*
  Inheritance : A child class inherits properties and methods from a parent class using extends keyword.

  ------------------------------ MULTILEVEL INHERITANCE ------------------------------

  - A child class inherits from a parent, and another class inherits from that child.
*/

package J03_OOPs_Programs_Inheritance;

public class IN02_T_Program {
    public static void main(String[] args) {

        System.out.println("\n--------------- SON CALLING ---------------");

        IN02_Son s1 = new IN02_Son();

        s1.bhk();

        s1.farmHouse();

        s1.bhk2();

        s1.bhk3();

        System.out.println("\n--------------- FATHER CALLING ---------------");

        IN02_Father f1 = new IN02_Father();

        f1.bhk();

        f1.farmHouse();

        f1.bhk2();

    }
}