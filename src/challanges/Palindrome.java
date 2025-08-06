package challanges;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome To Palindrome Number !!");
        System.out.print("Enter Your Number : ");
        int num = input.nextInt();

        int reverse = Reverse(num);

        if (reverse == num) {
            System.out.println("Your Number is Palindrome Number.");
        }else {
            System.out.println("Your Number is Not Palindrome Number.");
        }
    }

    public static int Reverse(int num){
        int newNum = 0;
        while (num > 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num = num / 10;
        }
        return newNum;
    }
}
