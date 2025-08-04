package challanges;

import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {12, 24, 86, 34, 53, 58, 54, 27, 85, 35, 86};
        System.out.println("Welcome to Array Searching\n");
        System.out.print("Enter Number you want to search: ");
        int num = input.nextInt();
        boolean isFound = isFound(arr,num);
        if (true){
            System.out.println("The Number Is Found in Array");
        }else {
            System.out.println("Number Is Not Found In Array");
        }
    }

    public static boolean isFound(int[] arr, int num){
        for (int index = 0; index < arr.length; index++){
            if (arr[index] == num){
                return true;
            }
        }
        return false;
    }
}
