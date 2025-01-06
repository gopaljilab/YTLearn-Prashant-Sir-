package Learnings;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        greetUser();
        int firstNum = getNumber();
        int secondNum = getNumber();

        int sum = firstNum + secondNum;
        System.out.println("Sum of the Number Is : " +sum);
    }

    public static int getNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int num = sc.nextInt();
        return num;
    }

    public static void greetUser(){
        System.out.println("Welcome, Adding Calculator");
    }
}
