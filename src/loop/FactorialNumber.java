package loop;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        int fact = 1;
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        number = scanner.nextInt();
        for(int i = 1;i<=number;i++){
          fact = fact * i;
        }
        System.out.println(fact);
    }
}
