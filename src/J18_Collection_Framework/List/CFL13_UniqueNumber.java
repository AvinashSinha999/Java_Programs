package J18_Collection_Framework.List;

import java.util.ArrayList;

public class CFL13_UniqueNumber {
    public static void main(String[] args) {

        int[] a = {4, 5, 5, 5, 4, 6, 6, 9, 4};

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {

            int k = 0;

            if (!list.contains(a[i])) {
                list.add(a[i]);
                k++;

                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] == a[i]) {
                        k++;
                    }
                }

                if (k == 1) {
                    System.out.println("\n" + a[i] + " is the Unique Number in the List");
                }

            }
        }

    }
}