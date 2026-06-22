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

public class CO9_AdmissionNonStatic {

    static String sname;
    static String sadd;
    static long sphone;
    String name;
    String regid;
    String gen;
    long phone;
    String email;

    static void schoolDetail() {
        System.out.println("\n=-=-=-=-=-=-=-=-=-=-= DETAILS OF SCHOOL =-=-=-=-=-=-=-=-=-=-=");
        System.out.println("School Name 		    : " + sname);
        System.out.println("School Address 		    : " + sadd);
        System.out.println("School Phone Number 	: " + sphone);
    }

    void studentRegistration() {
        System.out.println("\n==================== STUDENT DETAILS ====================");
        System.out.println("Student Name 			        : " + name);
        System.out.println("Student Registration Number 	: " + regid);
        System.out.println("Student Gender 			        : " + gen);
        System.out.println("Student Phone Number 		    : " + phone);
        System.out.println("Student E-mail ID 		        : " + email);
    }
}