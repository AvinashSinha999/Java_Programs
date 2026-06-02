/*
    Abstraction: A class that cannot be created directly using abstract keyword.
                 Forces child classes to implement abstract methods.
*/

package J06_OOPs_Programs_Abstraction;

//------------------------------ MAIN CLASS ------------------------------

public class AB01_T_Program {
    public static void main(String[] args) {

        WagonR wagonR = new WagonR();
        wagonR.drive();

    }
}

//------------------------------ PARENT CLASS ------------------------------

abstract class Engine {

    abstract void startEngine();

    abstract void stopEngine();

}

//------------------------------ CHILD CLASS ------------------------------

class WagonR extends Engine {

    @Override
    void startEngine() {
        System.out.println("Start the Engine");
    }

    @Override
    void stopEngine() {
        System.out.println("Stop the Engine");
    }

    void drive() {
        startEngine();
        System.out.println("I am Driving the WagonR Car");
        stopEngine();
    }

}