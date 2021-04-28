package main;

import java.util.Scanner;

// Write a program to calculate the power of any number using recursion.
public class PowerOfNumber {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = 5, i = 0;  // n ^ i

        System.out.println(n + "^" + i + " = " + power(n, i));
    }

    static int power(int n, int i) {

        if (i == 0) return  1;
        return n * power(n, -- i);
    }
}
