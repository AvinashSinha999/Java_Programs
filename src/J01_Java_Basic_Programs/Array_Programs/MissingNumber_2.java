package J01_Java_Basic_Programs.Array_Programs;

public class MissingNumber_2 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 4, 5, 6};
        int totalNumber = 6;
        int totalSumOfAllNumbers = (totalNumber * (totalNumber + 1)) / 2;
        System.out.println("\nTotal Sum of All Numbers : " + totalSumOfAllNumbers);

        int sumOfArray = 0;

        for (int i = 0; i < numbers.length; i++) {
            sumOfArray = sumOfArray + numbers[i];
        }
        System.out.println("Sum of Array Number : " + sumOfArray);

        System.out.println("\nThe Missing number is : " + (totalSumOfAllNumbers - sumOfArray));

    }
}