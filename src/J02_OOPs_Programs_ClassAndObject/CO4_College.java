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

public class CO4_College {

    static String cName;
    static String cAddress;
    static long cPhone;
    String sId;
    String sName;
    String sGen;
    long sPhone;
    String sEmail;

    void details() {

        System.out.println("===================== STUDENT DETAILS ======================");

        System.out.println("College Name            : " + cName);
        System.out.println("College Address 	    : " + cAddress);
        System.out.println("College Phone Number 	: " + cPhone);
        System.out.println("Student ID 		        : " + sId);
        System.out.println("Student Name 		    : " + sName);
        System.out.println("Student Gender 		    : " + sGen);
        System.out.println("Student Phone Number 	: " + sPhone);
        System.out.println("Student E-mail 		    : " + sEmail);
    }
}