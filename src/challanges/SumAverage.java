package challanges;

import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Size of Your Array");
        int size = input.nextInt();

        System.out.println("Enter Elements");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        float average = (float) sum / arr.length;
        System.out.println("Sum : " + sum);
        System.out.println("Average : " + average);
    }
}
