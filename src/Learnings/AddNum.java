package Learnings;

import java.util.Scanner;

public class AddNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your First Number : ");
        int firstNum = input.nextInt();
        System.out.print("Enter Your Second Number : ");
        int secondNum = input.nextInt();
        System.out.println("First Number is " + firstNum);
        System.out.println("Second Number is " + secondNum);
        int sum = firstNum + secondNum;
        System.out.println("Sum of Yours Number " + sum);
    }
}
