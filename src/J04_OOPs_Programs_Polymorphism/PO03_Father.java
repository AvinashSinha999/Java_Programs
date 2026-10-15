/*
    Polymorphism: Same method behaving differently based on the object that calls it.

---------------------------------------- METHOD OVERRIDING ----------------------------------------
                                                OR
------------------------------------- DYNAMIC METHOD DISPATCH -------------------------------------

    - Inheriting a method of Super Class, changing the implementation in the Sub Class is known as
      Method Overriding.
    - It is achieving in Run Time Polymorphism or Dynamic Polymorphism.
*/

package J04_OOPs_Programs_Polymorphism;

public class PO03_Father {

    void home() {
        System.out.println("Father purchase 2 BHK");
    }

    void garden() {
        System.out.println("Father wants Garden");
    }
}
