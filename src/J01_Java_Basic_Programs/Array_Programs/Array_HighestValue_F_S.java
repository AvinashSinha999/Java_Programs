package J01_Java_Basic_Programs.Array_Programs;

public class Array_HighestValue_F_S {
    public static void main(String[] args) {

        int[] numbers = {44, 23, 58, 88, 69, 96, 45, 76, 83, 99};

        int firstMax = Integer.MIN_VALUE;           // int firstMax = numb[0];
        int secondMax = Integer.MIN_VALUE;          // int secondMax = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > firstMax) {
                secondMax = firstMax;
                firstMax = numbers[i];
            } else if ((numbers[i] > secondMax) && (numbers[i] != firstMax)) {
                secondMax = numbers[i];
            }
        }

        System.out.println("\nFirst Highest Value is : " + firstMax);

        System.out.println("\nSecond Highest Value is : " + secondMax);
    }
}