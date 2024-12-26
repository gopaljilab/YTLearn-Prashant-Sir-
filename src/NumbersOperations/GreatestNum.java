package NumbersOperations;

import java.util.Scanner;

public class GreatestNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Greatest Number Checker !!");
        System.out.print("Enter Three Numbers : ");
        int firstNum = input.nextInt();
        int secondNum = input.nextInt();
        int thirdNum = input.nextInt();

        if (firstNum > secondNum && firstNum > thirdNum){
            System.out.println(" Number " + firstNum +" is Greater");
        } else if (secondNum > thirdNum){
            System.out.println(" Number " + secondNum +" is Greater");
        }else {
            System.out.println(" Number " + thirdNum +" is Greater");
        }
    }
}
