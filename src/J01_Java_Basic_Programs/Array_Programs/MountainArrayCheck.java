package J01_Java_Basic_Programs.Array_Programs;

public class MountainArrayCheck {
    public static void main(String[] args) {

        int[] numbers = {1, 3, 5, 10, 6, 2, 0};

        System.out.println("\nIt is Mountain Array : " + mountainCheckArray(numbers));
    }

    private static boolean mountainCheckArray(int[] numbers) {

        /*
            How to check that Array is Mountain Array or Not
        */

        //Condition 1 : Length of the Array must be greater than 2 i.e. at least need Three elements for Mountain Array
        if (numbers.length < 2) {
            return false;
        }

        //Condition 2 : Elements must be increasing order!!!
        int i = 0;
        while ((i + 1 < numbers.length) && (numbers[i] < numbers[i + 1])) {
            i++;
        }

        //Condition 3 : Elements must be decreasing order!!!
        while ((i + 1 < numbers.length) && (numbers)[i] > numbers[i + 1]) {
            i++;
        }

        if (numbers.length - 1 == i) {
            return true;
        } else {
            return false;
        }
    }
}