import java.util.Scanner;

public class GradeCalc {
    public static void main(String[] args) {
        System.out.println("Welcome To Grade Calculator!!");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Grade In (%) : ");
        int marks = input.nextInt();

        if (marks >= 90){
            System.out.println("Great, You're Grade is A");
        }else if (marks >= 75){
            System.out.println("Amazing, You're Grade is B");
        }else if (marks >= 60){
            System.out.println("Going Well, You're Grade is C");
        }else if (marks >= 30){
            System.out.println("You need to work Harder, You're Grade is D");
        } else {
            System.out.println("You're Failed, You're Grade is F"
            );
        }
    }
}
