package Learnings.Loop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number Printer !!");
        System.out.print("Enter Starting Number You Want to Print : ");
        int startNum = input.nextInt();
        System.out.print("Enter Last Number You Want to Print : ");
        int endingNum = input.nextInt();


        while(startNum <= endingNum){
            System.out.println(startNum);
            startNum
                    ++;
        }
    }
}
