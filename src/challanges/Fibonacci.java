package challanges;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Fibonacci Series");
        System.out.print("Enter Your Number up to which series has to be printed : ");
        int num = sc.nextInt();
        System.out.println("Here is Your Fibonacci series : ");
        printFibonacci(num);

    }

    public static void printFibonacci(int num){
        if (num < 0) return;
        System.out.print("0 ");
        if (num == 0) return;

        int first = 0, second = 1;
        while (first + second <= num){
            int third = first + second;
            System.out.print(third +" ");
            first = second;
            second = third;
        }

    }
}
