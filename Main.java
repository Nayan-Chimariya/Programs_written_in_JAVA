package com.nayan;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final byte MONTH_IN_YEARS = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        int principal ;
        float annualInterestRate , monthlyInterestRate ;
        int timeInYears ;

        while (true) {
            System.out.print("Principal ($1k - $1M) : ");
            principal = scanner.nextInt();
            if(principal >= 1_000 && principal <= 1_000_000)
                break;
            System.out.println("Enter value between 1,000 and 1,000,000");
        }

        while(true) {
            System.out.print("Annual Interest Rate: ");
            annualInterestRate = scanner.nextFloat();
            if (annualInterestRate > 1 && annualInterestRate <= 30) {
                monthlyInterestRate = annualInterestRate / PERCENT / MONTH_IN_YEARS;
                break;
            }
            System.out.println("Enter value between 0 and 30");
        }


        while (true) {
            System.out.print("Period (Years) : ");
            timeInYears = scanner.nextInt();
            if(timeInYears >= 1 && timeInYears <= 30)
                break;
            System.out.println("Enter value between 1 and 30");
        }

        int numberOfPayments = timeInYears * MONTH_IN_YEARS;

        double Mortgage = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments) )
                                    / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        String formattedMortgage = NumberFormat.getCurrencyInstance().format(Mortgage);

        System.out.println("Mortgage : " + formattedMortgage );
    }

}
