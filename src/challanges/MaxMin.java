package challanges;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Size of Your Array : ");
        int size = input.nextInt();
        int[] numbers = new int[size];

        //Take input
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("Print Array : ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.print("Maximum Value : " + max);
        System.out.println();
        System.out.println("Minimum Value : " + min);
    }
}
