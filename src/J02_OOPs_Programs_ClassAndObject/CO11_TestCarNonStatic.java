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

public class CO11_TestCarNonStatic {
    public static void main(String[] args) {

        CO11_CarNonStatic.pshow = "Malik & Malik Brothers Cars Showroom";
        CO11_CarNonStatic.pdis = "Gurugram";
        CO11_CarNonStatic.pstate = "Haryana";

        CO11_CarNonStatic.showroomPlace();

        CO11_CarNonStatic cns1 = new CO11_CarNonStatic();
        cns1.model = "HN452025";
        cns1.name = "Honda City";
        cns1.type = "Petrol Type";
        cns1.price = 3000000;

        CO11_CarNonStatic cns2 = new CO11_CarNonStatic();
        cns2.model = "MRSSW0425 ";
        cns2.name = "Maruti Suzuki Swift Desire";
        cns2.type = "Diesel Type";
        cns2.price = 3500000;

        CO11_CarNonStatic cns3 = new CO11_CarNonStatic();
        cns3.model = "KIASIN2025";
        cns3.name = "KIA Seltos";
        cns3.type = "EV Type";
        cns3.price = 4500000;

        cns1.purchaseCar();
        cns2.purchaseCar();
        cns3.purchaseCar();
    }
}