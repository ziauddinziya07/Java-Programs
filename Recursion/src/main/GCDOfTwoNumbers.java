package main;

import java.util.Scanner;

// Write a program  to find GCD of two numbers using recursion.
public class GCDOfTwoNumbers {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter two Numbers: ");
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
    }

    static int gcd(int a, int b) {

        if (a % b == 0) return b;
        if (b % a == 0) return a;
        if (a > b) return gcd(a % b, b);
        return gcd(a, b % a);
    }
}
