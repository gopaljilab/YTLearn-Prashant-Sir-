package challanges;

import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome To Reverse the Digit !!");
        System.out.print("Enter Your Number : ");
        int num = input.nextInt();

        int reverse = Reverse(num);
        System.out.println("Your Reversed Number : "+reverse);
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
