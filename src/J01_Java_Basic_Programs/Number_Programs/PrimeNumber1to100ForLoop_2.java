package J01_Java_Basic_Programs.Number_Programs;

public class PrimeNumber1to100ForLoop_2 {
    public static void main(String[] args) {

        for (int n = 1; n <= 100; n++) {

            int b = 0;

            if (n >= 2) {

                for (int i = 2; i <= (n - 1); i++) {
                    if (n % i == 0) {
                        b = b + 1;
                        break;
                    }
                }

                if (b == 0) {
                    System.out.print(n + " ");
                }
            }
        }

    }
}