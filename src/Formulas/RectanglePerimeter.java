package Formulas;

import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give The Rectangle Sides");

        System.out.println("Enter Side1 : ");
        int side1 = sc.nextInt();
        System.out.println("Enter Side2 : ");
        int side2 = sc.nextInt();
        System.out.println("Enter Side2 : ");
        int side3 = sc.nextInt();
        System.out.println("Enter Side4 : ");
        int side4 = sc.nextInt();

        int perimeter = side1 + side2 + side3 + side4;
        System.out.println("Perimeter Of Rectangle : " + perimeter);
    }
}
