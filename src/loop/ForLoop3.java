package loop;

import java.util.Scanner;

public class ForLoop3 {
    public static void main(String[] args) {

        double number = 0;
        double result =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        number = scanner.nextDouble();
        for (double i = 1; i<=number;i++){
             result = i+result;
            System.out.println(result);
        }
        System.out.println(result);
    }
}
