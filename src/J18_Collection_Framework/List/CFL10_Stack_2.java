package J18_Collection_Framework.List;

import java.util.Stack;

public class CFL10_Stack_2 {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        // push() is a function present on the Stack Class. It is same like as add() in ArrayList/Vector
        stack.push("Apple");        // Position 7
        stack.push("Orange");       // Position 6
        stack.push("Watermelon");   // Position 5
        stack.push("Pineapple");    // Position 4
        stack.push("Banana");       // Position 3
        stack.push("Mango");        // Position 2
        stack.push("Kiwi");         // Position 1

        //When element is present in the Stack then search() function shows the position from the top
        int position_1 = stack.search("Mango");
        System.out.println("Position : " + position_1);

        //When element is present in the Stack then search() function shows the position from the top
        int position_2 = stack.search("Orange");
        System.out.println("Position : " + position_2);

        //When element is not present in the Stack then search() function shows the -1 as position
        int position_3 = stack.search("Cherry");
        System.out.println("Position : " + position_3);

        //When element is not present in the Stack then search() function shows the -1 as position
        int position_4 = stack.search("Guava");
        System.out.println("Position : " + position_4);

        //peek() function is used to looks at the object at the top of this Stack without removing it from the stack
        String topElement = stack.peek();
        System.out.println("Top Element : " + topElement);

        //pop() function removes the object at the top of this Stack and returns that object as the value of this function
        String poppedElement = stack.pop();
        System.out.println("Remove Last Stack Element : " + poppedElement);

        //peek() function is used to looks at the object at the top of this Stack without removing it from the stack
        String updatedTopElement = stack.peek();
        System.out.println("Updated Top Element : " + updatedTopElement);

        //isEmpty() function check whether the Stack is empty or not
        boolean stackIsEmptyOrNot = stack.isEmpty();
        System.out.println("Stack Is Empty Or Not : " + stackIsEmptyOrNot);

    }
}

        /*
            OUTPUT :
                    Position : 2
                    Position : 6
                    Position : -1
                    Position : -1
                    Top Element : Kiwi
                    Remove Last Stack Element : Kiwi
                    Updated Top Element : Mango
                    Stack Is Empty Or Not : false
        */