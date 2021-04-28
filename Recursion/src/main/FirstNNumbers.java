package main;

import java.util.Scanner;


// Write a program to print first n natural numbers using recursion.
public class FirstNNumbers {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("The first " + n + " numbers: \n");
        print(1, n);
    }

    static void print(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.print(i + "\t");
        print(++ i, n);
    }
}
