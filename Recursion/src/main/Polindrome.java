package main;

import java.util.Scanner;

public class Polindrome {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.next();

        System.out.println("The given String " + str + (isPolidrome(str.toLowerCase()) ? " is a Polindrome." : " is not a Polidronme"));
    }

    static boolean isPolidrome(String s) {

        if (s.length() <= 1) return true;
        if (s.charAt(0) == s.charAt(s.length() - 1)) return isPolidrome(s.substring(1, s.length() - 1));
        return false;
    }

}
