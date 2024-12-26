package Formulas;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To Find the Area of a Triangle");

        System.out.print("Let's Give the Length of base :");
        double base = sc.nextInt();
        System.out.print("Let's Give the Length of Height :");
        double height = sc.nextInt();

        double area = 0.5*(base * height);
        System.out.println("Area Of this Triangle : " +area);
    }
}
