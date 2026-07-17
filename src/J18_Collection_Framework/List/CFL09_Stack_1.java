package J18_Collection_Framework.List;

import java.util.Stack;

public class CFL09_Stack_1 {
    public static void main(String[] args) {

        Stack stack = new Stack();

        // push() is a function present on the Stack Class. It is same like as add() in ArrayList/Vector
        stack.push("Pramod");
        stack.push("Dutta");
        stack.push("Amit");
        stack.push("Amit2");

        System.out.println("Stack Items                 : " + stack);

        System.out.println("Stack Size                  : " + stack.size());

        //Looks at the object at the top of this stack without removing it from the stack
        System.out.println("Last Stack Element          : " + stack.peek());

        //Removes the object at the top of this stack and returns that object as the value of this function
        System.out.println("Remove Last Stack Element   : " + stack.pop());

        System.out.println("New Stack Items             : " + stack);
        System.out.println("New Stack Size              : " + stack.size());
        System.out.println("Does Stack is Empty         : " + stack.isEmpty());

        System.out.println("\n----------------------------------------------------------------------\n");

        stack.add("Snehal");
        stack.add("Chetan");
        stack.add("Vijay");
        stack.add("Chetan");

        System.out.println("New Updated Stack Items                     : " + stack);
        System.out.println("New Updated Stack Size                      : " + stack.size());
        System.out.println("Showing the Element of this Indexing Number : " + stack.get(5));
        System.out.println("Showing the Element of this Indexing Number : " + stack.get(3));

        /*
            OUTPUT :
                    Stack Items                 : [Pramod, Dutta, Amit, Amit2]
                    Stack Size                  : 4
                    Last Stack Element          : Amit2
                    Remove Last Stack Element   : Amit2
                    New Stack Items             : [Pramod, Dutta, Amit]
                    New Stack Size              : 3
                    Does Stack is Empty         : false

                    ----------------------------------------------------------------------

                    New Updated Stack Items                     : [Pramod, Dutta, Amit, Snehal, Chetan, Vijay, Chetan]
                    New Updated Stack Size                      : 7
                    Showing the Element of this Indexing Number : Vijay
                    Showing the Element of this Indexing Number : Snehal
        */

    }
}