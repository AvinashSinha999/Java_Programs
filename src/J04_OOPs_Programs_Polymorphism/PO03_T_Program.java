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

public class PO03_T_Program {
    public static void main(String[] args) {

        System.out.println("\n--------------- SON CALLING ---------------");

        PO03_Son s1 = new PO03_Son();
        s1.home();
        s1.pool();

        System.out.println("\n--------------- FATHER CALLING ---------------");

        PO03_Father f1 = new PO03_Father();
        f1.home();
        f1.garden();

        System.out.println("\n--------------- METHOD OVERRIDING ---------------");

        PO03_Father f2 = new PO03_Son();      // METHOD OVERRIDE - Ridden the Father's class Method
        f2.home();

    }
}
