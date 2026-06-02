/*
    Abstraction: A class that cannot be created directly using abstract keyword.
                 Forces child classes to implement abstract methods.
*/

package J06_OOPs_Programs_Abstraction;

public class AB04_T_Program {
    public static void main(String[] args) {

    }
}

interface I1 {

}

interface I2 {

}

interface I3 extends I1 {

}

interface I4 extends I1, I2 {

}

class C1 {

}

class C2 {

}

class Test1 extends C1 {

}

/*
class Test2 extends C1,C2 {                                    // Multiple Inheritance in class level is not support

}
*/

class Test3 implements I1 {

}

class Test4 implements I1, I2 {

}

class Test5 extends C1 implements I1 {

}

class Test6 extends C2 implements I1, I2, I3, I4 {             // It is possible in the Java

}

/*
class Test7 implements I1 extends C1 {                         // It is not possible in the Java

}
*/