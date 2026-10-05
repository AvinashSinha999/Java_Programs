/*
    Polymorphism: Same method behaving differently based on the object that calls it.

---------------------------------------- METHOD OVERLOADING ----------------------------------------

    - When declaring multiple methods on the Same Class with Same Name but different parameters
      is known as Method Overloading.
    - It is achieving in Compile Time Polymorphism or Static Polymorphism.
*/

package J04_OOPs_Programs_Polymorphism;

public class PO01_Object {
    public static void main(String[] args) {

        PO01_Class po = new PO01_Class();

        int n1 = po.add(4, 5);
        System.out.println(n1);

        int n2 = po.add(4, 5, 6);
        System.out.println(n2);

        double n3 = po.add(4.55, 5.66);
        System.out.println(n3);

    }
}