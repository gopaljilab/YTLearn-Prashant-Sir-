package Learnings;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Name : ");
        String name = input.nextLine();
        System.out.println("Good Morning "+name);
        System.out.print(name+", Enter Your Age : ");
        int age = input.nextInt();
        System.out.println(name+" Your Age is "+age);
    }
}