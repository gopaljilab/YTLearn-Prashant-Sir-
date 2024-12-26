package challanges;

import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Odd Sum World!!");
        System.out.print("Enter The Number : ");
        int num = sc.nextInt();
        int sum = printOddSum(num);
        System.out.println("OddSum till " +num+ " is: " +sum);

    }

    public static int printOddSum(int num){
        int sum = 0;
        for (int i = 1; i <= num; i+=2) {
            sum += i;
        }
        return sum;
    }
}
