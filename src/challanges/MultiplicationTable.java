package challanges;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Multiplication World!!");
        System.out.print("Enter A Number : ");
        int num = sc.nextInt();
        printMultiplicationTable(num);
    }

    public static void printMultiplicationTable(int num){
        for (int i = 1; i<=10; i++){
            System.out.println(num+ " X "+ i + " = "+ num*i);
        }
    }
}
