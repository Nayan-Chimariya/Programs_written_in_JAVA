package com.nayan;

import java.util.Scanner;

public class areaOfMultipleTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Enter r for right angled triangle
                Enter e for equilateral triangle
                Enter i for isosceles triangle
                Enter s for scalene triangle:\s""");
        char typeOfTriangle = scanner.next().charAt(0);

        switch (typeOfTriangle) {

            case 'r' -> {
                System.out.print("Enter base length: ");
                float base = scanner.nextFloat();

                System.out.print("Enter perpendicular length: ");
                float perpendicular = scanner.nextFloat();

                float areaOfRightAngledTriangle = 0.5f * base * perpendicular;

                System.out.println("The area is: " + areaOfRightAngledTriangle);
            }


            case 'e' -> {
                System.out.print("Enter the equal length: ");
                float equalLength = scanner.nextFloat();

                double areaOfEquilateralTriangle = (Math.sqrt(3) / 4) * Math.pow(equalLength, 2);

                System.out.printf("The area is %.2f", areaOfEquilateralTriangle);
            }


            case 'i' -> {
                System.out.print("Enter length of same side: ");
                float equalLength = scanner.nextFloat();

                System.out.print("Enter length of the other side: ");
                float base = scanner.nextFloat();

                float height = (float) Math.sqrt(Math.pow(equalLength, 2) - (base / 4));

                double area = 0.5f * base * height;

                System.out.printf("The area is %.2f", area);
            }

            case 's' -> {
                System.out.print("Enter the sides (a,b,c): ");
                float side1 = scanner.nextFloat(), side2 = scanner.nextFloat(), side3 = scanner.nextFloat();

                float semiPerimeter = (side1 + side2 + side3) / 2;

                double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));

                System.out.printf("The area is %.2f", area);
            }

            default ->
                    System.out.println("Invalid Choice");
        }
    }
}

