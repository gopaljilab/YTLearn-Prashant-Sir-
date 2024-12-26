package NumbersOperations;

import java.util.Scanner;

public class EvenOROdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Odd Even Checker!!");
        System.out.print("Enter Your Number : ");
        int number = input.nextInt();

        /* if (number % 2 == 0){
            System.out.println("Given Number Is Even!!");
        }else {
            System.out.println("Given Number Is Odd!!");
        }
        */
        if ((number & 1) == 1){
            System.out.println("Given Number Is Odd!!");
        }else {
            System.out.println("Given Number Is Even!!");
        }

    }
}
