package com.nayan;

import java.util.Scanner;

public class caseChanger {
    public static void main(String[] args) {
        // character case change.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char yourLetter = scanner.next().charAt(0);

        char upper = Character.toUpperCase(yourLetter);
        char lower = Character.toLowerCase(yourLetter);

        if(yourLetter == upper)
            System.out.println(lower);

        else
            System.out.println(upper);

    }
}
