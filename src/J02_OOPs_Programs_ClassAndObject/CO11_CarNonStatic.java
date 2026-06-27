/*
    Class:  A class is a blueprint or template used for creating objects.
            It defines the structure, including the variables (attributes) and methods (behaviors).
    Object: An object is the real-world entity which is created from that blueprint using the new keyword.
            It has actual values and can perform actions.
                                                      OR
            An object which are accesses and the uses of instance variables and methods
            which are defined by its class.
*/

package J02_OOPs_Programs_ClassAndObject;

public class CO11_CarNonStatic {

    static String pshow;
    static String pdis;
    static String pstate;
    String model;
    String name;
    String type;
    long price;

    static void showroomPlace() {
        System.out.println("\n=-=-=-=-=-=-=-=-=-=-= DETAILS OF SHOWROOM =-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Car Purchase from this Showroom 	   : " + pshow);
        System.out.println("Showroom Placed in this District 	   : " + pdis);
        System.out.println("District Present in this State (India) : " + pstate);
    }

    void purchaseCar() {
        System.out.println("\n==================== CAR DETAILS ====================");
        System.out.println("Car Model Number : " + model);
        System.out.println("Car Name         : " + name);
        System.out.println("Car Fuel Type 	 : " + type);
        System.out.println("Car Price 	     : Rs. " + price + "/-");
    }
}