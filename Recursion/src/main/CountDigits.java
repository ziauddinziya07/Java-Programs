package main;

import java.util.Scanner;

// Write a program to count the digits of a given number using recursion.
public class CountDigits {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        System.out.println(countDigits(x));
    }

    static int countDigits(int x) {

        if (x == 0) {
            return 0;
        }
        x /= 10;
        return 1 + countDigits(x);
    }
}
