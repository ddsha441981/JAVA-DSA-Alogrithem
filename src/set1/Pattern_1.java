package set1;

import java.util.Scanner;

public class Pattern_1 {

    public static void printPatterns(int input) {
//        outer loop for row

        for(int j=1;j<=input;j++){
            for (int i=1;i<=input;i++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter desire number \n...");
        int input = sc.nextInt();
        printPatterns(input);
    }
}
