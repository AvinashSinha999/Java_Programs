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

//------------------------------ MAIN CLASS ------------------------------

public class PO04_RealExample {
    public static void main(String[] args) {

        System.out.println("\n--------------- TC1 CALLING ---------------");

        TC1 t1 = new TC1();
        t1.startTC();

        System.out.println("\n--------------- TC2 CALLING ---------------");

        TC2 t2 = new TC2();
        t2.openBrowser();
    }
}

//------------------------------ PARENT CLASS ------------------------------

class CommonToAllTC {

    void openBrowser() {
        System.out.println("Open the browser in 5 second");
    }
}

//------------------------------ CHILD CLASS ------------------------------

class TC1 extends CommonToAllTC {

    void startTC() {
        openBrowser();
    }
}

class TC2 extends CommonToAllTC {

    @Override
    void openBrowser() {
        System.out.println("Open the browser in 2 second");
    }
}