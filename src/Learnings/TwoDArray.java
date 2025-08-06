package Learnings;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        System.out.println("Enter Rows, Colum?");
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int cols = input.nextInt();

        int[][] arr = new int[rows][cols];
        System.out.println("Enter Elements of matrix :");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Print Matrix");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
