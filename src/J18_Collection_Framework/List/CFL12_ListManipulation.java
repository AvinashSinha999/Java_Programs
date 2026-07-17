package J18_Collection_Framework.List;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CFL12_ListManipulation {
    public static void main(String[] args) {

        List<Integer> numberList1 = Arrays.asList(1, 22, 32, null, 123, 100);

        List<Integer> numberList2 = numberList1.stream()
                .filter(i -> Objects.nonNull(i))
                .filter(i -> i.toString().startsWith("1"))
                .collect(Collectors.toList());

        System.out.println("\nList of Numbers that starts with 1 : " + numberList2);

    }
}