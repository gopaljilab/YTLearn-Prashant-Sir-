import java.util.Scanner;

public class DiscountCalc {
    public static void main(String[] args) {
        System.out.println("Welcome to the Discount Calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int age = input.nextInt();
        System.out.print("Are You A Female? (true/false) : ");
        boolean isFemale = input.nextBoolean();
        
        if (age <= 5){
            System.out.println("You're Child");
            System.out.println("You're Eligible for 75% Discount");
        } else if (isFemale) {
            System.out.println("You're Eligible For 50% Discount");
        } else if (age > 50) {
            System.out.println("You're Eligible For 25% Discount");
        }else {
            System.out.println("Not Eligible for Any Discount");
        }
    }
}
