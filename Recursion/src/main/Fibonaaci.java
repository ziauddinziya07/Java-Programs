package main;

import java.util.Scanner;

// Write a program to Print Fibonacci Series using recursion starting with 0 1.
public class Fibonaaci {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number (<20): ");
        int n = s.nextInt();

        System.out.println("The first " + n + " numbers of the Fibonacci Series are: \n");
        fibonacci(-1, 1, n);
    }

    static void fibonacci(int a, int b, int n) {

        int fib = a + b;
        System.out.print(fib + "\t");
        if(n == 1) {
            return;
        }
        fibonacci(b, fib, -- n);
    }
}
