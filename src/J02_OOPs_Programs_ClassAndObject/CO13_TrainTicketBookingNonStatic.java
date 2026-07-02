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

public class CO13_TrainTicketBookingNonStatic {
    static String tname;
    static int tnum;
    String cname;
    String cberth;
    int cseatnum;

    static void trainInformation() {
        System.out.println("\n=-=-=-=-=-=-=-=-=-=-= DETAILS OF TRAIN =-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Train Name   : " + tname);
        System.out.println("Train Number : " + tnum);
    }

    void bookTrainTicket() {

        System.out.println("\n==================== CUSTOMER DETAILS ====================");
        System.out.println("Customer Name        : " + cname);
        System.out.println("Customer Berth       : " + cberth);
        System.out.println("Customer Seat Number : " + cseatnum);
    }
}