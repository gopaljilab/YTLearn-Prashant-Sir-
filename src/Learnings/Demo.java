package Learnings;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your First Number : ");
        float firstNum = sc.nextFloat();

        System.out.println("Enter Your Second Number : ");
        float SecondNum = sc.nextFloat();

        float product = firstNum * SecondNum;
        System.out.println("Product is :" +product);

    }

    public static class Escape {
        public static void main(String[] args) {
            System.out.println("* \n* * \n* * * \n* * * * \n* * * * * ");
            System.out.println();
            System.out.println();
            System.out.println("* * * * *\n* * * *\n* * *\n* *\n*");
            System.out.println();
            System.out.println();
            System.out.println("    *\n   * *\n  * * *\n * * * *\n* * * * *");
        }
    }
}
