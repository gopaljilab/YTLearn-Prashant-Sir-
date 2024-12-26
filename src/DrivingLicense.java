import java.util.Scanner;

public class DrivingLicense {
    public static void main(String[] args) {
        System.out.println("Welcome To Driving License Web\n");

        System.out.print("Enter Your Age : ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        // Check Weather The Age is Less than 18 or not for Eligible to apply the Driving License
        if (age >= 18){
            System.out.println("Gaadi Chala Sakte ho");
            System.out.println("Driving License Ke liye Apply Kardo");
        }else {
            System.out.println("Beta Cycle abhi Chalao");
        }
    }
}
