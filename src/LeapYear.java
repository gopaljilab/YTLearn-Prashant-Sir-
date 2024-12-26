import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Welcome to Leap Year Calculator");
        System.out.print("Enter Year Which you want to Check : ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year != 100)){
            System.out.println("This year is Leap Year");
        }else {
            System.out.println("This is not a Leap Year");
        }

    }
}
