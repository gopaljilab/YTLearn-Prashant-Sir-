package Formulas;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's Find the Simple Interest!");

        System.out.print("Enter The Principle Amount :");
        int principle = sc.nextInt();
        System.out.print("Enter The Rate : ");
        int rate = sc.nextInt();
        System.out.print("Enter the time(in Months) : ");
        int time = sc.nextInt();

        int SI = (principle * rate * time) /100;
        System.out.println("Simple Interest Of Given Data : " + SI);

    }
}
