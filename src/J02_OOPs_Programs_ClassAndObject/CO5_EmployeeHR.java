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

public class CO5_EmployeeHR {
    public static void main(String[] args) {

        CO5_Employee e1 = new CO5_Employee();
        e1.empid = "Emp01";
        e1.fname = "Aman";
        e1.lname = "Mehra";
        e1.dd = 12;
        e1.mm = 5;
        e1.yyyy = 1998;
        e1.gen = "Male";
        e1.add = "Meerut, Uttar Pradesh";
        e1.phone = 7589256421L;
        e1.email = "amanmehra98@gmail.com";

        CO5_Employee e2 = new CO5_Employee();
        e2.empid = "Emp02";
        e2.fname = "Aarti";
        e2.lname = "Sharma";
        e2.dd = 26;
        e2.mm = 2;
        e2.yyyy = 1998;
        e2.gen = "Female";
        e2.add = "Noida, Uttar Pradesh";
        e2.phone = 9965432144L;
        e2.email = "sharma.26aarti@gmail.com";

        CO5_Employee e3 = new CO5_Employee();
        e3.empid = "Emp03";
        e3.fname = "Sandeep";
        e3.lname = "Kumar";
        e3.dd = 27;
        e3.mm = 12;
        e3.yyyy = 1997;
        e3.gen = "Male";
        e3.add = "Gurugram, Uttar Pradesh";
        e3.phone = 8520621765L;
        e3.email = "kumar.sandeep27@gmail.com";

        System.out.println();
        e1.details();

        System.out.println();
        e2.details();

        System.out.println();
        e3.details();
    }
}