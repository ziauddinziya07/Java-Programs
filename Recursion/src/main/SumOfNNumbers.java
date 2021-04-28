package main;


import java.util.Scanner;

// Write a program to calculate the sum of numbers from 1 to n using recursion.
public class SumOfNNumbers {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("The Sum of First " + n + " numbers is: " + sum(n));
    }

    static int sum(int n) {

        if (n == 1) return 1;
        return n + sum(-- n);
    }
}
