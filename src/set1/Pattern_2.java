package set1;

import java.util.Scanner;

public class Pattern_2 {

    public static void starPattern(int input){
        //outer loop will decide how many time excute inner loop
        for (int j=1; j<=input;j++){
            System.out.print(" ");
            for (int i=j; i<=input;i++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number.....\n");
        int input = sc.nextInt();
        starPattern(input);

    }
}

// for (int j=1; j<=input;j++){
//         for (int i=j; i<=input;i++){
//         System.out.print("* ");
//         }
//         System.out.println(" ");
//         }