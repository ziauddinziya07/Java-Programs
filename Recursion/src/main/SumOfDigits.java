package main;

import java.util.Scanner;

//  Write a program to find the sum of digits of a number using recursion.
public class SumOfDigits {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        System.out.println("Sum of Digits: " + sumOfDigits(x));
    }

    static int sumOfDigits(int x) {
        if (x == 0) return 0;
        int temp = x % 10;
        x /= 10;
        return temp + sumOfDigits(x);
    }
}
