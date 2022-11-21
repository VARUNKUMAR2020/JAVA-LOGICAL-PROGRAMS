package com.logicalprograms;

import java.util.*;;

public class LogicalPrograms {
    public static void main(String[] args) {
        System.out.println("Logical Programs");
        System.out.println("Fibonacci series");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        int a = 0, b = 1, c = 0;
        System.out.print("First " + number + " terms: ");

        for (int integer = 1; integer <= number; integer++) {
            if (integer == 1)
                System.out.println(a);
            if (integer == 2)
                System.out.println(b);
            if (integer > 2) {
                c = a + b; // Next term is generated here.
                System.out.println(c);
                a = b; // Changing the value of existing integer to the next integer.
                b = c; // Changing the value of existing integer to the next integer.
            }
        }
    }
}
