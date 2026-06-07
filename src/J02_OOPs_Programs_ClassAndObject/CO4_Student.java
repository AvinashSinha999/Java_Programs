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

public class CO4_Student {
    public static void main(String[] args) {

        CO4_College.cName = "Hi-Tech Engineering College";
        CO4_College.cAddress = "NH-24, Uttar Pradesh, Ghaziabad";
        CO4_College.cPhone = 8953644528L;

        CO4_College c1 = new CO4_College();
        c1.sId = "Stu01";
        c1.sName = "Aman Mehra";
        c1.sGen = "Male";
        c1.sPhone = 7589256421L;
        c1.sEmail = "amanmehra98@gmail.com";

        CO4_College c2 = new CO4_College();
        c2.sId = "Stu02";
        c2.sName = "Aarti Sharma";
        c2.sGen = "Female";
        c2.sPhone = 9965432144L;
        c2.sEmail = "sharma.26aarti@gmail.com";

        CO4_College c3 = new CO4_College();
        c3.sId = "Stu03";
        c3.sName = "Sandeep Kumar";
        c3.sGen = "Male";
        c3.sPhone = 8520621765L;
        c3.sEmail = "kumar.sandeep27@gmail.com";

        System.out.println();
        c1.details();

        System.out.println();
        c2.details();

        System.out.println();
        c3.details();
    }
}