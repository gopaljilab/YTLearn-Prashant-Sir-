package Formulas;
import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Compound Interest Calculator!!!");

        System.out.print("Enter Your Principle Amount : ");
        int principle = sc.nextInt();
        System.out.print("Enter Your Rate of Interest : ");
        float rate = sc.nextFloat();
        System.out.print("Enter the Time (year of borrowing) : ");
        float time = sc.nextFloat();

       double compoundInterest = principle * Math.pow((1+rate/100), time);
        System.out.println("Your Compound Interest is : " + compoundInterest);
    }
}
