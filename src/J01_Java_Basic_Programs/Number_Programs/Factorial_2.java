package J01_Java_Basic_Programs.Number_Programs;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial_2 {
    public static void main(String[] args) {

        BigInteger result = BigInteger.ONE;

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number : ");
        int number = sc.nextInt();

        for (int i = number; i > 0; i--) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        System.out.println("\nOutput is : " + result);

    }
}