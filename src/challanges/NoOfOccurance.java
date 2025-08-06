package challanges;

import java.util.Scanner;

public class NoOfOccurance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Size Of Array : ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter Elements");
        for (int i=0; i<size; i++){
            arr[i] = input.nextInt();
        }

        System.out.println("Enter the Number to Check it's Occurrence ");
        int num = input.nextInt();
        int occurrence =0;
        System.out.println();
        for (int i=0; i< arr.length;i++){
            System.out.print(arr[i]+ " ");
            if (num == arr[i]){
               occurrence += 1;
           }
        }

        System.out.println();
        System.out.println(num + " Occurrence is " + occurrence);
    }

    public static void input(){

    }
}
