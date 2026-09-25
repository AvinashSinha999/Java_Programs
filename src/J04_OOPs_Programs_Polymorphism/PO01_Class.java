/*
    Polymorphism: Same method behaving differently based on the object that calls it.

---------------------------------------- METHOD OVERLOADING ----------------------------------------

    - When declaring multiple methods on the Same Class with Same Name but different parameters
      is known as Method Overloading.
    - It is achieving in Compile Time Polymorphism or Static Polymorphism.
*/

package J04_OOPs_Programs_Polymorphism;

public class PO01_Class {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}