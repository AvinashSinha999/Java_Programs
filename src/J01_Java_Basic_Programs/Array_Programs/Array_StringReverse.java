package J01_Java_Basic_Programs.Array_Programs;

public class Array_StringReverse {
    public static void main(String[] args) {

        String[] names = {"Avinash", "Pramod", "Amit", "Ajay", "Vijay"};

        System.out.print("\nBefore Reverse the Order : ");

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }

        System.out.println();
        System.out.print("\nAfter Reverse the Order : ");

        for (int i = names.length - 1; i >= 0; i--) {
            System.out.print(names[i] + " ");
        }
        System.out.println();
    }
}