package arrays;

import java.awt.*;
import java.util.Scanner;

public class Additions {
    public static void main(String[] args) {

        int arr1 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Dimensions");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int r1[][] = new int[rows][cols];
        int c1[][] = new int[rows][cols];

//        1st matrix
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++) {
                System.out.println("Enter 1st Array");
               r1[i][j] = scanner.nextInt();
            }
        }

        //2nd array matrix
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++) {
                System.out.println("Enter 2nd Array");
                c1[i][j] = scanner.nextInt();
            }
        }

        //third array matrix
        int c2[][] = new int[rows][cols];

        for (int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                c2[i][j] = r1[i][j]+c1[i][j];
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++)
            System.out.print(c2[i][j]  + " ");
        }
        System.out.println();
    }
}
