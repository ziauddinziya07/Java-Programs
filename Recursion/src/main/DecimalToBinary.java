package main;

import java.util.Scanner;

// Write a program convert a decimal number to binary using recursion.
public class DecimalToBinary {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int x = s.nextInt();

        System.out.println("The Binary format of " + x + " is: " + toBinary(x));
    }

    static String toBinary(int x) {

        if (x == 0) return "";
        String temp = String.valueOf(x % 2);
        return  toBinary(x / 2) + temp;
    }
}
