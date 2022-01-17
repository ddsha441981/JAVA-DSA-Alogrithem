package conditional;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number 1");
        double number1 = scanner.nextDouble();
        System.out.println("Enter Number 2 ");
        double number2 = scanner.nextDouble();
        System.out.println("Enter your Operation");
        scanner.nextLine();
        char operation = scanner.nextLine().charAt(0);
        double result = 0;
        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            case '%':
                result = number1 % number2;
                break;
            default:
                System.out.println("Invaild Number");
        }
        System.out.println("Result is :- " + result);
    }
}
