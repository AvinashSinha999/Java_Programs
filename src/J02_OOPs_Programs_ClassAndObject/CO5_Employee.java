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

public class CO5_Employee {

        String empid;
        String fname;
        String lname;
        int dd;
        int mm;
        int yyyy;
        String gen;
        String add;
        long phone;
        String email;

        void details(){

            System.out.println("\n=============== FULL DETAILS OF THE EMPLOYEE  ===============");
            System.out.println("Employee ID 	: "+empid);
            System.out.println("Employee Name 	: "+fname+" "+lname);
            System.out.println("D.O.B. 		    : "+dd+"/"+mm+"/"+yyyy);
            System.out.println("Gender 		    : "+gen);
            System.out.println("Address 	    : "+add);
            System.out.println("Phone No. 	    : "+phone);
            System.out.println("E-mail 		    : "+email);
        }
}