package Learnings;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your First Number A = ");
        double firstNum = input.nextDouble();
        System.out.print("Enter Your Second Number b = ");
        double secondNum = input.nextDouble();
        double add = firstNum + secondNum;
        double div = firstNum / secondNum;
        double sub = firstNum - secondNum;
        double mod = firstNum % secondNum;
        double mul = firstNum * secondNum;
        System.out.println("Addition Of These Two Number = " +add);
        System.out.println("Subtraction Of These Two Number = " +sub);
        System.out.println("Multiplication Of These Two Number = " +mul);
        System.out.println("Divide Of These Two Number = " +div);
        System.out.println("Modulus Of These Two Number = " +mod);
    }
}
