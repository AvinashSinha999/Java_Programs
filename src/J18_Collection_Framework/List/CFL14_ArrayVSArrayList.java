package J18_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CFL14_ArrayVSArrayList {
    public static void main(String[] args) {

        // Arrays
        int[] numbers = new int[10];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        System.out.println("\n-------------------- ARRAY --------------------\n");
        System.out.println("Arrays: " + Arrays.toString(numbers));
        System.out.println("Array Length: " + numbers.length);

        // ArrayList
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(10);
        numbersList.add(20);
        numbersList.add(30);
        numbersList.add(40);
        numbersList.add(50);
        numbersList.add(40);
        numbersList.add(30);

        System.out.println("\n-------------------- ARRAYLIST --------------------\n");
        System.out.println("ArrayList: " + numbersList);
        System.out.println("5th Index: " + numbersList.get(2));
        System.out.println("ArrayList Size: " + numbersList.size());

        // Remove number from index value
        numbersList.remove(1);
        System.out.println("ArrayList: " + numbersList);

        // Add new number on index value
        numbersList.add(2, 66);
        System.out.println("ArrayList: " + numbersList);

        // Update the number at index value
        numbersList.set(2, 45);
        System.out.println("ArrayList: " + numbersList);

        // Remove number from object value
        numbersList.remove(new Integer(40));
        System.out.println("ArrayList: " + numbersList);

        // indexOf()
        int Index = numbersList.indexOf(new Integer(50));
        System.out.println("Index: " + Index);

        // lastIndexOf()
        int lastIndex=numbersList.lastIndexOf(new Integer(30));
        System.out.println("Last Index: " + lastIndex);

        // isEmpty()
        ArrayList<Integer> dataList = new ArrayList<>();
        System.out.println("Data List is empty or not: " + dataList.isEmpty());

        // Sorting
        Collections.sort(numbersList);
        System.out.println("Sorting List: " + numbersList);

        // Reverse
        Collections.reverse(numbersList);
        System.out.println("Reverse List: " + numbersList);

    }
}