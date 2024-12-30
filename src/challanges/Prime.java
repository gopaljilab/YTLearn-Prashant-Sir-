package challanges;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome To Prime ");
        System.out.print("Enter your Number : ");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        if (isPrime){
            System.out.println("Your Number is Prime");
        }else {
            System.out.println("Your Number is Not Prime");
        }
    }

    public static boolean isPrime(int num){
        int i = 2;
        while (i < num){
            if (num % i == 0){
                return false;
            }
            i++;
        }

        return true;
    }
}
