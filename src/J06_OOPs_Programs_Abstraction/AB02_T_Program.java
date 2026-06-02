/*
    Abstraction: A class that cannot be created directly using abstract keyword.
                 Forces child classes to implement abstract methods.
*/

package J06_OOPs_Programs_Abstraction;

//------------------------------ MAIN CLASS ------------------------------

public class AB02_T_Program {
    public static void main(String[] args) {

        car1 c = new car1();
        c.drive();

    }
}

//------------------------------ PARENT INTERFACE ------------------------------

interface Engine1 {
    void startEngine();

    void stopEngine();
}

interface Break {
    void applyBreak();
}

//------------------------------ CHILD CLASS ------------------------------

class car1 implements Engine1, Break {

    @Override
    public void startEngine() {
        System.out.println("Start the Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop the Engine");
    }

    @Override
    public void applyBreak() {
        System.out.println("Apply the Breaks");
    }

    void drive() {
        startEngine();
        applyBreak();
        stopEngine();
    }
}