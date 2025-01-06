package challanges;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Armstrong Number");
        System.out.print("Enter Your Number: ");
        int num = sc.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if(isArmstrong){
            System.out.println("Your number is Armstrong");
        } else {
        System.out.println("Your number is Not Armstrong");
        }

    }

    public static boolean isArmstrong(int num){
        int noOfDigits = noOfDigit(num);
        int numCopy = num;
        int finalNumber = 0;
        while (num>0){
            int lastDigit = num % 10;
            num /= 10;
            finalNumber += power(lastDigit, noOfDigits);
        }
        return finalNumber ==  numCopy;
    }

    public static int power(int num1, int num2){
        int result = num1;
        int i = 1;
        while(i < num2){
            result *= num1;
            i++;
        }
        return result;
    }

    public static int noOfDigit(int num){
        int digit = 0;
        while (num>0){
            digit++;
            num/=10;
        }
        return digit;
    }
}


//Input: 153
//Number of digits: 3
//Calculation:1^3+5^3+3^3 = 1+125+27=153
//Result: Armstrong Number.