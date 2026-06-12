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

import java.util.Scanner;

public class CO5_EmployeeHRScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CO5_Employee e = new CO5_Employee();

        int r = 1;

        while ((r > 0) && (r <= 1)) {

            System.out.println("\n=============== EMPLOYEE DETAILS ===============");
            System.out.print("\nEnter Employee ID : ");
            e.empid = sc.next();
            System.out.print("\nEnter First Name : ");
            e.fname = sc.next();
            System.out.print("\nEnter Last Name : ");
            e.lname = sc.next();

            System.out.println("\n=============== DATE OF BIRTH ===============");
            System.out.print("\nEnter Date : ");
            e.dd = sc.nextInt();
            System.out.print("\nEnter Month : ");
            e.mm = sc.nextInt();
            System.out.print("\nEnter Year : ");
            e.yyyy = sc.nextInt();
            System.out.print("\nEnter Gender : ");
            e.gen = sc.next();

            System.out.println("\n=============== CONTACT DETAILS ===============");
            System.out.print("\nEnter Address : ");
            e.add = sc.next();
            System.out.print("\nEnter Phone Number : ");
            e.phone = sc.nextLong();
            System.out.print("\nEnter E-mail ID : ");
            e.email = sc.next();

            e.details();
            System.out.print("\nPress 1 to Continue OR Press Any Number to Exit : ");
            r = sc.nextInt();
        }
        if (r != 1) {
            System.out.println("\nTHANK YOU");
        }
    }
}
