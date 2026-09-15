package J01_Java_Basic_Programs.Number_Pattern;

public class NumPat31 {
    public static void main(String[] args) {

        int row = 5;
        int str = 1;

        for (int i = 0; i < row; i++) {
            int num = 1;
            for (int j = 0; j < str; j++) {
                if (j == 0 || i == row - 1 || j == str - 1) {
                    System.out.print(num + " ");
                    num++;
                } else {
                    num++;
                    System.out.print("  ");
                }
            }
            System.out.println();
            str++;
        }

    }
}

/*
    1
    1 2
    1   3
    1     4
    1 2 3 4 5
*/