package set1;

import java.util.Scanner;

public class TableExample {

    private static void displayTable(int input) {
        for (int i = 1; i<=10;i++) {
            int  tab = input*i;
            System.out.println(tab);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number.....\n");
        int input = sc.nextInt();
        displayTable(input);
    }


}
