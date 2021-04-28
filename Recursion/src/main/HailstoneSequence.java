package main;

import java.util.Scanner;

// Write a program to find the Hailstone Sequence of a given number up to 1.
public class HailstoneSequence {

    static int l = 1; // Hailstone sequence length
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");

        int n = s.nextInt();
        System.out.println("The Hailstone sequence for the number " + n + " is: ");
        System.out.println("\nThe length of the sequence is: " + printHailstone(n));
    }

    static int printHailstone(int n) {

        System.out.print(n + "  ");
        if (n == 1) return l;
        l ++;
        if (n % 2 == 0)     return printHailstone(n /= 2);
        else    return printHailstone(n = 3 * n + 1);
    }
}
