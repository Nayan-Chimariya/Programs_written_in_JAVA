package com.nayan;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("""
                Enter:
                '1' for area and perimeter of rectangle
                '2' for area and circumference of circle
                '3' for interest and amount
                '4' to exit
                :""");

        int userChoice = scanner.nextInt();

        switch (userChoice) {
            case 1 -> {
                System.out.print("Enter length and breadth of rectangle: ");
                int length = scanner.nextInt(), breadth = scanner.nextInt();
                int areaOfRectangle = length * breadth;
                int perimeter = 2 * (length + breadth);
                System.out.printf("The area is %d and the perimeter is %d", areaOfRectangle, perimeter);
            }
            case 2 -> {
                System.out.print("Enter radius: ");
                int radius = scanner.nextInt();
                final float PI = 3.14f;
                float circumference = 2 * PI * radius;
                float areaOfCircle = PI * (float) Math.pow(radius, 2);
                System.out.printf("The area of circle is %.2f and circumference is  %.2f", areaOfCircle, circumference);
            }
            case 3 -> {
                System.out.print("Enter principal amount rate and time(in years): ");
                float principal = scanner.nextFloat(), rate = scanner.nextFloat(), time = scanner.nextFloat();
                float interest = (principal * time * rate) / 100;
                float amount = principal + interest;
                System.out.printf("The interest is %.2f and amount is %.2f", interest, amount);
            }
            case 4 -> {
                //System.exit(0);
            }
        }
    }
}
