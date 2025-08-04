package challanges;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Avg And Sum Calculator");
        System.out.print("Please Enter Number Of Elements : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter Element No." + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
        int sum = 0;
        float avg;
        int GetSum = GetSum(sum, arr);
        System.out.println("Sum:" + GetSum);
        avg = (float) GetSum / arr.length - 1;
        System.out.println(avg);
    }

    public static int GetSum(int sum, int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
