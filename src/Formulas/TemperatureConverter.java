package Formulas;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Temperature Converter !! \n");
        System.out.print("Enter Temperature in Fahrenheit : ");
        float fahrenheit = input.nextFloat();
        float celsius = (fahrenheit - 32) * 5/9;
        System.out.println("Temperature in Celsius : " +celsius);
    }
}
