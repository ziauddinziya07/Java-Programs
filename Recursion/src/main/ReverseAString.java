package main;

import java.util.Scanner;

// Write a program to reverse a string using recursion.
public class ReverseAString {

    public static void main(String[] args) {

        Scanner  s = new Scanner(System.in);
        String str = s.next();

        System.out.println("Reverse of " + str + " is: " + reverse(str, str.length() - 1));
    }


    static String reverse(String s, int i) {

        if (i < 0) return "";
        return String.valueOf(s.charAt(i)) + reverse(s, -- i);
    }
}
