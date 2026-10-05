/*
    Polymorphism: Same method behaving differently based on the object that calls it.

---------------------------------------- METHOD OVERLOADING ----------------------------------------

    - When declaring multiple methods on the Same Class with Same Name but different parameters
      is known as Method Overloading.
    - It is achieving in Compile Time Polymorphism or Static Polymorphism.
*/

package J04_OOPs_Programs_Polymorphism;

public class PO02_Printer {

    static void print(String name) {

        System.out.println(name);
    }

    static void print(String name, int age) {

        System.out.println(name + " " + age);
    }

    static void print(String name, int age, String ads) {

        System.out.println(name + " " + age + " " + ads);
    }
}