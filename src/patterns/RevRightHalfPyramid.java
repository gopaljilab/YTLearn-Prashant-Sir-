package patterns;

import java.util.Scanner;

public class RevRightHalfPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We Are Here To print Pattern \n");
        System.out.println("Enter the No. of Rows: ");
        int rows = input.nextInt();
        printPattern(rows);
    }
    public static void printPattern(int maxRows){
        for (int rows = maxRows; rows > 0; rows--){
            for (int i = 0; i < rows; i++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}




        //        int rows = maxRows;
//        while (rows > 0){
//            int i = 0;
//            while (i < rows){
//                System.out.print(" *");
//                i++;
//            }
//            System.out.println();
//            rows--;
//        }

