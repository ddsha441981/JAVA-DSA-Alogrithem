package loop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Table1To20 {
    public static void main(String[] args) {
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter desire value of table 1 to 1000000000");
        int number = scanner.nextInt();

        if (number <= 1000000000 && number>0) {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= 10; j++) {
                    result = i * j;
                    System.out.print(" " + result + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("InputMismatchException !!!");
        }

    }
}
