package patterns;

import java.util.Scanner;

public class rightHalfPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We are Here to Print Pattern\n ");
        System.out.println("Please Enter the no. of Rows: ");
        int rows = input.nextInt();
        printPattern(rows);
    }

    public static void printPattern(int maxRows){
        int rows = 0;
        while (rows < maxRows){
            System.out.print("*");
            int i = 0;
            while (i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }

}
