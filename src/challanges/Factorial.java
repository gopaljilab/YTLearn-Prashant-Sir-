package challanges;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Factorial World!!");
        System.out.print("Enter A Number : ");
        int num = sc.nextInt();
        long fact = factorial(num);
        System.out.println("Factorial is: " +fact);
    }

    public static long factorial(int num){
        if (num < 2){
            return 1;
        }
        long fact = 1;
        for (int i = 2; i <= num; i++){
            fact *= i; 
        }
        return fact;
    }
}
