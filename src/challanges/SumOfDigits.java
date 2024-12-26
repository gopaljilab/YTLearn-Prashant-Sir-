package challanges;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Sum of Digits!!");
        System.out.print("Enter A Number : ");
        int num = sc.nextInt();
        int sum = sumOfDigit(num);
        System.out.print("Sum is Digits: "+sum);
    }

    public static int sumOfDigit(int num){
        int sum = 0;
        while (num > 0){
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }
}

