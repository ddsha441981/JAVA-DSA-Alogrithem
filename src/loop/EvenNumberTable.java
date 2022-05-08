package loop;

import java.util.Scanner;

public class EvenNumberTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = scanner.nextInt();
        for (int i = 2; i <= number;i++) {
            if (i % 2 == 0) {
                for (int j = 1; j <= 10; j++) {
                    int result = i * j;
                    System.out.print(" " + result + " ");
                }
                System.out.println();
            }
        }
    }
}
