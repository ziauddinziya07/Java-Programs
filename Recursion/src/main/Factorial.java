package main;

// Write a program to find the Factorial of a number using recursion.
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number(< 15): ");
        int x = s.nextInt();

        System.out.println("Factorial of " + x + " is: " + factorial(x));
    }

    static int factorial(int x) {

        if (x == 0 || x == 1) return 1;
        return x * factorial(x - 1);
    }
}
