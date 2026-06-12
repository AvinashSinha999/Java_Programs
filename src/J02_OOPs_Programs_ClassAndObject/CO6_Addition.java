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

public class CO6_Addition {
    int a;
    int b;
    int c;

    int sum() {

        if ((a < 0) && (b < 0)) {
            c = a + b;
        } else if ((a < 0) || (b < 0)) {
            c = a + b;
        } else {
            c = a + b;
        }
        return c;
    }
}