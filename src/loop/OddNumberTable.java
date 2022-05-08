package loop;

import java.util.Scanner;

public class OddNumberTable {
    public static void main(String[] args) {

        int result = 0;
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        num = scanner.nextInt();
        for (int i = 1;i<=num;i++){
            if(i % 2!=0){
                for(int j=1;j<=10;j++){
                    result = i*j;
                    System.out.print(" " + result + " " );
                }
                System.out.println();
            }
        }
    }
}
