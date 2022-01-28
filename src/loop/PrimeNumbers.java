package loop;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        int num = 0;
        int result = 0;
        boolean isPrime = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number...");
        num = scanner.nextInt();
        for (int i = 2; i*i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (num < 2) {
            isPrime = false;
        }
        System.out.println(isPrime);

    }
}
