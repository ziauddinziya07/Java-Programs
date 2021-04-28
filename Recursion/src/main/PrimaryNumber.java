package main;

import java.util.Scanner;

// Write a program check a number is a prime number or not using recursion.
public class PrimaryNumber {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int x = s.nextInt();

        System.out.println("The given number " + x + " is " + (isPrime(x, x / 2 + 1) ? "a Prime Number." : "not a Prime Number."));
    }

    static boolean isPrime(int x, int d) {
        if (x <= 2) return x == 2 ? true: false;
        if (x % d == 0) return false;
        if (d == 2) return true;
        return isPrime(x, -- d);
    }
}

