package conditional;

import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Rate Us....");
        int ratingBar = scanner.nextInt();
        switch (ratingBar) {
            case 1:
            case 2:
                System.out.println("Bad");
                break;
            case 3:
                System.out.println("Average");
                break;
            case 4:
            case 5:
                System.out.println("Good");
                break;
                default:
                    System.out.println("0 Rate");
        }

    }
}
