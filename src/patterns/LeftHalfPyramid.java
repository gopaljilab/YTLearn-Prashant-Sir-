package patterns;

import java.util.Scanner;

public class LeftHalfPyramid {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("We Are Here To print Pattern \n");
            System.out.println("Enter the No. of Rows: ");
            int rows = input.nextInt();
            printPattern(rows);
        }
        public static void printPattern(int maxRows){
            for (int rows = maxRows; rows > 0; rows--){
                for (int j =0; j < rows-1; j++){
                    System.out.print("  ");
                }
                //stars
                for (int i = 0; i <= maxRows-rows; i++){
                    System.out.print("* ");
                }
                System.out.println();
            }
    }
}
