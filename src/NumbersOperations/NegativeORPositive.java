package NumbersOperations;

import java.util.Scanner;

public class NegativeORPositive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Number Checker !!!!");
        System.out.println("Enter Your Number : ");
        int number = input.nextInt();

        if (number == 0){
            System.out.println("The Number Given Is Zero");
        } else if (number < 0) {
            System.out.println("The Number Given Is Negative");
        }else System.out.println("The Given Number Is Positive");
    }
}
